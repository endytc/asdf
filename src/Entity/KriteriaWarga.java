/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

public class KriteriaWarga {
    private Kriteria kriteria;
    private double skor;
    private String idSubkriteria;
    private String namaSubkriteria;
    private double normalisasi;

      public KriteriaWarga() {

    }

    public double getNormalisasi() {
        return normalisasi;
    }

    public void setNormalisasi(double normalisasi) {
        this.normalisasi = normalisasi;
    }
  
    public KriteriaWarga(Kriteria kriteria, double skor,String idSubkriteria,String namaSubkriteria) {
        this.kriteria = kriteria;
        this.skor = skor;
        this.idSubkriteria = idSubkriteria;
        this.namaSubkriteria = namaSubkriteria;
    }

    public String getNamaSubkriteria() {
        return namaSubkriteria;
    }

    public void setNamaSubkriteria(String namaSubkriteria) {
        this.namaSubkriteria = namaSubkriteria;
    }

    public String getIdSubkriteria() {
        return idSubkriteria;
    }

    public void setIdSubkriteria(String idSubkriteria) {
        this.idSubkriteria = idSubkriteria;
    }

    public Kriteria getKriteria() {
        return kriteria;
    }

    public void setKriteria(Kriteria kriteria) {
        this.kriteria = kriteria;
    }

    public double getSkor() {
        return skor;
    }

    public void setSkor(double skor) {
        this.skor = skor;
    }
    
}
