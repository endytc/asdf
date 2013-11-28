/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import ADMIN.HalamanSimulasi1;
import Controller.KriteriaController;
import Controller.PemohonController;
import Entity.DataPemohon;
import Entity.DataPemohonSAW;
import Entity.Kriteria;
import TableModel.DataPemohonKriteriaTableModel;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author fendi
 */
public class sawTest {
     List<DataPemohon> dataPemohonList,dataPenerimaList;
    List<Kriteria> kriteriaList;
    PemohonController pemohonController;
    KriteriaController kriteriaController;
    DataPemohonSAW dataPemohonSAW;
    public sawTest() {
        try {
            pemohonController=PemohonController.getPemohonKontrol();
            kriteriaController=KriteriaController.getKriteriaKontrol();
        } catch (SQLException ex) {
            assertTrue(false);
        }
        try {
            kriteriaList=kriteriaController.getAllKriteria();
            dataPemohonList=pemohonController.getAllWithKriteria();
            
        } catch (SQLException ex) {
            assertTrue(false);
        }
    }
    @Test
    public void processSAW(){
        assertTrue("jumlah pemohon",dataPemohonList.size()==39);
        assertEquals("cek pegawai", dataPemohonList.get(0).getNKK(), "140211840001 ");
        assertTrue("harusnya jumlah subkriteria=9, tetapi ditemukan sejumlah "+dataPemohonList.get(0).getKriteriaWargaList().size(),
                dataPemohonList.get(0).getKriteriaWargaList().size()==9);
        assertEquals("cek find sub kriteria, ditemukan "+dataPemohonList.get(0).findKriteriaWarga("C1").getIdSubkriteria(),
                dataPemohonList.get(0).findKriteriaWarga("C1").getIdSubkriteria(),"SUB-3");
        dataPemohonSAW=new DataPemohonSAW(dataPemohonList,kriteriaList);
    }
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}