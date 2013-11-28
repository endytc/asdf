/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DBConn.DatabaseConnection;
import java.sql.*;
import java.sql.SQLException;
import Entity.Kriteria;
import Entity.KriteriaWarga;
import Entity.SubKriteria;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class KriteriaController {

    private Connection konek = null;
    private static KriteriaController kriteriaKontrol;

    public KriteriaController() {
    }

    public KriteriaController(Connection konek) {
        this.konek = konek;
    }

    public static KriteriaController getKriteriaKontrol() throws SQLException {
        DatabaseConnection koneksi = new DatabaseConnection();
        if (kriteriaKontrol == null) {
            kriteriaKontrol = new KriteriaController((Connection) koneksi.getConnection());
        }
        return kriteriaKontrol;
    }

    public void insertData(Kriteria dataKriteria) throws SQLException {
        String kode_kriteria = dataKriteria.getId_kriteria();
        String nama_kriteria = dataKriteria.getNama_kriteria();
        Double bobot_kriteria = dataKriteria.getBobot_kriteria();


        //insert kriteria//
        String sql1 =
                "insert into kriteria values ('" + kode_kriteria + "','" + nama_kriteria + "','" + bobot_kriteria + "')";

        java.sql.Statement statement = DatabaseConnection.getConnection().createStatement();
        statement.executeUpdate(sql1);
        //insert subkriteria
        for (int i = 0; i < dataKriteria.getSubkriteria().size(); i++) {
            SubKriteria temp = dataKriteria.getSubkriteria().get(i);

            String sql2 =
                    "insert into subkriteria values ('" + temp.getId_subkriteriakriteria() + "','" + temp.getNama_subkriteria() + "','" + temp.getBobot_subkriteria() + "','" + kode_kriteria + "')";
            statement.executeUpdate(sql2);

        }
    }

    public List<Kriteria> getAllKriteria() throws SQLException {
        Statement st = (Statement) DatabaseConnection.getConnection().createStatement();
        ResultSet rs = st.executeQuery("select * from kriteria");
        List<Kriteria> list = new ArrayList<Kriteria>();
        while (rs.next()) {
            Kriteria o = new Kriteria();
            o.setId_kriteria(rs.getString("Id_Kriteria"));
            o.setNama_kriteria(rs.getString("nama_kriteria"));
            o.setBobot_kriteria(rs.getDouble("bobot_kriteria"));
            list.add(o);
        }
        return list;
    }

    public List<SubKriteria> getAllSubKriteria() throws SQLException {
        Statement st = (Statement) DatabaseConnection.getConnection().createStatement();
        ResultSet rs = st.executeQuery("select * from subkriteria");
        List<SubKriteria> list = new ArrayList<SubKriteria>();
        while (rs.next()) {
            SubKriteria o = new SubKriteria();
            o.setId_subkriteriakriteria(rs.getString("id_subkriteria"));
            o.setNama_subkriteria(rs.getString("nama_subkriteria"));
            o.setBobot_subkriteria(rs.getDouble("bobot_subkriteria"));
            list.add(o);
        }
        return list;
    }

    public List<SubKriteria> getSubKriteriaById(String Kriteria) throws SQLException {


        Statement st = (Statement) DatabaseConnection.getConnection().createStatement();
        //System.out.println("SELECT * FROM subkriteria WHERE id_kriteria = "+Kriteria);
        ResultSet rs = st.executeQuery("SELECT * FROM subkriteria WHERE id_kriteria = '" + Kriteria + "'");
        List<SubKriteria> list = new ArrayList<SubKriteria>();
        while (rs.next()) {
            SubKriteria o = new SubKriteria();
            o.setId_subkriteriakriteria(rs.getString("id_subkriteria"));
            o.setNama_subkriteria(rs.getString("nama_subkriteria"));
            o.setBobot_subkriteria(rs.getDouble("bobot_subkriteria"));
            list.add(o);
        }
        return list;
    }

    public Kriteria getByIdKriteria(String id) throws SQLException, Exception {
        PreparedStatement ps = (PreparedStatement) DatabaseConnection.getConnection().prepareStatement("select * from kriteria where id_kriteria like ?");
        ps.setString(1, "%" + id + "%");
        ResultSet rs = ps.executeQuery();
        Kriteria data = new Kriteria();
        while (rs.next()) {

            data.setId_kriteria(rs.getString("id_kriteria"));
            data.setNama_kriteria(rs.getString("nama_kriteria"));
            data.setBobot_kriteria(rs.getDouble("bobot_kriteria"));


        }
        return data;
    }

    public void ubahDataKriteria(Kriteria dataKriteria) throws SQLException {
        String kode_kriteria = dataKriteria.getId_kriteria();
        String nama_kriteria = dataKriteria.getNama_kriteria();
        Double bobot_kriteria = dataKriteria.getBobot_kriteria();


        //insert kriteria//
        String sql1 =
                "UPDATE kriteria SET  nama_kriteria ='" + nama_kriteria + "', bobot_kriteria =" + bobot_kriteria + " WHERE id_kriteria = '" + kode_kriteria + "'";

        java.sql.Statement statement = DatabaseConnection.getConnection().createStatement();
        statement.executeUpdate(sql1);
        //insert subkriteria

        for (int i = 0; i < dataKriteria.getSubkriteria().size(); i++) {
            SubKriteria temp = dataKriteria.getSubkriteria().get(i);

            String sql2 =
                    "UPDATE subkriteria SET id_subkriteria ='" + temp.getId_subkriteriakriteria() + "',nama_subkriteria='" + temp.getNama_subkriteria() + "',bobot_subkriteria=" + temp.getBobot_subkriteria() + " where id_kriteria ='" + kode_kriteria + "' and id_subkriteria = '" + temp.getId_subkriteriakriteria() + "' ";
            //System.out.println(sql2);
            statement.executeUpdate(sql2);
        }
    }

    public void ubahDataKriteriaSubKriteria(Kriteria dataKriteria) throws SQLException {
        String kode_kriteria = dataKriteria.getId_kriteria();
        String nama_kriteria = dataKriteria.getNama_kriteria();
        Double bobot_kriteria = dataKriteria.getBobot_kriteria();


        //insert kriteria//
        String sql1 =
                "UPDATE kriteria SET  nama_kriteria ='" + nama_kriteria + "', bobot_kriteria =" + bobot_kriteria + " WHERE id_kriteria = '" + kode_kriteria + "'";

        java.sql.Statement statement = DatabaseConnection.getConnection().createStatement();
        statement.executeUpdate(sql1);
        //insert subkriteria

        String sql2 =
                "DELETE FROM subkriteria WHERE id_kriteria = '" + kode_kriteria + "'";
        statement.executeUpdate(sql2);

        for (int i = 0; i < dataKriteria.getSubkriteria().size(); i++) {
            SubKriteria temp = dataKriteria.getSubkriteria().get(i);

            String sql3 =
                    "insert into subkriteria values ('" + temp.getId_subkriteriakriteria() + "','" + temp.getNama_subkriteria() + "','" + temp.getBobot_subkriteria() + "','" + kode_kriteria + "')";
            statement.executeUpdate(sql3);
        }
    }
     public void deletepoinKriteria(Kriteria kr) throws SQLException {//ini belum selesai//
        //PreparedStatement prepare = null;
        String kode = kr.getId_kriteria();
        PreparedStatement  ps = (PreparedStatement) DatabaseConnection.getConnection().prepareStatement("delete from poin_kriteria_warga where id_kriteria = ?");
        ps.setString(1, kode);
        ps.executeUpdate();
    }
     public void deletesubKriteria(Kriteria kr) throws SQLException {//ini belum selesai//
        //PreparedStatement prepare = null;
        String kode = kr.getId_kriteria();
        PreparedStatement  ps = (PreparedStatement) DatabaseConnection.getConnection().prepareStatement("delete from subkriteria where id_kriteria = ?");
        ps.setString(1, kode);
        ps.executeUpdate();
    }
     public void deleteKriteria(Kriteria kr) throws SQLException {//ini belum selesai//
        //PreparedStatement prepare = null;
        String kode = kr.getId_kriteria();
        PreparedStatement  ps = (PreparedStatement) DatabaseConnection.getConnection().prepareStatement("delete from kriteria where id_kriteria = ?");
        ps.setString(1, kode);
        ps.executeUpdate();
    }
     public KriteriaWarga findKriteriaWargaMin(String id_kriteria) throws SQLException{
        KriteriaWarga kriteriaWarga=new KriteriaWarga();
        Statement stKriteria = DatabaseConnection.getConnection().createStatement();
        ResultSet rsKriteria = stKriteria.executeQuery(""
                + "select *, sub.bobot_subkriteria as SKOR_KRITERIA from poin_kriteria_warga " +
                "join kriteria on kriteria.ID_KRITERIA=poin_kriteria_warga.ID_KRITERIA " +
                "join subkriteria sub on sub.id_kriteria = poin_kriteria_warga.id_kriteria " +
                    "AND sub.id_subkriteria = poin_kriteria_warga.id_subkriteria " +
                "where poin_kriteria_warga.ID_KRITERIA='"+id_kriteria+"' " +
                "order by SKOR_KRITERIA asc " +
                "limit 0,1");
        if(rsKriteria.next()){
            Kriteria k = new Kriteria();
            k.setId_kriteria(rsKriteria.getString("Id_Kriteria"));
            k.setNama_kriteria(rsKriteria.getString("nama_kriteria"));
            k.setBobot_kriteria(rsKriteria.getDouble("bobot_kriteria"));

            KriteriaWarga kw = new KriteriaWarga();
            kw.setKriteria(k);
            kw.setIdSubkriteria(rsKriteria.getString("id_subkriteria"));
            kw.setNamaSubkriteria(rsKriteria.getString("nama_subkriteria"));
            kw.setSkor(rsKriteria.getDouble("SKOR_KRITERIA"));
            kriteriaWarga=kw;
        }
         return kriteriaWarga;
     }
}
