/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import Controller.KriteriaController;
import Controller.PemohonController;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class DataPemohonSAW extends ArrayList<DataPemohon> {

    private List<Kriteria> bobotKriteriaList;
    
    public DataPemohonSAW(List<DataPemohon> dp,List<Kriteria> k){
        this.bobotKriteriaList=k;
        for(int i=0;i<dp.size();i++){
            this.add(dp.get(i));
        }
        this.normalisasiMin();
        this.hasilAkhir();
    }
    // x=kandidat
    public boolean normalisasiMin() {
        if (this.size() == 0) {
            return false;
        }
        
        List<KriteriaWarga> kriteriaWargaMin=new ArrayList<KriteriaWarga>();
        //cari minimal
        for (int i = 0; i < bobotKriteriaList.size(); i++) {
            KriteriaController kriteriaController=new KriteriaController();
            KriteriaWarga kwMin=new KriteriaWarga();
            try {
                kwMin=kriteriaController.findKriteriaWargaMin(bobotKriteriaList.get(i).getId_kriteria());
            } catch (SQLException ex) {
                Logger.getLogger(DataPemohonSAW.class.getName()).log(Level.SEVERE, null, ex);
            }
            kriteriaWargaMin.add(kwMin);
        }
        //normalisasi pegawai
        for (int i = 0; i < this.size(); i++) {
            for (int j = 0; j < kriteriaWargaMin.size(); j++) {
                this.get(i).findKriteriaWarga(
                        kriteriaWargaMin.get(j).getKriteria().getId_kriteria()
                    ).setNormalisasi(
                        kriteriaWargaMin.get(j).getSkor()/
                        this.get(i).findKriteriaWarga(
                            kriteriaWargaMin.get(j).getKriteria().getId_kriteria()
                        ).getSkor()
                    );
            }
        }
        return true;
    }
    

    public boolean hasilAkhir() {
        PemohonController pemohonController=new PemohonController();
        for (int i = 0; i < this.size(); i++) {
            double jumlah=0;
            for (int j = 0; j < this.bobotKriteriaList.size(); j++) {
                jumlah+=this.get(i)
                        .findKriteriaWarga(bobotKriteriaList.get(j).getId_kriteria())
                        .getNormalisasi()*
                        bobotKriteriaList.get(j).getBobot_kriteria()
                        ;
            }
            this.get(i).setHasilKeputusan(jumlah);
            pemohonController.updateHasilKeputusan(this.get(i));
        }
        
        return true;
    }
    public DataPemohonSAW getDataPemohonOrdered(){
        DataPemohonSAW dp;
        int j;                     // the number of items sorted so far
        DataPemohon key;                // the item to be inserted
        int i;
        dp=(DataPemohonSAW) this.clone();
        //insertion sort
        for (j = 1; j < dp.size(); j++) // Start with 1 (not 0)
        {
            key = dp.get(j);
            for (i = j - 1; (i >= 0) && (dp.get(i).getHasilKeputusan() < key.getHasilKeputusan()); i--) // Smaller values are moving up
            {
                dp.set(i+1, dp.get(i));
            }
            dp.set(i+1, key);// Put the key in its proper location
        }
        return dp;
    }
}