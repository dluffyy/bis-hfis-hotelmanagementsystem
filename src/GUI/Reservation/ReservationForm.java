/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Reservation;

import dao.ReservationManagement;
import entity.Reservation;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrator
 */
public class ReservationForm extends javax.swing.JFrame {

    /**
     * Creates new form Reservation
     */
    public ReservationForm() {
        initComponents();
        this.loadData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbReservation = new javax.swing.JTable();
        jToolBar1 = new javax.swing.JToolBar();
        btnNewReservation = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        btnEdit = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        btnRemove = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        jButton1 = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        jButton2 = new javax.swing.JButton();
        jToolBar2 = new javax.swing.JToolBar();
        txtKeySearch = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JToolBar.Separator();
        cbbSearch = new javax.swing.JComboBox();
        jSeparator6 = new javax.swing.JToolBar.Separator();
        btnSearch = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        tbReservation.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ReservationID", "CustomerID", "ExpectedCheckinDate", "ExpectedCheckoutDate", "ArrivalTime", "NumberGuests", "RoomTypeID", "Comments"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbReservation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbReservationMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbReservation);

        jToolBar1.setRollover(true);

        btnNewReservation.setBackground(new java.awt.Color(255, 255, 255));
        btnNewReservation.setForeground(new java.awt.Color(0, 0, 153));
        btnNewReservation.setText("New Reservation");
        btnNewReservation.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 204)));
        btnNewReservation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewReservationActionPerformed(evt);
            }
        });
        jToolBar1.add(btnNewReservation);

        jSeparator1.setBorder(new javax.swing.border.MatteBorder(null));
        jToolBar1.add(jSeparator1);

        btnEdit.setBackground(new java.awt.Color(255, 255, 255));
        btnEdit.setForeground(new java.awt.Color(0, 0, 153));
        btnEdit.setText("Edit");
        btnEdit.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 204)));
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        jToolBar1.add(btnEdit);

        jSeparator2.setBorder(new javax.swing.border.MatteBorder(null));
        jToolBar1.add(jSeparator2);

        btnRemove.setBackground(new java.awt.Color(255, 255, 255));
        btnRemove.setForeground(new java.awt.Color(0, 0, 153));
        btnRemove.setText("Remove");
        btnRemove.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 204)));
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });
        jToolBar1.add(btnRemove);

        jSeparator3.setBorder(new javax.swing.border.MatteBorder(null));
        jToolBar1.add(jSeparator3);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setForeground(new java.awt.Color(0, 0, 153));
        jButton1.setText("Checkin");
        jButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 204)));
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton1);

        jSeparator4.setBorder(new javax.swing.border.MatteBorder(null));
        jToolBar1.add(jSeparator4);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setForeground(new java.awt.Color(0, 0, 153));
        jButton2.setText("Checkout");
        jButton2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 204)));
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton2);

        jToolBar2.setRollover(true);
        jToolBar2.setAlignmentX(0.0F);
        jToolBar2.setAlignmentY(0.5F);

        txtKeySearch.setFont(new java.awt.Font("Dialog", 2, 11)); // NOI18N
        txtKeySearch.setForeground(new java.awt.Color(0, 0, 153));
        txtKeySearch.setText("Key Search ...");
        txtKeySearch.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 204)));
        jToolBar2.add(txtKeySearch);

        jSeparator5.setBorder(new javax.swing.border.MatteBorder(null));
        jToolBar2.add(jSeparator5);

        cbbSearch.setBackground(new java.awt.Color(255, 255, 255));
        cbbSearch.setForeground(new java.awt.Color(0, 0, 153));
        cbbSearch.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Search By:" }));
        cbbSearch.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 204)));
        jToolBar2.add(cbbSearch);

        jSeparator6.setBorder(new javax.swing.border.MatteBorder(null));
        jToolBar2.add(jSeparator6);

        btnSearch.setBackground(new java.awt.Color(255, 255, 255));
        btnSearch.setForeground(new java.awt.Color(0, 0, 153));
        btnSearch.setText("Search");
        btnSearch.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 204)));
        jToolBar2.add(btnSearch);

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 624, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewReservationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewReservationActionPerformed
        NewReservation nr = new NewReservation(this, rootPaneCheckingEnabled);
        nr.setVisible(true);
        this.loadData();
    }//GEN-LAST:event_btnNewReservationActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        UpdateReservation ur = new UpdateReservation(this, rootPaneCheckingEnabled);
        ur.setVisible(true);
        this.loadData();
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(this, "The selected record will be deleted. \nDo you understand ?", "Warning", dialogButton);
        if (dialogResult == 0) {
            int index = tbReservation.getSelectedRow();
            int reservationID = Integer.parseInt(tbReservation.getValueAt(index, 0).toString());
            DefaultTableModel dtm = (DefaultTableModel) tbReservation.getModel();
            dtm.removeRow(index);
            dtm.fireTableDataChanged();
            tbReservation.setModel(dtm);
            ReservationManagement rm = new ReservationManagement();
            rm.removeReservation(reservationID);
            JOptionPane.showMessageDialog(this, "Success !");
        } else {
        }
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void tbReservationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbReservationMouseClicked
//        UpdateReservation ur = new UpdateReservation(this, rootPaneCheckingEnabled);
//        ur.setVisible(true);
//        this.loadData();
    }//GEN-LAST:event_tbReservationMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        CheckinForm cf = new CheckinForm(this, rootPaneCheckingEnabled);
        cf.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(ReservationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReservationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReservationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReservationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReservationForm().setVisible(true);
            }
        });
    }

    public void loadData() {
        ReservationManagement rm = new ReservationManagement();
        DefaultTableModel dtm = new DefaultTableModel();
        String[] columnName = {"ReservationID", "CustomerID", "ExpectedCheckinDate", "ExpectedCheckoutDate", "ArrivalTime", "NumberGuests", "RoomTypeID", "Comment"};
        dtm.setColumnIdentifiers(columnName);
        dtm = rm.displayReservation(dtm);
        dtm.fireTableDataChanged();
        tbReservation.setModel(dtm);
    }

    public Reservation getData() {
        int index = tbReservation.getSelectedRow();
        int reservationID = Integer.parseInt(tbReservation.getValueAt(index, 0).toString());
        int customerID = Integer.parseInt(tbReservation.getValueAt(index, 1).toString());
        String expectedCheckinDate = tbReservation.getValueAt(index, 2).toString();
        String expectedCheckoutDdate = tbReservation.getValueAt(index, 3).toString();
        String arrivalTime = tbReservation.getValueAt(index, 4).toString();
        int numberGuests = Integer.parseInt(tbReservation.getValueAt(index, 5).toString());
        int roomTypeID = Integer.parseInt(tbReservation.getValueAt(index, 6).toString());
        String comment = tbReservation.getValueAt(index, 7).toString();
        Reservation reservation = new Reservation(reservationID, customerID, expectedCheckinDate, expectedCheckoutDdate, arrivalTime, numberGuests, roomTypeID, comment);
        return reservation;
    }

    public int returnReservationID(){
        int index = tbReservation.getSelectedRow();
        int reservationID = Integer.parseInt(tbReservation.getValueAt(index, 0).toString());
        return reservationID;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnNewReservation;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox cbbSearch;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar.Separator jSeparator5;
    private javax.swing.JToolBar.Separator jSeparator6;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JTable tbReservation;
    private javax.swing.JTextField txtKeySearch;
    // End of variables declaration//GEN-END:variables
}
