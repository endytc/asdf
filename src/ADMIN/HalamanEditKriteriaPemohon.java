/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * HalamanEditKriteriaPemohon.java
 *
 * Created on 07 Okt 13, 9:54:26
 */
package ADMIN;

import Controller.KriteriaController;
import Controller.PemohonController;
import DBConn.DatabaseConnection;
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
public class HalamanEditKriteriaPemohon extends javax.swing.JPanel {

    private ArrayList<String> idKriterias;
    private ArrayList<Double> skorSubKriteria;
    private Vector<ItemList> KriteriaSubKriteriaListItem;

    /** Creates new form HalamanEditKriteriaPemohon */
    public HalamanEditKriteriaPemohon() {
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
        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        kriteriaCB = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        kriteriaDanSubKriteriaList = new javax.swing.JList();
        jButton5 = new javax.swing.JButton();
        subKriteriaCB = new javax.swing.JComboBox();
        jLabel16 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        nkkTF = new javax.swing.JTextField();
        cariButton = new javax.swing.JButton();
        namaKepalaTF = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        alamatTF = new javax.swing.JTextField();
        rt_rwTF = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        desaTF = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel1.setText("EDIT KRITERIA PEMOHON");

        jLabel13.setFont(new java.awt.Font("Vani", 1, 14));
        jLabel13.setText("Input Kriteria");

        jLabel14.setFont(new java.awt.Font("Tw Cen MT", 1, 14));
        jLabel14.setText("KRITERIA");

        kriteriaCB.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                kriteriaCBItemStateChanged(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tw Cen MT", 1, 14));
        jLabel15.setText("SUB KRITERIA ");

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

        jButton5.setText("TAMBAH");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel16.setText("LIST KRITERIA DAN SUB KRITERIA PEMOHON");

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jButton2.setText("UBAH");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel2.setText("NKK");

        cariButton.setText("CARI");
        cariButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cariButtonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel3.setText("NAMA KEPALA KELUARGA");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel4.setText("ALAMAT");

        rt_rwTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rt_rwTFActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel5.setText("RT/RW");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel6.setText("DESA");

        jButton1.setText("HAPUS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel13))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel14)
                                .addComponent(jLabel15))
                            .addGap(28, 28, 28)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(subKriteriaCB, 0, 195, Short.MAX_VALUE)
                                .addComponent(kriteriaCB, 0, 195, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton5)
                        .addGap(104, 104, 104)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(44, 44, 44))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(368, 368, 368)
                .addComponent(jSeparator3, javax.swing.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(alamatTF, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(namaKepalaTF, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
                        .addComponent(rt_rwTF, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(nkkTF, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cariButton)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(desaTF, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(249, 249, 249))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(276, 276, 276)
                .addComponent(jButton2)
                .addGap(58, 58, 58)
                .addComponent(jButton1)
                .addContainerGap(271, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nkkTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cariButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(namaKepalaTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alamatTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rt_rwTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(desaTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(jLabel16)
                            .addComponent(kriteriaCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel15)
                                    .addComponent(subKriteriaCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addComponent(jButton5))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(140, 140, 140))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void rt_rwTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rt_rwTFActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_rt_rwTFActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cariButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cariButtonActionPerformed
        try {
            // TODO add your handling code here:
            String nkk = nkkTF.getText();
            PemohonController pc = new PemohonController();

            DataPemohon data = pc.getByIdWithKriteria(nkk);

            String nama_kepala_keluarga = data.getNama_kepala_keluarga();
            String alamat = data.getAlamat();
            String rt_rw = data.getRt_rw();
            String desa = data.getDesa();

            namaKepalaTF.setText(nama_kepala_keluarga);
            alamatTF.setText(alamat);
            rt_rwTF.setText(rt_rw);
            desaTF.setText(desa);
            //  System.out.println(data.getKriteriaWargaList().isEmpty());
            for (int i = 0; i < data.getKriteriaWargaList().size(); i++) {
                KriteriaWarga k = data.getKriteriaWargaList().get(i);
                ItemList item = new ItemList(k.getKriteria().getId_kriteria(), k.getKriteria().getNama_kriteria(), k.getSkor(), k.getKriteria().getSubkriteria().getFirst().getNama_subkriteria());
                KriteriaSubKriteriaListItem.add(item);
            }

            kriteriaDanSubKriteriaList.setListData(KriteriaSubKriteriaListItem);









        } catch (SQLException ex) {
            Logger.getLogger(HalamanEditKriteriaPemohon.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(HalamanEditKriteriaPemohon.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_cariButtonActionPerformed

    private void kriteriaCBItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_kriteriaCBItemStateChanged
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            if (!idKriterias.isEmpty()) {
                skorSubKriteria = new ArrayList<Double>();
                subKriteriaCB.removeAllItems();
                //System.out.println(kriteriaCB.getSelectedIndex() + " - " + idKriterias.size());
                List<SubKriteria> subkriteria = KriteriaController.getKriteriaKontrol().getSubKriteriaById(idKriterias.get(kriteriaCB.getSelectedIndex()));
                for (SubKriteria e : subkriteria) {
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
                KriteriaSubKriteriaListItem.add(new ItemList(idKriterias.get(kriteriaCB.getSelectedIndex()), kriteriaCB.getSelectedItem().toString(), skorSubKriteria.get(subKriteriaCB.getSelectedIndex()).doubleValue(), subKriteriaCB.getSelectedItem().toString()));
                kriteriaDanSubKriteriaList.setListData(KriteriaSubKriteriaListItem);
            }
        } else if (jButton5.getText().equalsIgnoreCase("Ubah")) {
            jButton5.setText("Tambah");
            kriteriaCB.setEnabled(true);
            ItemList item = (ItemList) KriteriaSubKriteriaListItem.get(kriteriaDanSubKriteriaList.getSelectedIndex());
            item.setNamaSubKriteria(subKriteriaCB.getSelectedItem().toString());
            item.setSkorSubKriteria(skorSubKriteria.get(subKriteriaCB.getSelectedIndex()));
            kriteriaDanSubKriteriaList.repaint();
            //kriteriaDanSubKriteriaList.setListData(KriteriaSubKriteriaListItem);

        }
    }//GEN-LAST:event_jButton5ActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alamatTF;
    private javax.swing.JButton cariButton;
    private javax.swing.JTextField desaTF;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JComboBox kriteriaCB;
    private javax.swing.JList kriteriaDanSubKriteriaList;
    private javax.swing.JTextField namaKepalaTF;
    private javax.swing.JTextField nkkTF;
    private javax.swing.JTextField rt_rwTF;
    private javax.swing.JComboBox subKriteriaCB;
    // End of variables declaration//GEN-END:variables

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        HalamanEditKriteriaPemohon h = new HalamanEditKriteriaPemohon();
        frame.add(h);
        frame.setSize(700, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    private class ItemList {

        private String idKriteria;
        private String namaKriteria;
        private double skorSubKriteria;
        private String namaSubKriteria;

        public ItemList() {
        }

        public ItemList(String idKriteria, String namaKriteria, double skorSubKriteria, String namaSubKriteria) {
            this.idKriteria = idKriteria;
            this.namaKriteria = namaKriteria;
            this.skorSubKriteria = skorSubKriteria;
            this.namaSubKriteria = namaSubKriteria;
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