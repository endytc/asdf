/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TableModel;

import Entity.DataPemohon;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author user
 */
public class DataPenerimaTableModel extends AbstractTableModel {

    private List<DataPemohon> datas = new ArrayList<DataPemohon>();
    private double patokanSkor;
    public DataPenerimaTableModel(List<DataPemohon> data1,double patokanSkor) {
        this.datas = data1;
        this.patokanSkor=patokanSkor;
    }

    public int getRowCount() {
        return datas.size();
    }

    public int getColumnCount() {
        return 4;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        DataPemohon b = datas.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return b.getNKK();
            case 1:
                return b.getNama_kepala_keluarga();
            case 2:
                return b.getAlamat();
            case 3:
                 if(b.getHasilKeputusan()>=patokanSkor)
                        return "Menerima";
                    else
                        return "Tidak menerima";
            default:
                return "";

        }
    }

    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "NKK";
            case 1:
                return "Kepala Keluarga";
            case 2:
                return "Alamat";
            case 3:
                return "Hasil Keputusan";
            default:
                return "";
        }
    }
}
