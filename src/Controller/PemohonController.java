/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Entity.SubKriteria;
import java.sql.*;
import DBConn.DatabaseConnection;
import Entity.DataPemohon;
import Entity.Kriteria;
import Entity.KriteriaWarga;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class PemohonController {

    private Connection konek = null;
    private static PemohonController pemohonKontrol;

    public PemohonController() {
    }

    public PemohonController(Connection konek) {
        this.konek = konek;
    }

    public static PemohonController getPemohonKontrol() throws SQLException {
        DatabaseConnection koneksi = new DatabaseConnection();
        if (pemohonKontrol == null) {
            pemohonKontrol = new PemohonController(koneksi.getConnection());
        }
        return pemohonKontrol;

    }

    public void insertData(DataPemohon pemohon) throws SQLException {

        String nkk = pemohon.getNKK();
        String nama = pemohon.getNama_kepala_keluarga();
        String alamat = pemohon.getAlamat();
        String rtrw = pemohon.getRt_rw();
        String desa = pemohon.getDesa();
        double hasil = pemohon.getHasilKeputusan();

        String sql =
                "insert into warga values ('" + nkk + "','" + nama + "','" + alamat + "','" + rtrw + "','" + desa + "','" + hasil + "')";
        Statement statement = DatabaseConnection.getConnection().createStatement();
        statement.executeUpdate(sql);

    }

    public void updtaeData(DataPemohon pemohon) throws SQLException {
        String nkk = pemohon.getNKK();
        String nama = pemohon.getNama_kepala_keluarga();
        String alamat = pemohon.getAlamat();
        String rtrw = pemohon.getRt_rw();
        String desa = pemohon.getDesa();
//        String hasil = pemohon.getHasilKeputusan();

        String sql =
                "UPDATE warga SET nama_kepala_keluarga='" + nama + "', alamat  = '" + alamat + "', rt_rw  = '" + rtrw + "', desa  = '" + desa + "'  where NKK = '" + nkk + "'";
        Statement statement = DatabaseConnection.getConnection().createStatement();
        statement.executeUpdate(sql);
    }

    public void deleteData(DataPemohon pemohon) throws SQLException {
        PreparedStatement prepare = null;
        String kode = pemohon.getNKK();
        String sql = "delete from warga where NKK = ?";
        prepare = konek.prepareStatement(sql);
        prepare.setString(1, kode);
        prepare.executeUpdate();
    }

    public List<DataPemohon> getAll() throws SQLException {
        Statement st = DatabaseConnection.getConnection().createStatement();
        ResultSet rs = st.executeQuery("select * from warga");
        List<DataPemohon> list = new ArrayList<DataPemohon>();
        while (rs.next()) {
            DataPemohon o = new DataPemohon();
            o.setNKK(rs.getString("nkk"));
            o.setNama_kepala_keluarga(rs.getString("nama_kepala_keluarga"));
            o.setAlamat(rs.getString("alamat"));
            o.setRt_rw(rs.getString("rt_rw"));
            o.setDesa(rs.getString("desa"));
            list.add(o);
        }
        return list;
    }

    public List<DataPemohon> getAllWithKriteria() throws SQLException {
        Statement st = DatabaseConnection.getConnection().createStatement();
        ResultSet rs = st.executeQuery("select * from warga");
        List<DataPemohon> list = new ArrayList<DataPemohon>();
        while (rs.next()) {
            DataPemohon o = new DataPemohon();
            o.setNKK(rs.getString("nkk"));
            o.setNama_kepala_keluarga(rs.getString("nama_kepala_keluarga"));
            o.setAlamat(rs.getString("alamat"));
            o.setRt_rw(rs.getString("rt_rw"));
            o.setDesa(rs.getString("desa"));
            Statement stKriteria = DatabaseConnection.getConnection().createStatement();
            String sql=(""
                    + "select sub.*,p.*,k.*,sub.bobot_subkriteria as SKOR_KRITERIA "
                    + "from  kriteria k "
                    + "left join poin_kriteria_warga p on p.id_kriteria=k.id_kriteria and nkk='" + o.getNKK() + "'"+
                    "left join subkriteria sub on sub.id_kriteria = p.id_kriteria " +
                    "AND sub.id_subkriteria = p.id_subkriteria "
                     );
            System.out.println(sql);
            ResultSet rsKriteria = stKriteria.executeQuery(sql);
            List<KriteriaWarga> kriteriaWargas = new ArrayList<KriteriaWarga>();
            while (rsKriteria.next()) {
                Kriteria k = new Kriteria();
                k.setId_kriteria(rsKriteria.getString("Id_Kriteria"));
                k.setNama_kriteria(rsKriteria.getString("nama_kriteria"));
                k.setBobot_kriteria(rsKriteria.getDouble("bobot_kriteria"));

                KriteriaWarga kw = new KriteriaWarga();
                kw.setKriteria(k);
                kw.setIdSubkriteria(rsKriteria.getString("id_subkriteria"));
                kw.setSkor(rsKriteria.getDouble("SKOR_KRITERIA"));
                kw.setNamaSubkriteria(rsKriteria.getString("nama_subkriteria"));
                kriteriaWargas.add(kw);
            }
            o.setKriteriaWargaList(kriteriaWargas);
            list.add(o);
        }
        return list;
    }

    public void simpanKriteriaPemohon(String nkk, String id_kriteria, String id_subkriteria){
        PreparedStatement prepare = null;
        ResultSet rs = null;
        
        String sql = "INSERT INTO poin_kriteria_warga VALUES ('" + nkk + "','" + id_kriteria + "','" + id_subkriteria + "')";
        try {
            prepare = konek.prepareStatement(sql);
            prepare.executeUpdate();
        } catch (SQLException ex) {
            sql = "update poin_kriteria_warga set id_subkriteria='"+id_subkriteria+"' where nkk='" + nkk + "' and id_kriteria='" + id_kriteria + "'";
//            System.out.println(sql);
            try {
                prepare = konek.prepareStatement(sql);
                prepare.executeUpdate();
            } catch (SQLException ex1) {
            }
        }
        


    }

    public DataPemohon getById(String id) throws SQLException, Exception {
        PreparedStatement ps = DatabaseConnection.getConnection().prepareStatement("select * from warga where NKK like ?");
        ps.setString(1, "%" + id + "%");
        ResultSet rs = ps.executeQuery();
        DataPemohon data = new DataPemohon();
        while (rs.next()) {

            data.setNKK(rs.getString("nkk"));
            data.setNama_kepala_keluarga(rs.getString("nama_kepala_keluarga"));
            data.setAlamat(rs.getString("alamat"));
            data.setRt_rw(rs.getString("rt_rw"));
            data.setDesa(rs.getString("desa"));

        }
        return data;
    }

    public DataPemohon getWithKriteriaById(String id) throws SQLException, Exception {
        KriteriaController kriteriacontrol = new KriteriaController();
        PreparedStatement ps = DatabaseConnection.getConnection().prepareStatement("select * from warga where NKK like ?");
        ps.setString(1, "%" + id + "%");
        ResultSet rs = ps.executeQuery();
        DataPemohon data = new DataPemohon();
        while (rs.next()) {

            data.setNKK(rs.getString("nkk"));
            data.setNama_kepala_keluarga(rs.getString("nama_kepala_keluarga"));
            data.setAlamat(rs.getString("alamat"));
            data.setRt_rw(rs.getString("rt_rw"));
            data.setDesa(rs.getString("desa"));

        }

        data.setKriteriaList(new LinkedList<Kriteria>());
        ps = DatabaseConnection.getConnection().prepareStatement("select * from poin_kriteria_warga where NKK like ? ");
        ps.setString(1, "%" + id + "%");
        rs = ps.executeQuery();
        while (rs.next()) {
            Kriteria kriteria = kriteriacontrol.getByIdKriteria(rs.getString(2));
            //  kriteria.setSubkriteria((LinkedList<SubKriteria>) kriteriacontrol.getSubKriteriaById(kriteria.getId_kriteria()));
            data.getKriteriaList().add(kriteria);
        }

        return data;
    }

    public DataPemohon getByIdWithKriteria(String id) throws SQLException {
        Statement st = DatabaseConnection.getConnection().createStatement();
        ResultSet rs = st.executeQuery("select * from warga where NKK like '" + id+"'");

        DataPemohon o = new DataPemohon();
        while (rs.next()) {
            o.setNKK(rs.getString("nkk"));
            o.setNama_kepala_keluarga(rs.getString("nama_kepala_keluarga"));
            o.setAlamat(rs.getString("alamat"));
            o.setRt_rw(rs.getString("rt_rw"));
            o.setDesa(rs.getString("desa"));
            Statement stKriteria = DatabaseConnection.getConnection().createStatement();
            ResultSet rsKriteria = stKriteria.executeQuery(""
            +"SELECT k.*, s.nama_subkriteria, p.skor_kriteria,s.bobot_subkriteria as SKOR_KRITERIA"
                    + " FROM kriteria k "
                    +"JOIN subkriteria s ON k.id_kriteria = s.id_kriteria "
                    +"JOIN poin_kriteria_warga p ON k.id_kriteria = p.id_kriteria "
                        +"AND s.id_subkriteria = p.id_subkriteria " 
                    +"WHERE p.id_kriteria = s.id_kriteria "
                        + "AND p.NKK like '"+o.getNKK()+"'") ;
            List<KriteriaWarga> kriteriaWargas = new ArrayList<KriteriaWarga>();
            while (rsKriteria.next()) {
                Kriteria k = new Kriteria();
                k.setId_kriteria(rsKriteria.getString("Id_Kriteria"));
                k.setNama_kriteria(rsKriteria.getString("nama_kriteria"));
                k.setBobot_kriteria(rsKriteria.getDouble("bobot_kriteria"));
                SubKriteria sub = new SubKriteria();
                sub.setNama_subkriteria(rsKriteria.getString("nama_subkriteria"));
                k.addSubkriteria(sub);

                KriteriaWarga kw = new KriteriaWarga();
                kw.setKriteria(k);
                kw.setIdSubkriteria(rsKriteria.getString("id_subkriteria"));
                kw.setSkor(rsKriteria.getDouble("SKOR_KRITERIA"));
                kw.setNamaSubkriteria(rsKriteria.getString("nama_subkriteria"));
                kriteriaWargas.add(kw);
            }
            o.setKriteriaWargaList(kriteriaWargas);
        }
        return o;
    }
    public boolean updateHasilKeputusan(DataPemohon dp){
        String sql =
                "update warga set hasil_keputusan='"+dp.getHasilKeputusan()+"' where nkk='"+dp.getNKK()+"'";
        try {
            Statement statement = DatabaseConnection.getConnection().createStatement();
            return statement.executeUpdate(sql)>0;
        } catch (SQLException ex) {
            Logger.getLogger(PemohonController.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }
}
