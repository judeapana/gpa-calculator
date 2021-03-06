/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

import net.proteanit.sql.DbUtils;

/**
 * @author Jude
 */
public class GpaCal extends javax.swing.JFrame {

    /**
     * Creates new form GpaCal
     */
    Connection myCon = null;
    PreparedStatement stmt = null;

    public void LoadData() {
        try {
            myCon = SqliteConnection.pushConn();
            String sqlStat = "SELECT id,courseName,creditHours,mark,grade_point FROM gpatb";
            PreparedStatement stmtSql = myCon.prepareStatement(sqlStat);
            ResultSet result = stmtSql.executeQuery();
            this.dataTable.setModel(DbUtils.resultSetToTableModel(result));
            myCon.close();
        } catch (Exception e) {
            MessageBox.show("DataBase Error Occurred ", "Error", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
    }

    public GpaCal() {
        initComponents();
        this.LoadData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        markTxt = new javax.swing.JTextField();
        creditHourseTxt = new javax.swing.JTextField();
        courseNameTxt = new javax.swing.JComboBox();
        addScoreBtn = new javax.swing.JButton();
        resetFieldTxt = new javax.swing.JButton();
        computeGPABtn = new javax.swing.JButton();
        resetAndCloseBtn = new javax.swing.JButton();
        deleteScoreBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        dataTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MY GPA CALCULATOR");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(255, 153, 153));
        setName("mainWindow"); // NOI18N

        jLabel2.setText("Course");

        jLabel3.setText("Credit Hours");

        jLabel4.setText("Marks");

        courseNameTxt.setEditable(true);
        courseNameTxt.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"Computer Graphics", "Design Algorithm", "Programming with Java", "Complier Construction", "Artficial Intelligence", "Queuing Systems"}));

        addScoreBtn.setText("Add Score");
        addScoreBtn.setName("addScoreBtn"); // NOI18N
        addScoreBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addScoreBtnActionPerformed(evt);
            }
        });

        resetFieldTxt.setText("Reset Field");
        resetFieldTxt.setToolTipText("");
        resetFieldTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetFieldTxtActionPerformed(evt);
            }
        });

        computeGPABtn.setText("Computate GPA");
        computeGPABtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                computeGPABtnActionPerformed(evt);
            }
        });

        resetAndCloseBtn.setText("Reset And Close");
        resetAndCloseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetAndCloseBtnActionPerformed(evt);
            }
        });

        deleteScoreBtn.setText("Delete Score");
        deleteScoreBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteScoreBtnActionPerformed(evt);
            }
        });

        dataTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null}
                },
                new String[]{
                        "Course", "Credit Hours", "Mark"
                }
        ) {
            boolean[] canEdit = new boolean[]{
                    false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        jScrollPane2.setViewportView(dataTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(resetAndCloseBtn))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(29, 29, 29)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(courseNameTxt, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(creditHourseTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(markTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(addScoreBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, Short.MAX_VALUE)
                                                                .addComponent(resetFieldTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                        .addComponent(deleteScoreBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(computeGPABtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 674, Short.MAX_VALUE)))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(resetAndCloseBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(courseNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(35, 35, 35)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(creditHourseTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(35, 35, 35)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(markTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(addScoreBtn)
                                                        .addComponent(resetFieldTxt))
                                                .addGap(18, 18, 18)
                                                .addComponent(deleteScoreBtn)
                                                .addGap(10, 10, 10)
                                                .addComponent(computeGPABtn))
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void deleteScoreBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteScoreBtnActionPerformed
        if (this.dataTable.getSelectedColumn() == -1) {
            MessageBox.show("Please Select An Item From The Table", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }
        try {
            String itemId = this.dataTable.getModel().getValueAt(this.dataTable.getSelectedRow(), 0).toString();
            if (itemId.isEmpty()) {
                MessageBox.show("Please Select An Item From The Table", "Error", JOptionPane.WARNING_MESSAGE);
            }

            myCon = SqliteConnection.pushConn();
            stmt = myCon.prepareStatement("DELETE FROM gpatb WHERE id=?");
            stmt.setInt(1, Integer.parseInt(itemId));
            stmt.execute();
            this.LoadData();
        } catch (SQLException ex) {
            Logger.getLogger(GpaCal.class.getName()).log(Level.SEVERE, null, ex);
            MessageBox.show("Error Occurred", "Error", JOptionPane.WARNING_MESSAGE);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GpaCal.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_deleteScoreBtnActionPerformed


    private void addScoreBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addScoreBtnActionPerformed
        String courseName = this.courseNameTxt.getSelectedItem().toString();
        Integer creditHours;
        Double mark;
        if (courseName.isEmpty()) {
            MessageBox.show("Course Name is not allowed to be empty", "Warning Message", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (Integer.parseInt(this.creditHourseTxt.getText()) < 0) {
            MessageBox.show("Credit Hours cant be less than 0", "Warning Message", JOptionPane.WARNING_MESSAGE);
            return;
        }
        try {
            creditHours = Integer.parseInt(this.creditHourseTxt.getText());
        } catch (Exception e) {
            MessageBox.show("Invalid Credit Hours Provided", "Warning Message", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (Double.parseDouble(this.markTxt.getText()) < 0) {
            MessageBox.show("Invalid mark provided mark cant be less than 0", "Warning Message", JOptionPane.WARNING_MESSAGE);
            return;
        }
        try {
            mark = Double.parseDouble(this.markTxt.getText());
        } catch (Exception e) {
            MessageBox.show("Invalid Mark Provided", "Warning Message", JOptionPane.WARNING_MESSAGE);
            return;
        }
        try {
            myCon = SqliteConnection.pushConn();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GpaCal.class.getName()).log(Level.SEVERE, null, ex);
        }
        String sqlStatement = "INSERT INTO gpatb (courseName,creditHours,mark,grade_point) VALUES(?,?,?,?)";
        try {
            GPAClass f = new GPAClass(courseName, creditHours, mark);
            stmt = myCon.prepareStatement(sqlStatement);

            stmt.setString(1, f.getCourseName());
            stmt.setInt(2, f.getCreditHours());
            stmt.setDouble(3, f.getMark());
            stmt.setDouble(4, GPAClass.gradePointCal(mark));
            stmt.executeUpdate();
            this.LoadData();
            this.creditHourseTxt.setText("");
            this.markTxt.setText("");
//            this.dataTable.setModel(DbUtils.resultSetToTableModel(data));
        } catch (SQLException ex) {
            Logger.getLogger(GpaCal.class.getName()).log(Level.SEVERE, null, ex);
            MessageBox.show("Operation Not Completed", "Warning Message", JOptionPane.WARNING_MESSAGE);

        }
    }//GEN-LAST:event_addScoreBtnActionPerformed

    private void resetFieldTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetFieldTxtActionPerformed

        this.creditHourseTxt.setText("");
        this.markTxt.setText("");
    }//GEN-LAST:event_resetFieldTxtActionPerformed

    private void resetAndCloseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetAndCloseBtnActionPerformed
        try {
            myCon = SqliteConnection.pushConn();
            String sqlStatement = "DELETE FROM gpatb";
            stmt = myCon.prepareStatement(sqlStatement);
            stmt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(GpaCal.class.getName()).log(Level.SEVERE, null, ex);
            MessageBox.show("Unable To Complete Task", "Error Occurred", JOptionPane.ERROR_MESSAGE);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GpaCal.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            System.exit(0);
        }
    }//GEN-LAST:event_resetAndCloseBtnActionPerformed

    private void computeGPABtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_computeGPABtnActionPerformed
        try {
            myCon = SqliteConnection.pushConn();
            String sqlStatement = "SELECT creditHours,mark,grade_point FROM gpatb";
            stmt = myCon.prepareStatement(sqlStatement);
            ResultSet result = stmt.executeQuery();
            int countCreditHours = 0;
            Double tgp = 0.0;

            while (result.next()) {
                countCreditHours += result.getInt("creditHours");
                tgp += result.getInt("creditHours") * result.getDouble("grade_point");

            }
            Double yourGpa = GPAClass.calGpa(countCreditHours, tgp);
            MessageBox.show("Your GPA is : " + String.format("%.2f", yourGpa) + " And Your Class Is : " + GPAClass.determineClass(yourGpa), "Your GPA", JOptionPane.OK_CANCEL_OPTION);

        } catch (SQLException ex) {
            Logger.getLogger(GpaCal.class.getName()).log(Level.SEVERE, null, ex);
            MessageBox.show("Unable To Complete Task", "Error Occurred", JOptionPane.ERROR_MESSAGE);

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GpaCal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_computeGPABtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GpaCal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GpaCal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GpaCal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GpaCal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GpaCal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addScoreBtn;
    private javax.swing.JButton computeGPABtn;
    private javax.swing.JComboBox courseNameTxt;
    private javax.swing.JTextField creditHourseTxt;
    private javax.swing.JTable dataTable;
    private javax.swing.JButton deleteScoreBtn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField markTxt;
    private javax.swing.JButton resetAndCloseBtn;
    private javax.swing.JButton resetFieldTxt;
    // End of variables declaration//GEN-END:variables
}
