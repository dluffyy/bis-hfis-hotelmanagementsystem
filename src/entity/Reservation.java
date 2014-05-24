/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;

/**
 *
 * @author Administrator
 */
public class Reservation implements Serializable {

    private int reservationID;
    private int customerID;
    private String expectedCheckinDate;
    private String expectedCheckoutDate;
    private String arrivalTime;
    private int numGuests;
    private int roomTypeID;
    private String comment;

    public Reservation() {
    }

    public Reservation(int reservationID, int customerID, String expectedCheckinDate, String expectedCheckoutDate, String arrivalTime, int numGuests, int roomTypeID, String comment) {
        this.reservationID = reservationID;
        this.customerID = customerID;
        this.expectedCheckinDate = expectedCheckinDate;
        this.expectedCheckoutDate = expectedCheckoutDate;
        this.arrivalTime = arrivalTime;
        this.numGuests = numGuests;
        this.roomTypeID = roomTypeID;
        this.comment = comment;
    }

    public int getReservationID() {
        return reservationID;
    }

    public void setReservationID(int reservationID) {
        this.reservationID = reservationID;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getExpectedCheckinDate() {
        return expectedCheckinDate;
    }

    public void setExpectedCheckinDate(String expectedCheckinDate) {
        this.expectedCheckinDate = expectedCheckinDate;
    }

    public String getExpectedCheckoutDate() {
        return expectedCheckoutDate;
    }

    public void setExpectedCheckoutDate(String expectedCheckoutDate) {
        this.expectedCheckoutDate = expectedCheckoutDate;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public int getNumGuests() {
        return numGuests;
    }

    public void setNumGuests(int numGuests) {
        this.numGuests = numGuests;
    }

    public int getRoomTypeID() {
        return roomTypeID;
    }

    public void setRoomTypeID(int roomTypeID) {
        this.roomTypeID = roomTypeID;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

}
