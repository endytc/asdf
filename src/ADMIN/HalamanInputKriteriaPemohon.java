/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * HalamanTambahSubKriteria.java
 *
 * Created on 07 Okt 13, 9:06:49
 */
package ADMIN;

import Controller.KriteriaController;
import Controller.PemohonController;
import DBConn.DatabaseConnection;
import Entity.DataPemohon;
import Entity.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author user
 */
public class HalamanInputKriteriaPemohon extends javax.swing.JPanel {

    private ArrayList<String> idKriterias;
    private ArrayList<Double> skorSubKriteria;
    private Vector<ItemList> KriteriaSubKriteriaListItem;

    /** Creates new form HalamanTambahSubKriteria */
    public HalamanInputKriteriaPemohon() {
        initComponents();
        KriteriaSubKriteriaListItem = new Vector<ItemList>();
        try {
            List<Kriteria> kriteria = KriteriaController.getKriteriaKontrol().getAllKriteria();
            idKriterias = new ArrayList<String>();
            for (Kriteria d : kriteria) {
                kriteriaCB.addItem(d.getNama_kriteria());
                idKriterias.add(d.getId_kriteria());
            }
            // System.out.println(idKriterias.get(kriteriaCB.getSelectedIndex()));
            skorSubKriteria = new ArrayList<Double>();
            List<SubKriteria> subkriteria = KriteriaController.getKriteriaKontrol().getSubKriteriaById(idKriterias.get(kriteriaCB.getSelectedIndex()));
            for (SubKriteria e : subkriteria) {
                subKriteriaCB.addItem(e.getNama_subkriteria());
                skorSubKriteria.add(e.getBobot_subkriteria());
            }

        } catch (SQLException ex) {
            Logger.getLogger(HalamanInputKriteriaPemohon.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nkkTF = new javax.swing.JTextField();
        cariButton = new javax.swing.JButton();
        namaKepalaTF = new javax.swing.JTextField();
        alamatTF = new javax.swing.JTextField();
        rt_rwTF = new javax.swing.JTextField();
        desaTF = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jSeparator4 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        kriteriaDanSubKriteriaList = new javax.swing.JList();
        jLabel9 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        simpanButton = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        subKriteriaCB = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        kriteriaCB = new javax.swing.JComboBox();

        setBackground(new java.awt.Color(153, 153, 255));
        setForeground(new java.awt.Color(0, 0, 51));
        setPreferredSize(new java.awt.Dimension(800, 476));

        jLabel1.setFont(new java.awt.Font("Stencil", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 51));
        jLabel1.setText("INPUT KRITERIA PEMOHON");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("NKK");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("NAMA KEPALA KELUARGA");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("ALAMAT");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("RT/RW");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("DESA");

        cariButton.setText("CARI");
        cariButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cariButtonActionPerformed(evt);
            }
        });

        rt_rwTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rt_rwTFActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);

        kriteriaDanSubKriteriaList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { " " };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        kriteriaDanSubKriteriaList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                kriteriaDanSubKriteriaListValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(kriteriaDanSubKriteriaList);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("LIST KRITERIA DAN SUB KRITERIA PEMOHON");

        jButton3.setText("KEMBALI");

        jButton4.setText("BATAL");

        simpanButton.setText("SIMPAN");
        simpanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanButtonActionPerformed(evt);
            }
        });

        jButton5.setText("TAMBAH");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 51));
        jLabel7.setText("Input Kriteria");

        jLabel11.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jLabel11.setText("SUB KRITERIA ");

        jLabel8.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jLabel8.setText("KRITERIA");

        kriteriaCB.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                kriteriaCBItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(simpanButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addGap(83, 83, 83))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel8))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton5)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(kriteriaCB, 0, 213, Short.MAX_VALUE)
                                        .addComponent(subKriteriaCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addComponent(jLabel7))))
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(497, 497, 497))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(5, 5, 5))
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(kriteriaCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(subKriteriaCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton5)
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3)
                            .addComponent(jButton4)
                            .addComponent(simpanButton)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(49, Short.MAX_VALUE))
            .addComponent(jSeparator4)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(206, 206, 206)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel4))
                                .addGap(116, 116, 116))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rt_rwTF, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addComponent(jSeparator2)
                                .addGap(122, 122, 122))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(desaTF, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(namaKepalaTF)
                                .addComponent(nkkTF, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                                .addComponent(cariButton)
                                .addComponent(alamatTF)))))
                .addGap(312, 334, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nkkTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namaKepalaTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(alamatTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(rt_rwTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(desaTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cariButton)
                .addGap(13, 13, 13)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cariButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cariButtonActionPerformed
        try {
            String nkk = nkkTF.getText();
            PemohonController pemohonConn = new PemohonController();
            DataPemohon data = pemohonConn.getById(nkk);

            String nama = data.getNama_kepala_keluarga();
            String alamat = data.getAlamat();
            String rt_rw = data.getRt_rw();
            String desa = data.getDesa();
            namaKepalaTF.setText(nama);
            alamatTF.setText(alamat);
            rt_rwTF.setText(rt_rw);
            desaTF.setText(desa);
        } catch (SQLException ex) {
            Logger.getLogger(HalamanInputKriteriaPemohon.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(HalamanInputKriteriaPemohon.class.getName()).log(Level.SEVERE, null, ex);
        }




    }//GEN-LAST:event_cariButtonActionPerformed

    private void rt_rwTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rt_rwTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rt_rwTFActionPerformed

    private void simpanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanButtonActionPerformed
        // TODO add your handling code here:

        for (int i = 0; i < KriteriaSubKriteriaListItem.size(); i++) {
            try {
                PemohonController pemohon = new PemohonController(new DatabaseConnection().getConnection());
                pemohon.simpanKriteriaPemohon(nkkTF.getText(), KriteriaSubKriteriaListItem.get(i).getIdKriteria(), KriteriaSubKriteriaListItem.get(i).getIdSubKriteria());
          
                //JOptionPane.showMessageDialog(null, "Data berhasil disimpan");//
            } catch (SQLException ex) {
                Logger.getLogger(HalamanInputKriteriaPemohon.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_simpanButtonActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        if (jButton5.getText().equalsIgnoreCase("Tambah")) {
            boolean status = true;
            for (int i = 0; i < KriteriaSubKriteriaListItem.size(); i++) {
                if (kriteriaCB.getSelectedItem().toString().equalsIgnoreCase(KriteriaSubKriteriaListItem.get(i).namaKriteria)) {
                    status = false;
                }
            }
            if (status) {
                try{
                subkriteriaList = KriteriaController.getKriteriaKontrol().getSubKriteriaById(idKriterias.get(kriteriaCB.getSelectedIndex()));
//                System.out.println(subkriteriaList.size()+" "+(subKriteriaCB.getSelectedIndex()));
                KriteriaSubKriteriaListItem.add(new ItemList(idKriterias.get(kriteriaCB.getSelectedIndex()), 
                        kriteriaCB.getSelectedItem().toString(), 
                        skorSubKriteria.get(subKriteriaCB.getSelectedIndex()).doubleValue(), 
                        subKriteriaCB.getSelectedItem().toString(),
                        subkriteriaList.get(subKriteriaCB.getSelectedIndex()).getId_subkriteriakriteria()));
                kriteriaDanSubKriteriaList.setListData(KriteriaSubKriteriaListItem);
                }catch(Exception e){
                    
                }
                
            }
        } else if (jButton5.getText().equalsIgnoreCase("Ubah")){
           jButton5.setText("Tambah");
            kriteriaCB.setEnabled(true);
            ItemList item = (ItemList) KriteriaSubKriteriaListItem.get(kriteriaDanSubKriteriaList.getSelectedIndex());
            item.setNamaSubKriteria(subKriteriaCB.getSelectedItem().toString());
            item.setSkorSubKriteria(skorSubKriteria.get(subKriteriaCB.getSelectedIndex()));
            kriteriaDanSubKriteriaList.repaint();
            //kriteriaDanSubKriteriaList.setListData(KriteriaSubKriteriaListItem);
            
        }
    }//GEN-LAST:event_jButton5ActionPerformed
    private List<SubKriteria> subkriteriaList;
    private void kriteriaCBItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_kriteriaCBItemStateChanged
        try {
            // TODO add your handling code here:
            if (!idKriterias.isEmpty()) {
                skorSubKriteria = new ArrayList<Double>();
                subKriteriaCB.removeAllItems();
                //System.out.println(kriteriaCB.getSelectedIndex() + " - " + idKriterias.size());
                subkriteriaList = KriteriaController.getKriteriaKontrol().getSubKriteriaById(idKriterias.get(kriteriaCB.getSelectedIndex()));
                for (SubKriteria e : subkriteriaList) {
                    subKriteriaCB.addItem(e.getNama_subkriteria());
                    skorSubKriteria.add(e.getBobot_subkriteria());
                }
            }
            jButton5.setText("Tambah");
        } catch (SQLException ex) {
            Logger.getLogger(HalamanInputKriteriaPemohon.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_kriteriaCBItemStateChanged

    private void kriteriaDanSubKriteriaListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_kriteriaDanSubKriteriaListValueChanged
        // TODO add your handling code here:
        ItemList item = (ItemList) kriteriaDanSubKriteriaList.getSelectedValue();
        kriteriaCB.setSelectedItem(item.getNamaKriteria());
        subKriteriaCB.setSelectedItem(item.getNamaSubKriteria());
        jButton5.setText("Ubah");
        kriteriaCB.setEnabled(false);
    }//GEN-LAST:event_kriteriaDanSubKriteriaListValueChanged
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alamatTF;
    private javax.swing.JButton cariButton;
    private javax.swing.JTextField desaTF;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JComboBox kriteriaCB;
    private javax.swing.JList kriteriaDanSubKriteriaList;
    private javax.swing.JTextField namaKepalaTF;
    private javax.swing.JTextField nkkTF;
    private javax.swing.JTextField rt_rwTF;
    private javax.swing.JButton simpanButton;
    private javax.swing.JComboBox subKriteriaCB;
    // End of variables declaration//GEN-END:variables

    public static void main(String[] args) {
        HalamanInputKriteriaPemohon HIKP = new HalamanInputKriteriaPemohon();
        JFrame f = new JFrame();
        f.setSize(500, 500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(HIKP);
        f.setVisible(true);
    }

    private class ItemList {

        private String idKriteria;
        private String namaKriteria;
        private double skorSubKriteria;
        private String namaSubKriteria;
        private String idSubKriteria;

        public ItemList() {
        }

        public ItemList(String idKriteria, String namaKriteria, double skorSubKriteria, String namaSubKriteria, String idSubKriteria) {
            this.idKriteria = idKriteria;
            this.namaKriteria = namaKriteria;
            this.skorSubKriteria = skorSubKriteria;
            this.namaSubKriteria = namaSubKriteria;
            this.idSubKriteria = idSubKriteria;
        }

        public String getIdSubKriteria() {
            return idSubKriteria;
        }

        public void setIdSubKriteria(String idSubKriteria) {
            this.idSubKriteria = idSubKriteria;
        }

        /**
         * @return the idKriteria
         */
        public String getIdKriteria() {
            return idKriteria;
        }

        /**
         * @param idKriteria the idKriteria to set
         */
        public void setIdKriteria(String idKriteria) {
            this.idKriteria = idKriteria;
        }

        /**
         * @return the namaKriteria
         */
        public String getNamaKriteria() {
            return namaKriteria;
        }

        /**
         * @param namaKriteria the namaKriteria to set
         */
        public void setNamaKriteria(String namaKriteria) {
            this.namaKriteria = namaKriteria;
        }

        /**
         * @return the skorSubKriteria
         */
        public double getSkorSubKriteria() {
            return skorSubKriteria;
        }

        /**
         * @param skorSubKriteria the skorSubKriteria to set
         */
        public void setSkorSubKriteria(double skorSubKriteria) {
            this.skorSubKriteria = skorSubKriteria;
        }

        /**
         * @return the namaSubKriteria
         */
        public String getNamaSubKriteria() {
            return namaSubKriteria;
        }

        /**
         * @param namaSubKriteria the namaSubKriteria to set
         */
        public void setNamaSubKriteria(String namaSubKriteria) {
            this.namaSubKriteria = namaSubKriteria;
        }

        @Override
        public String toString() {
            return getNamaKriteria() + " = " + getNamaSubKriteria();
        }
    }
}
