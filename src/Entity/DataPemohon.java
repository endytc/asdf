/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Entity;

import java.util.List;

/**
 *
 * @author user
 */
public class DataPemohon {

     private String NKK;
     private String nama_kepala_keluarga;
     private String alamat;
     private String rt_rw;
     private String desa;
     private double hasilKeputusan;
     private List<KriteriaWarga> kriteriaWargaList;
     private List<Kriteria> kriteriaList;
    /**
     * @return the NKK
     */
    public String getNKK() {
        return NKK;
    }

    /**
     * @param NKK the NKK to set
     */
    public void setNKK(String NKK) {
        this.NKK = NKK;
    }

    /**
     * @return the nama_kepala_keluarga
     */
    public String getNama_kepala_keluarga() {
        return nama_kepala_keluarga;
    }

    /**
     * @param nama_kepala_keluarga the nama_kepala_keluarga to set
     */
    public void setNama_kepala_keluarga(String nama_kepala_keluarga) {
        this.nama_kepala_keluarga = nama_kepala_keluarga;
    }

    /**
     * @return the alamat
     */
    public String getAlamat() {
        return alamat;
    }

    /**
     * @param alamat the alamat to set
     */
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    /**
     * @return the rt_rw
     */
    public String getRt_rw() {
        return rt_rw;
    }

    /**
     * @param rt_rw the rt_rw to set
     */
    public void setRt_rw(String rt_rw) {
        this.rt_rw = rt_rw;
    }

    /**
     * @return the desa
     */
    public String getDesa() {
        return desa;
    }

    /**
     * @param desa the desa to set
     */
    public void setDesa(String desa) {
        this.desa = desa;
    }

    /**
     * @return the hasilKeputusan
     */
    public double getHasilKeputusan() {
        return hasilKeputusan;
    }

    /**
     * @param hasilKeputusan the hasilKeputusan to set
     */
    public void setHasilKeputusan(double hasilKeputusan) {
        this.hasilKeputusan = hasilKeputusan;
    }
    public void setKriteriaWargaList(List<KriteriaWarga> kriteriaWargaList){
        this.kriteriaWargaList=kriteriaWargaList;
    }
    public void addKriteriaWarga(KriteriaWarga kriteriaWarga){
        kriteriaWargaList.add(kriteriaWarga);
    }

    public List<KriteriaWarga> getKriteriaWargaList() {
        return kriteriaWargaList;
    }
    public KriteriaWarga findKriteriaWarga(String kodeKriteria){
        boolean isFound=false;
        int i=0;
//        System.out.println(kriteriaWargaList.size());
        while(!isFound && i<this.kriteriaWargaList.size()){
            try{
                if(kodeKriteria.equalsIgnoreCase(this.kriteriaWargaList.get(i).getKriteria().getId_kriteria())){
                    isFound=true;
                }
            }catch(Exception e){
//                System.err.println(e.getMessage()+" "+e.getClass());
            }                
            if(!isFound)
                i++;
        }
        if(isFound)
            return this.kriteriaWargaList.get(i);
        else{
//            System.out.println(this.getNama_kepala_keluarga()+" "+this.getNKK()+" "+kodeKriteria);
            return new KriteriaWarga(new Kriteria(), 0,"","");
        }
    }

    /**
     * @return the kriteriaList
     */
    public List<Kriteria> getKriteriaList() {
        return kriteriaList;
    }

    /**
     * @param kriteriaList the kriteriaList to set
     */
    public void setKriteriaList(List<Kriteria> kriteriaList) {
        this.kriteriaList = kriteriaList;
    }
}