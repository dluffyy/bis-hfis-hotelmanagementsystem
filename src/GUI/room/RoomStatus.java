/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUI.room;

/**
 *
 * @author Administrator
 */
public class RoomStatus extends javax.swing.JFrame {

    /**
     * Creates new form RoomStatus
     */
    public RoomStatus() {
        initComponents();
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
        jTable1 = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Occupied", "A guest is currently occupied in the room."},
                {"Stayover", "The guest is not expected to check out today and will remain at least one more night."},
                {"On-Change", "The guest has departed, but the room has not yet been cleaned and ready for sale."},
                {"Do Not Disturb", "The guest has requested not to be disturbed."},
                {"Cleaning in progress", "Room attendant is currently cleaning this room."},
                {"Sleep-out", "A guest is registerd to the room, but the bed has not been used."},
                {"Skipper", "The guest has left the hotel without making arrangements to tsettle his or her account."},
                {"Vacant and ready", "The room has been cleaned and inspected and is ready for an arriving guest."},
                {"Out of Order", "Rooms kept under out of order are not sellable and these rooms are deducted from the hotels inventory.A room may be out-of-order for a variety of reasons, including the need of maintenance, refurbishing and extensive cleaning etc."},
                {"Out of Service", "Rooms kept under out of service are not deducted from the hotel inventory. This is a temporary blocking and reasons may be bulb fuse, T V remote not working, Kettle not working etc. These rooms are not assigned to the guest once these small maintenance issues are fixed."},
                {"Lock out", "The room has been locked so that the guest cannot re-enter until he or she is cleared by a hotel official."},
                {"Did not check out", "The guest made arrangements to settle his or her bills (and thus not a skipper), but has left without informing the front desk."},
                {"Due Out", "The room is expected to become vacant after the following guest checks out."},
                {"Check-Out", "The guest has settled his or her account, returned the room keys, and left the hotel."},
                {"Late Check out", "The guest has requested and is being allowed to check out later than the normal / standard departure time of the hotel."}
            },
            new String [] {
                "RoomStatusName", "RoomStatusDesc"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(150);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(150);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(150);
            jTable1.getColumnModel().getColumn(1).setMinWidth(650);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(650);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 776, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(RoomStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RoomStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RoomStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RoomStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RoomStatus().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
