/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Reservation;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrator
 */
public class ReservationManagement {

    public DefaultTableModel displayReservation(DefaultTableModel dtm) {
        DataConnection dataConnection = new DataConnection();
        Connection conn = dataConnection.openConnection();
        try {
            String query = "Select * from Reservation";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            String value[];
            while (rs.next()) {
                value = new String[8];
                value[0] = rs.getString("ReservationID");
                value[1] = rs.getString("CustomerID");
                value[2] = rs.getString("ExpectedCheckinDate");
                value[3] = rs.getString("ExpectedCheckoutDate");
                value[4] = rs.getString("ArrivalTime");
                value[5] = rs.getString("NumberGuests");
                value[6] = rs.getString("RoomTypeID");
                value[7] = rs.getString("Comments");
                dtm.addRow(value);
            }
            dtm.fireTableDataChanged();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(ReservationManagement.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dtm;
    }

    public void newReservation(Reservation reservation) {
        DataConnection dataConnection = new DataConnection();
        Connection conn = dataConnection.openConnection();
        try {
            int reservationID = reservation.getReservationID();
            int customerID = reservation.getCustomerID();
            String expectedCheckinDate = reservation.getExpectedCheckinDate();
            String expectedCheckoutDate = reservation.getExpectedCheckoutDate();
            String arrivalTime = reservation.getArrivalTime();
            int numberGuests = reservation.getNumGuests();
            int roomTypeID = reservation.getRoomTypeID();
            String comment = reservation.getComment();
            String query = "EXEC new_reservation " + reservationID + ", " + customerID + ", '" + expectedCheckinDate + "', '" + expectedCheckoutDate + "', '" + arrivalTime + "', " + numberGuests + ", " + roomTypeID + ", '" + comment + "'";
            PreparedStatement ps = conn.prepareCall(query);
            ps.executeUpdate();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(ReservationManagement.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void updateReservation(Reservation reservation) {
        DataConnection dataConnection = new DataConnection();
        Connection conn = dataConnection.openConnection();
        try {
            int reservationID = reservation.getReservationID();
            int customerID = reservation.getCustomerID();
            String expectedCheckinDate = reservation.getExpectedCheckinDate();
            String expectedCheckoutDate = reservation.getExpectedCheckoutDate();
            String arrivalTime = reservation.getArrivalTime();
            int numberGuests = reservation.getNumGuests();
            int roomTypeID = reservation.getRoomTypeID();
            String comment = reservation.getComment();
            String query = "EXEC update_reservation " + reservationID + ", " + customerID + ", '" + expectedCheckinDate + "', '" + expectedCheckoutDate + "', '" + arrivalTime + "', " + numberGuests + ", " + roomTypeID + ", '" + comment + "'";
            PreparedStatement ps = conn.prepareCall(query);
            ps.executeUpdate();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(ReservationManagement.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void removeReservation(int reservationID) {
        DataConnection dataConnection = new DataConnection();
        Connection conn = dataConnection.openConnection();
        try {
            String query = "EXEC remove_reservation " + reservationID;
            PreparedStatement ps = conn.prepareCall(query);
            ps.executeUpdate();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(ReservationManagement.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
