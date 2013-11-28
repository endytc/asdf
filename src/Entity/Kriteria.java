/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Entity;

import java.util.LinkedList;

/**
 *
 * @author user
 */
public class Kriteria {

    private String id_kriteria;
    private String nama_kriteria;
    private Double bobot_kriteria;
    private LinkedList <SubKriteria> subkriteria;

    public Kriteria(){
        subkriteria = new LinkedList<SubKriteria>();
    }

  
    public String getId_kriteria() {
        return id_kriteria;
    }

   
    public void setId_kriteria(String id_kriteria) {
        this.id_kriteria = id_kriteria;
    }

  
    public String getNama_kriteria() {
        return nama_kriteria;
    }

  
    public void setNama_kriteria(String nama_kriteria) {
        this.nama_kriteria = nama_kriteria;
    }

   
    public Double getBobot_kriteria() {
        return bobot_kriteria;
    }

   
    public void setBobot_kriteria(Double bobot_kriteria) {
        this.bobot_kriteria = bobot_kriteria;
    }

    /**
     * @return the subkriteria
     */
    public LinkedList<SubKriteria> getSubkriteria() {
        return subkriteria;
    }

    /**
     * @param subkriteria the subkriteria to set
     */
    public void setSubkriteria(LinkedList<SubKriteria> subkriteria) {
        this.subkriteria = subkriteria;
    }

    public void addSubkriteria(SubKriteria sub){
        this.subkriteria.add(sub);
    }
   
}
