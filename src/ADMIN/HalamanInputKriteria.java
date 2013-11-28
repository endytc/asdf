/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * HalamanKriteria.java
 *
 * Created on 07 Okt 13, 8:44:19
 */
package ADMIN;

import Controller.KriteriaController;
import Entity.*;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.Format;
import java.text.NumberFormat;
import java.util.Formatter;
import java.util.Locale;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import sun.beans.editors.DoubleEditor;

/**
 *
 * @author user
 */
public class HalamanInputKriteria extends javax.swing.JPanel {

    private final double[] nilaiPrioritas = {1.0, 0.67, 0.33};

    /** Creates new form HalamanKriteria */
    public HalamanInputKriteria() {
        initComponents();
        DefaultTableModel model = (DefaultTableModel) subKriteriaTabel.getModel();
        Vector columnName = new Vector();
        columnName.add("Kode Sub Kriteria");
        columnName.add("Nama Sub Kriteria");
        columnName.add("Bobot");

        Vector databaru = new Vector();
        Vector row1 = new Vector();
        row1.add("SUB-1");
        row1.add("");
        double bobot = 1 / 1;
        row1.add(doubleFormat(bobot));
        databaru.add(row1);
        model.setDataVector(databaru, columnName);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kriteriaLabel = new javax.swing.JLabel();
        kodeKriteriaLabel = new javax.swing.JLabel();
        namaKriteriaLabel = new javax.swing.JLabel();
        tingkatPrioritasCBLabel = new javax.swing.JLabel();
        kodekriteriaTF = new javax.swing.JTextField();
        namaKriteriaTF = new javax.swing.JTextField();
        tingkatPrioritasCB = new javax.swing.JComboBox();
        jSeparator1 = new javax.swing.JSeparator();
        kriteriaLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        subKriteriaTabel = new javax.swing.JTable();
        simpanButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        kriteriaLabel.setFont(new java.awt.Font("Traditional Arabic", 1, 18));
        kriteriaLabel.setText("SUB KRITERIA");

        kodeKriteriaLabel.setText("Kode Kriteria");

        namaKriteriaLabel.setText("Nama Kriteria");

        tingkatPrioritasCBLabel.setText("Tingkat Prioritas");

        tingkatPrioritasCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Prioritas 1", "Prioritas 2", "Prioritas 3", " " }));
        tingkatPrioritasCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tingkatPrioritasCBActionPerformed(evt);
            }
        });

        kriteriaLabel1.setFont(new java.awt.Font("Traditional Arabic", 1, 18));
        kriteriaLabel1.setText("KRITERIA ");

        subKriteriaTabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, "", null},
                {null, "", null},
                {null, "", null},
                {null, null, null}
            },
            new String [] {
                "kode Sub Kriteria", "Nama Sub Kriteria", "Bobot"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(subKriteriaTabel);

        simpanButton.setText("SIMPAN");
        simpanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanButtonActionPerformed(evt);
            }
        });

        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Remove");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(kriteriaLabel1)
                        .addGap(294, 294, 294))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(kodeKriteriaLabel)
                                    .addComponent(namaKriteriaLabel))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(namaKriteriaTF, javax.swing.GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE)
                                    .addComponent(kodekriteriaTF, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tingkatPrioritasCBLabel)
                                .addGap(18, 18, 18)
                                .addComponent(tingkatPrioritasCB, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(109, 109, 109))))
            .addGroup(layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 677, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(278, 278, 278)
                .addComponent(kriteriaLabel)
                .addContainerGap(293, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(315, 315, 315)
                .addComponent(simpanButton)
                .addContainerGap(319, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kriteriaLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(kodeKriteriaLabel)
                    .addComponent(kodekriteriaTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namaKriteriaLabel)
                    .addComponent(namaKriteriaTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tingkatPrioritasCBLabel)
                    .addComponent(tingkatPrioritasCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(kriteriaLabel)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(simpanButton)
                .addContainerGap(82, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void simpanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanButtonActionPerformed
        try {
            // TODO add your handling code here:
            Kriteria kriteriaBaru = new Kriteria();
            String kode_kriteria = kodekriteriaTF.getText();
//            System.out.println(kodekriteriaTF.getText());
            String nama_kriteria = namaKriteriaTF.getText();
            double prioritas = nilaiPrioritas[tingkatPrioritasCB.getSelectedIndex()];

            kriteriaBaru.setId_kriteria(kode_kriteria);
            kriteriaBaru.setNama_kriteria(nama_kriteria);
            kriteriaBaru.setBobot_kriteria(prioritas);
            for (int i = 0; i < subKriteriaTabel.getRowCount(); i++) {
                SubKriteria sub = new SubKriteria();
                String kode_subkriteria = subKriteriaTabel.getValueAt(i, 0).toString();
                String nama_subkriteria = subKriteriaTabel.getValueAt(i, 1).toString();
//                System.out.println(nama_subkriteria);
                String bobot = subKriteriaTabel.getValueAt(i, 2).toString();
                double bobotkriteria = Double.parseDouble(bobot);
                sub.setId_subkriteriakriteria(kode_subkriteria);
                sub.setNama_subkriteria(nama_subkriteria);
                sub.setBobot_subkriteria(bobotkriteria);

                kriteriaBaru.addSubkriteria(sub);



            }
            KriteriaController pemkon = KriteriaController.getKriteriaKontrol();
            pemkon.insertData(kriteriaBaru);
            JOptionPane.showMessageDialog(this, "Data berhasil disimpan");
        } catch (SQLException ex) {
            Logger.getLogger(HalamanInputKriteria.class.getName()).log(Level.SEVERE, null, ex);
        }



    }//GEN-LAST:event_simpanButtonActionPerformed

    private void tingkatPrioritasCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tingkatPrioritasCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tingkatPrioritasCBActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) subKriteriaTabel.getModel();
        if (model.getRowCount() < 5) {
            Vector databaru = new Vector();
            model.addRow(databaru);
            for (int i = 0; i < model.getRowCount(); i++) {
                double row = (i + 1);
                double bobot = row / model.getRowCount();
//                System.out.println(row + "/" + model.getRowCount() + "=" + bobot);//
                model.setValueAt(doubleFormat(bobot), i, 2);
                model.setValueAt("SUB-" + (i + 1), i, 0);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) subKriteriaTabel.getModel();
        if (model.getRowCount() > 0) {
            if (subKriteriaTabel.getSelectedRow() != -1) {
                model.removeRow(subKriteriaTabel.getSelectedRow());
            } else {
                model.removeRow(model.getRowCount() - 1);
            }
            for (int i = 0; i < model.getRowCount(); i++) {
                double row = (i + 1);
                double bobot = row / model.getRowCount();
//                System.out.println(row + "/" + model.getRowCount() + "=" + bobot);
                model.setValueAt(doubleFormat(bobot), i, 2);
                model.setValueAt("SUB-" + (i + 1), i, 0);
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel kodeKriteriaLabel;
    private javax.swing.JTextField kodekriteriaTF;
    private javax.swing.JLabel kriteriaLabel;
    private javax.swing.JLabel kriteriaLabel1;
    private javax.swing.JLabel namaKriteriaLabel;
    private javax.swing.JTextField namaKriteriaTF;
    private javax.swing.JButton simpanButton;
    private javax.swing.JTable subKriteriaTabel;
    private javax.swing.JComboBox tingkatPrioritasCB;
    private javax.swing.JLabel tingkatPrioritasCBLabel;
    // End of variables declaration//GEN-END:variables

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        HalamanInputKriteria hik = new HalamanInputKriteria();
        frame.add(hik);
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public String doubleFormat(double decimal) {
        Locale currentLocale = new Locale("en", "US");
        NumberFormat nf = NumberFormat.getInstance(currentLocale);
        DecimalFormat formater = (DecimalFormat) nf;
        formater.applyPattern("0.00");
        return formater.format(decimal);
    }
}
