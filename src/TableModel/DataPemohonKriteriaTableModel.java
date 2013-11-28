/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TableModel;

import Entity.DataPemohon;
import Entity.Kriteria;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author user
 */
public class DataPemohonKriteriaTableModel extends AbstractTableModel{

    private List<DataPemohon> datas = new ArrayList<DataPemohon>();
    private List<Kriteria> kriteriaList;

    public DataPemohonKriteriaTableModel(List<DataPemohon> data1,List<Kriteria> kriterias) {
        this.datas = data1;
        this.kriteriaList=kriterias;
    }

    public int getRowCount() {
        return datas.size();
    }

    public int getColumnCount() {
        return kriteriaList.size()+3;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        DataPemohon b = datas.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return b.getNKK();
            case 1:
                return b.getNama_kepala_keluarga();
            default:
                if(columnIndex+1==this.getColumnCount()){
                    return b.getHasilKeputusan();
                }else{
                    try{
//                        return b.getKriteriaWargaList().
//                                get(columnIndex-2).getSkor();
                        return b.getKriteriaWargaList().
                                get(columnIndex-2).getNamaSubkriteria();
                    }catch(IndexOutOfBoundsException e){
                        return 0;
                    }
                    
                }
                
        }
    }

    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "NKK";
            case 1:
                return "NAMA KEPALA KELUARGA";
            default:
                if(column+1==this.getColumnCount()){
                    return "SKOR";
                }else{
                    return kriteriaList.get(column-2).getNama_kriteria();
                }
        }
    }
}
