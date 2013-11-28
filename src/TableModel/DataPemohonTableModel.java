/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package TableModel;

import Entity.DataPemohon;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author user
 */
public class DataPemohonTableModel {

     private List<DataPemohon> datas = new ArrayList<DataPemohon>();

public DataPemohonTableModel(List<DataPemohon> data1){
    this.datas=data1;
}
    public int getRowCount() {
        return datas.size();
    }

    public int getColumnCount() {
        return 5;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
      DataPemohon b =datas.get(rowIndex);
       switch(columnIndex){
           case 0:
               return b.getNKK();
           case 1 :
               return b.getNama_kepala_keluarga();
           case 2:
              return b.getAlamat();
           case 3:
               return b.getRt_rw();
           case 4:
               return b.getDesa();
           default :
               return "";
       }
    }
    public String getColumnName (int column){
        switch(column){
            case 0 :
                return "NKK";
            case 1 :
                return "NAMA KEPALA KELUARGA";
             case 2 :
                return "ALAMAT";
            case 3:
                return "RT/RW";
            case 4:
                return "DESA";
             default:
                 return "";
        }
    }

}
