/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Room;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.management.Query;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrator
 */
public class RoomManagement {
    
    public void updateRoom(Room room){
        DataConnection dc = new DataConnection();
        Connection conn = dc.openConnection();
        String query = "Update Room set RoomTypeID = " + room.getRoomTypeID() + ", RoomStatusID = " + room.getRoomStatusID() + ", Description = '" + room.getDescription() + "' where RoomNumber = " + room.getRoomNumber();
        try {
            PreparedStatement ps = conn.prepareCall(query);
            ps.executeUpdate();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(RoomManagement.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public DefaultTableModel viewListRoom(){
        DefaultTableModel dtm = new DefaultTableModel();
        String[] columnName = {"RoomNumber", "RoomType", "RoomStatusName", "Description"};
        dtm.setColumnIdentifiers(columnName);
        DataConnection dc = new DataConnection();
        Connection conn = dc.openConnection();
        String query = "select * from v_Room";
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while(rs.next()){
                String value[] = new String[4];
                value[0] = rs.getString("RoomNumber");
                value[1] = rs.getString("RoomType");
                value[2] = rs.getString("RoomStatusName");
                value[3] = rs.getString("Description");
                dtm.addRow(value);
            }
        } catch (SQLException ex) {
            Logger.getLogger(RoomManagement.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dtm;
    }
    
    public DefaultComboBoxModel viewListRoomStatus() {
        DataConnection dc = new DataConnection();
        DefaultComboBoxModel dcbm = new DefaultComboBoxModel();
        Connection conn = dc.openConnection();
        String query = "select (RoomStatusName) from RoomStatus";
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                String element = rs.getString("RoomStatusName");
                dcbm.addElement(element);
            }
        } catch (SQLException ex) {
            Logger.getLogger(RoomManagement.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dcbm;
    }
    
    public DefaultComboBoxModel viewListRoomType() {
        DataConnection dc = new DataConnection();
        DefaultComboBoxModel dcbm = new DefaultComboBoxModel();
        Connection conn = dc.openConnection();
        String query = "select * from RoomType";
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                String element = rs.getString("RoomType");
                dcbm.addElement(element);
            }
        } catch (SQLException ex) {
            Logger.getLogger(RoomManagement.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dcbm;
    }
}
