/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jtable_Layout;

import java.awt.Component;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
/**
 *
 * @author truonghdpk
 */
public class Jtable_Vector extends javax.swing.JFrame {

    /**
     * Creates new form Jtable_Jframe
     */
    public Jtable_Vector() {
        initComponents();
        initResolver();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        delAction = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        addToggleAction = new javax.swing.JButton();
        toggleAddItem = new javax.swing.JPanel();
        addItemAction = new javax.swing.JButton();
        clearItemAction = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        msvItem = new javax.swing.JTextField();
        hotenItem = new javax.swing.JTextField();
        gioiTinhItem = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        daiSoItem = new javax.swing.JTextField();
        kinhTeItem = new javax.swing.JTextField();
        trietHocItem = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(850, 650));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        delAction.setText("Xoa");
        delAction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delActionActionPerformed(evt);
            }
        });
        getContentPane().add(delAction, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 106, 35));

        table.setAutoCreateRowSorter(true);
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MSV", "Ho ten", "Gioi tinh", "Dai so", "Kinh te", "Triet hoc"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        table.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        table.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tableFocusGained(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 520, 143));

        addToggleAction.setText("Them moi");
        addToggleAction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToggleActionActionPerformed(evt);
            }
        });
        getContentPane().add(addToggleAction, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 106, 35));

        toggleAddItem.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        toggleAddItem.setEnabled(false);

        addItemAction.setText("Them");
        addItemAction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addItemActionActionPerformed(evt);
            }
        });

        clearItemAction.setText("Clear");
        clearItemAction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearItemActionActionPerformed(evt);
            }
        });

        jLabel7.setText("MSV");

        jLabel8.setText("Ho ten");

        jLabel9.setText("Gioi tinh");

        msvItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                msvItemActionPerformed(evt);
            }
        });

        jLabel2.setText("Thong tin SV");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(hotenItem)
                    .addComponent(msvItem)
                    .addComponent(gioiTinhItem, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel2)
                .addGap(0, 71, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(msvItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hotenItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gioiTinhItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel10.setText("Kinh te");

        jLabel11.setText("Triet hoc");

        jLabel12.setText("Dai so");

        daiSoItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                daiSoItemActionPerformed(evt);
            }
        });

        kinhTeItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kinhTeItemActionPerformed(evt);
            }
        });

        jLabel3.setText("Diem so");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(daiSoItem)
                    .addComponent(kinhTeItem)
                    .addComponent(trietHocItem, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(131, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(daiSoItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(kinhTeItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(trietHocItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Them sinh vien");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout toggleAddItemLayout = new javax.swing.GroupLayout(toggleAddItem);
        toggleAddItem.setLayout(toggleAddItemLayout);
        toggleAddItemLayout.setHorizontalGroup(
            toggleAddItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(toggleAddItemLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(toggleAddItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(addItemAction, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(toggleAddItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(toggleAddItemLayout.createSequentialGroup()
                        .addComponent(clearItemAction, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, toggleAddItemLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(188, 188, 188))
        );
        toggleAddItemLayout.setVerticalGroup(
            toggleAddItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(toggleAddItemLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(toggleAddItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(toggleAddItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(clearItemAction)
                    .addComponent(addItemAction, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        getContentPane().add(toggleAddItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 520, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Bang Quan Ly Diem Sinh Vien");
        jLabel4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 648, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(0, 7, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 20, 650, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tableFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tableFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_tableFocusGained

    private void delActionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delActionActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        if(table.getSelectedRow() != -1) {
           // remove selected row from the model
           model.removeRow(table.getSelectedRow());
           JOptionPane.showMessageDialog(null, "Xoa thanh cong");
        }
        else {
           JOptionPane.showMessageDialog(null, "Hang can xoa chua duoc chon"); 
        }
    }//GEN-LAST:event_delActionActionPerformed

    private void msvItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_msvItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_msvItemActionPerformed

    private void daiSoItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daiSoItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_daiSoItemActionPerformed

    private void kinhTeItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kinhTeItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kinhTeItemActionPerformed

    private void addToggleActionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToggleActionActionPerformed
        // TODO add your handling code here:
        System.out.println("Toggle add action");
        toggleAddItem.setVisible(!this.initShow);
        this.initShow = !this.initShow;
    }//GEN-LAST:event_addToggleActionActionPerformed

    
    private void addItemActionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addItemActionActionPerformed
        // TODO add your handling code here:
        System.out.println("Add item action");
//        System.out.println(msvItem.getText());
//        System.out.println(hotenItem.getText());
//        System.out.println(gioiTinhItem.getText());
//        System.out.println(daiSoItem.getText());
//        System.out.println(kinhTeItem.getText());
//        System.out.println(trietHocItem.getText());
        // check condition 
        if(msvItem.getText().length() == 0){
            JOptionPane.showMessageDialog(null, "Ma sinh vien khong duoc de trong");
        }
        else if(hotenItem.getText().length() == 0){
            JOptionPane.showMessageDialog(null, "Ho ten khong duoc de trong");
        }
        else if(gioiTinhItem.getText().length() == 0){
            JOptionPane.showMessageDialog(null, "Gioi tinh khong duoc de trong");
        }
        else if(daiSoItem.getText().length() == 0){
            JOptionPane.showMessageDialog(null, "Diem dai so khong duoc de trong");
        }
        else if(kinhTeItem.getText().length() == 0){
            JOptionPane.showMessageDialog(null, "Diem kinh te khong duoc de trong");
        }
        else if(trietHocItem.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Diem triet hoc khong duoc de trong");
        }
        // note ArrayList and Vector
        Vector<String> newRow = new Vector<String>();
        newRow.add(msvItem.getText());
        newRow.add(hotenItem.getText());
        newRow.add(gioiTinhItem.getText());
        newRow.add(daiSoItem.getText());
        newRow.add(kinhTeItem.getText());
        newRow.add(trietHocItem.getText());
        this.addItemToTable(newRow);
    }//GEN-LAST:event_addItemActionActionPerformed
    
    
    private void clearItemActionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearItemActionActionPerformed
        // TODO add your handling code here:
        System.out.println("Clear item action");
        msvItem.setText("");
        hotenItem.setText("");
        gioiTinhItem.setText("");
        daiSoItem.setText("");
        kinhTeItem.setText("");
        trietHocItem.setText("");

    }//GEN-LAST:event_clearItemActionActionPerformed
    
    private void addItemToTable(Vector<String> newItem){
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.addRow(newItem);
        table.repaint();
    }
    
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
            java.util.logging.Logger.getLogger(Jtable_Vector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jtable_Vector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jtable_Vector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jtable_Vector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jtable_Vector().setVisible(true);
            }
        });
    }
    
    private void initResolver(){
        
        // include model 
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        
        // set width of Msv
        TableColumnModel columnModel = table.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(100);
      
        // set width of Hoten
        columnModel.getColumn(1).setPreferredWidth(150);
        
        // init data
        model.addRow(new Object[]{"2017603561", "Nguyen Van Chinh", "Nam", "7", "8", "6"});
     
        model.addRow(new Object[]{"2018648652", "Nguyen Thi Lan", "Nu", "6", "7", "7.5"});
        
        model.addRow(new Object[]{"2018968745", "Nguyen Thi Lan", "Nu", "6", "7", "7.5"});
        
        model.addRow(new Object[]{"2018649268", "Nguyen Thanh Dat", "Nam", "4", "9", "2"});
     
        model.addRow(new Object[]{"2018648986", "Nguyen Thi Phuong ", "Nu", "8", "7", "7"});
        
        model.addRow(new Object[]{"2018748325", "Nguyen Hong Anh", "Nu", "5", "9", "10"});
        
        model.addRow(new Object[]{"2017603561", "Nguyen Hai Hung", "Nam", "8", "8", "7"});
     
        model.addRow(new Object[]{"2018648652", "Nguyen Ngoc Anh", "Nu", "7", "7", "7.5"});
        
        model.addRow(new Object[]{"2018896511", "Nguyen Thi Lan", "Nu", "6", "7", "7.5"});
        
        table.repaint();
    }

    private boolean initShow = true;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addItemAction;
    private javax.swing.JButton addToggleAction;
    private javax.swing.JButton clearItemAction;
    private javax.swing.JTextField daiSoItem;
    private javax.swing.JButton delAction;
    private javax.swing.JTextField gioiTinhItem;
    private javax.swing.JTextField hotenItem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField kinhTeItem;
    private javax.swing.JTextField msvItem;
    private javax.swing.JTable table;
    private javax.swing.JPanel toggleAddItem;
    private javax.swing.JTextField trietHocItem;
    // End of variables declaration//GEN-END:variables
}
