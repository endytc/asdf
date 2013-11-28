/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * HalamanUtamaForm1.java
 *
 * Created on 03 Okt 13, 13:33:52
 */

package LOGIN;



//import ADMIN.HalamanDataPemohon;

import ADMIN.*;
import ADMIN.HalamanSimulasi1;
import ADMIN.HalamanEditKriteriaPemohon;
import DBConn.DatabaseConnection;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author user
 */
public class HalamanUtamaForm1 extends javax.swing.JFrame {

    /** Creates new form HalamanUtamaForm1 */
    public HalamanUtamaForm1() {
        initComponents();
        addWindowListener(new WindowAdapter() {

            @Override
            public void windowOpened(WindowEvent e) {
                setExtendedState(MAXIMIZED_BOTH);
            }
        });
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        inputdataItem = new javax.swing.JMenuItem();
        inputKriteriaItem = new javax.swing.JMenuItem();
        inputKriteriaPemohonItem = new javax.swing.JMenuItem();
        simulasiItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        editDanHapusKriteriaItem = new javax.swing.JMenuItem();
        editKriteriaPemohonItem = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        jLabel1.setFont(new java.awt.Font("Aharoni", 1, 24));
        jLabel1.setText("SISTEM PENDUKUNG KEPUTUSAN");

        jLabel2.setFont(new java.awt.Font("Aharoni", 1, 18));
        jLabel2.setText("SELEKSI PENERIMAAN JAMINAN KESEHATAN DAERAH");

        jLabel3.setFont(new java.awt.Font("Aharoni", 1, 24));
        jLabel3.setText("KABUPATEN BOJONEGORO");

        jLabel4.setIcon(new javax.swing.ImageIcon("D:\\IRE\\SKRIPSI\\SPPK(skripsi)\\Icon-Smile.jpg")); // NOI18N
        jLabel4.setText("jLabel4");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(262, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel3)))
                .addGap(164, 164, 164))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(379, 379, 379)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(309, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addContainerGap(98, Short.MAX_VALUE))
        );

        jPanel1.setBounds(0, 0, 890, 400);
        jDesktopPane1.add(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        getContentPane().add(jDesktopPane1);

        fileMenu.setText("File");
        fileMenu.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                fileMenuComponentMoved(evt);
            }
        });
        fileMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileMenuActionPerformed(evt);
            }
        });

        inputdataItem.setText("Data Pemohon");
        inputdataItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputdataItemActionPerformed(evt);
            }
        });
        fileMenu.add(inputdataItem);

        inputKriteriaItem.setText("Input Kriteria");
        inputKriteriaItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputKriteriaItemActionPerformed(evt);
            }
        });
        fileMenu.add(inputKriteriaItem);

        inputKriteriaPemohonItem.setText("Input Kriteria Pemohon");
        inputKriteriaPemohonItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputKriteriaPemohonItemActionPerformed(evt);
            }
        });
        fileMenu.add(inputKriteriaPemohonItem);

        simulasiItem.setText("Simulasi");
        simulasiItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simulasiItemActionPerformed(evt);
            }
        });
        fileMenu.add(simulasiItem);

        jMenuBar1.add(fileMenu);

        editMenu.setText("Edit");
        editMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editMenuActionPerformed(evt);
            }
        });

        editDanHapusKriteriaItem.setText("Edit dan Hapus Kriteria");
        editDanHapusKriteriaItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editDanHapusKriteriaItemActionPerformed(evt);
            }
        });
        editMenu.add(editDanHapusKriteriaItem);

        editKriteriaPemohonItem.setText("Edit Kriteria Pemohon");
        editKriteriaPemohonItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editKriteriaPemohonItemActionPerformed(evt);
            }
        });
        editMenu.add(editKriteriaPemohonItem);

        jMenuBar1.add(editMenu);

        jMenu1.setText("Logout");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-906)/2, (screenSize.height-438)/2, 906, 438);
    }// </editor-fold>//GEN-END:initComponents

    private void fileMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileMenuActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_fileMenuActionPerformed

    private void inputdataItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputdataItemActionPerformed
        // TODO add your handling code here:
        this.jDesktopPane1.removeAll();
        this.jDesktopPane1.setLayout(new GridLayout(1, 1));
        dataPemohonForm tambah = new dataPemohonForm();
        this.jDesktopPane1.add(tambah);
        int k = tambah.getPreferredSize().height + 55 + this.fileMenu.getPreferredSize().height;
        this.setSize(tambah.getPreferredSize().width + 50, k);
        setVisible(true);
    }//GEN-LAST:event_inputdataItemActionPerformed

    private void fileMenuComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_fileMenuComponentMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_fileMenuComponentMoved

    private void inputKriteriaItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputKriteriaItemActionPerformed
        // TODO add your handling code here:
        this.jDesktopPane1.removeAll();
        this.jDesktopPane1.setLayout(new GridLayout(1, 1));
        HalamanInputKriteria tambah = new HalamanInputKriteria();
        this.jDesktopPane1.add(tambah);
        int k = tambah.getPreferredSize().height + 55 + this.fileMenu.getPreferredSize().height;
        this.setSize(tambah.getPreferredSize().width + 50, k);
        setVisible(true);
    }//GEN-LAST:event_inputKriteriaItemActionPerformed

    private void inputKriteriaPemohonItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputKriteriaPemohonItemActionPerformed
        // TODO add your handling code here:
       this.jDesktopPane1.removeAll();
        this.jDesktopPane1.setLayout(new GridLayout(1, 1));
        HalamanInputKriteriaPemohon tambah = new HalamanInputKriteriaPemohon();
        this.jDesktopPane1.add(tambah);
        int k = tambah.getPreferredSize().height + 55 + this.fileMenu.getPreferredSize().height;
        this.setSize(tambah.getPreferredSize().width + 50, k);
        setVisible(true);
    }//GEN-LAST:event_inputKriteriaPemohonItemActionPerformed

    private void editDanHapusKriteriaItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editDanHapusKriteriaItemActionPerformed
        // TODO add your handling code here:
         this.jDesktopPane1.removeAll();
        this.jDesktopPane1.setLayout(new GridLayout(1, 1));
        editdanHapusKriteria  tambah = new editdanHapusKriteria();
        this.jDesktopPane1.add(tambah);
        int k = tambah.getPreferredSize().height + 55 + this.fileMenu.getPreferredSize().height;
        this.setSize(tambah.getPreferredSize().width + 50, k);
        setVisible(true);
    }//GEN-LAST:event_editDanHapusKriteriaItemActionPerformed

    private void editMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editMenuActionPerformed

    private void editKriteriaPemohonItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editKriteriaPemohonItemActionPerformed
        // TODO add your handling code here:
        this.jDesktopPane1.removeAll();
        this.jDesktopPane1.setLayout(new GridLayout(1, 1));
        HalamanEditKriteriaPemohon tambah = new HalamanEditKriteriaPemohon();
        this.jDesktopPane1.add(tambah);
        int k = tambah.getPreferredSize().height + 55 + this.fileMenu.getPreferredSize().height;
        this.setSize(tambah.getPreferredSize().width + 50, k);
        setVisible(true);
    }//GEN-LAST:event_editKriteriaPemohonItemActionPerformed

    private void simulasiItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simulasiItemActionPerformed
        // TODO add your handling code here:
         this.jDesktopPane1.removeAll();
        this.jDesktopPane1.setLayout(new GridLayout(1, 1));
        HalamanSimulasi1 tambah = new HalamanSimulasi1(this);
        this.jDesktopPane1.add(tambah);
        int k = tambah.getPreferredSize().height + 55 + this.fileMenu.getPreferredSize().height;
        this.setSize(tambah.getPreferredSize().width + 50, k);
        setVisible(true);
    }//GEN-LAST:event_simulasiItemActionPerformed

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        try {
            // TODO add your handling code here:
            DatabaseConnection conn = new DatabaseConnection();
            boolean check;
            check = conn.getClosed();
            konfirmasiLogout konfirmasi = new konfirmasiLogout(null, false);
            konfirmasi.setVisible(true);
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(HalamanUtamaForm1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenu1MouseClicked

    /**
    * @param args the command line arguments
    */
//    public static void main(String args[]) {
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new HalamanUtamaForm1().setVisible(true);
//            }
//        });
   // }//

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem editDanHapusKriteriaItem;
    private javax.swing.JMenuItem editKriteriaPemohonItem;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenuItem inputKriteriaItem;
    private javax.swing.JMenuItem inputKriteriaPemohonItem;
    private javax.swing.JMenuItem inputdataItem;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem simulasiItem;
    // End of variables declaration//GEN-END:variables

}
