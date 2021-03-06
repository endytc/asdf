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
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class HalamanEditKriteriaPemohon extends javax.swing.JPanel {

    private ArrayList<String> idKriterias;
    private ArrayList<Double> skorSubKriteria;
    private ArrayList<String> idSkorSubKriteria;
    private Vector<ItemList> KriteriaSubKriteriaListItem;
    private Vector<ItemList> KriteriaSubKriteriaListItemToDelete;

    /** Creates new form HalamanEditKriteriaPemohon */
    public HalamanEditKriteriaPemohon() {
        initComponents();
        initVariabel();

    }
    private void initVariabel(){
        KriteriaSubKriteriaListItem = new Vector<ItemList>();
        KriteriaSubKriteriaListItemToDelete = new Vector<ItemList>();
        kriteriaCB.setEnabled(false);
        subKriteriaCB.setEnabled(false);
        try {
            List<Kriteria> kriteria = KriteriaController.getKriteriaKontrol().getAllKriteria();
            idKriterias = new ArrayList<String>();
            for (Kriteria d : kriteria) {
                kriteriaCB.addItem(d.getNama_kriteria());
                idKriterias.add(d.getId_kriteria());
            }
            // System.out.println(idKriterias.get(kriteriaCB.getSelectedIndex()));
            skorSubKriteria = new ArrayList<Double>();
            idSkorSubKriteria = new ArrayList<String>();
            List<SubKriteria> subkriteria = KriteriaController.getKriteriaKontrol().getSubKriteriaById(idKriterias.get(kriteriaCB.getSelectedIndex()));
            for (SubKriteria e : subkriteria) {
                subKriteriaCB.addItem(e.getNama_subkriteria());
                skorSubKriteria.add(e.getBobot_subkriteria());
                idSkorSubKriteria.add(e.getId_subkriteriakriteria());
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

        jPanel1 = new javax.swing.JPanel();
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
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        kriteriaCB = new javax.swing.JComboBox();
        subKriteriaCB = new javax.swing.JComboBox();
        jButton5 = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        kriteriaDanSubKriteriaList = new javax.swing.JList();
        jLabel16 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(800, 476));

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("NKK");

        cariButton.setText("CARI");
        cariButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cariButtonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("NAMA KEPALA KELUARGA");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("ALAMAT");

        rt_rwTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rt_rwTFActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("RT/RW");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("DESA");

        jLabel1.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 51));
        jLabel1.setText("EDIT KRITERIA PEMOHON");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                        .addComponent(cariButton)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(namaKepalaTF)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(rt_rwTF, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(nkkTF, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(0, 213, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(alamatTF, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(desaTF, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(16, 16, 16)))
                        .addGap(179, 179, 179))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(286, 286, 286))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nkkTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cariButton)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel13.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 51));
        jLabel13.setText("Input Kriteria");

        jLabel14.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jLabel14.setText("KRITERIA");

        jLabel15.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jLabel15.setText("SUB KRITERIA ");

        kriteriaCB.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                kriteriaCBItemStateChanged(evt);
            }
        });

        jButton5.setText("TAMBAH");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

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

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setText("LIST KRITERIA DAN SUB KRITERIA PEMOHON");

        jButton2.setText("UBAH");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setText("HAPUS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(subKriteriaCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(kriteriaCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(25, 25, 25))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jLabel13))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)))
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jLabel16))
                .addContainerGap(106, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(15, 15, 15)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(kriteriaCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(subKriteriaCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton5)
                            .addComponent(jButton1))
                        .addGap(37, 37, 37)
                        .addComponent(jButton2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void rt_rwTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rt_rwTFActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_rt_rwTFActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       KriteriaSubKriteriaListItemToDelete.add(
               KriteriaSubKriteriaListItem.get(kriteriaDanSubKriteriaList.getSelectedIndex())
               );
       KriteriaSubKriteriaListItem.remove(kriteriaDanSubKriteriaList.getSelectedIndex());
       kriteriaDanSubKriteriaList.repaint();
    }//GEN-LAST:event_jButton1ActionPerformed
    String nkk="";
    private void cariButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cariButtonActionPerformed
        initVariabel();
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
                ItemList item = new ItemList(k.getKriteria().getId_kriteria(), k.getIdSubkriteria(),k.getKriteria().getNama_kriteria(), k.getSkor(), k.getKriteria().getSubkriteria().getFirst().getNama_subkriteria());
                KriteriaSubKriteriaListItem.add(item);
            }
            
            kriteriaDanSubKriteriaList.setListData(KriteriaSubKriteriaListItem);
            this.nkk=nkk;
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
                    idSkorSubKriteria.add(e.getId_subkriteriakriteria());
                }
            }
            jButton5.setText("Tambah");
        } catch (SQLException ex) {
            Logger.getLogger(HalamanInputKriteriaPemohon.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_kriteriaCBItemStateChanged

    private void kriteriaDanSubKriteriaListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_kriteriaDanSubKriteriaListValueChanged
        // TODO add your handling code here:
        try{
            ItemList item = (ItemList) kriteriaDanSubKriteriaList.getSelectedValue();
            kriteriaCB.setSelectedItem(item.getNamaKriteria());
            subKriteriaCB.setSelectedItem(item.getNamaSubKriteria());
            jButton5.setText("Ubah");
            kriteriaCB.setEnabled(false);
            subKriteriaCB.setEnabled(true);
        }catch(Exception e){
            
        }
    }//GEN-LAST:event_kriteriaDanSubKriteriaListValueChanged

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        if (jButton5.getText().equalsIgnoreCase("Ubah")) {
//            jButton5.setText("Tambah");
//            kriteriaCB.setEnabled(true);
            ItemList item = (ItemList) KriteriaSubKriteriaListItem.get(kriteriaDanSubKriteriaList.getSelectedIndex());
            item.setNamaSubKriteria(subKriteriaCB.getSelectedItem().toString());
            item.setSkorSubKriteria(skorSubKriteria.get(subKriteriaCB.getSelectedIndex()));
            item.setIdSubKriteria(idSkorSubKriteria.get(subKriteriaCB.getSelectedIndex()));
            kriteriaDanSubKriteriaList.repaint();
            //kriteriaDanSubKriteriaList.setListData(KriteriaSubKriteriaListItem);

        }   
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            for (ItemList item : KriteriaSubKriteriaListItem) {
                PemohonController.getPemohonKontrol().updatePoinKriteriaWarga(nkk, item.getIdKriteria(), item.getSubKriteria());
            }
            for (ItemList item : KriteriaSubKriteriaListItemToDelete) {
                PemohonController.getPemohonKontrol().deletePoinKriteriaWarga(nkk, item.getIdKriteria());
            }
            JOptionPane.showMessageDialog(this, "data berhasil update");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "data gagal update");
//                Logger.getLogger(HalamanEditKriteriaPemohon.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
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
        private String idSubKriteria;
        private String namaKriteria;
        private double skorSubKriteria;
        private String namaSubKriteria;

        public ItemList() {
        }

        public ItemList(String idKriteria,String idSubKriteria, String namaKriteria, double skorSubKriteria, String namaSubKriteria) {
            this.idKriteria = idKriteria;
            this.idSubKriteria = idSubKriteria;
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
         * @param idKriteria the idKriteria to set
         */
        public void setIdSubKriteria(String idSubKriteria) {
            this.idSubKriteria = idSubKriteria;
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
        public SubKriteria getSubKriteria(){
            SubKriteria s=new SubKriteria();
            s.setBobot_subkriteria(skorSubKriteria);
            s.setId_subkriteriakriteria(idSubKriteria);
            s.setNama_subkriteria(namaSubKriteria);
            return s;
        }
        @Override
        public String toString() {
            return getNamaKriteria() + " = " + getNamaSubKriteria();
        }
    }
}
