/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entity;

/**
 *
 * @author Administrator
 */
public class Room {
    private int roomNumber;
    private String roomType;
    private String roomStatusName;
    private String description;
    private int roomTypeID;
    private int roomStatusID;

    public Room() {
    }

    public Room(int roomNumber, String roomType, String roomStatusName, String description) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.roomStatusName = roomStatusName;
        this.description = description;
    }

    public Room(int roomNumber, int roomTypeID, int roomStatusID, String description) {
        this.roomNumber = roomNumber;
        this.roomTypeID = roomTypeID;
        this.roomStatusID = roomStatusID;
        this.description = description;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public String getRoomStatusName() {
        return roomStatusName;
    }

    public void setRoomStatusName(String roomStatusName) {
        this.roomStatusName = roomStatusName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getRoomTypeID() {
        return roomTypeID;
    }

    public void setRoomTypeID(int roomTypeID) {
        this.roomTypeID = roomTypeID;
    }

    public int getRoomStatusID() {
        return roomStatusID;
    }

    public void setRoomStatusID(int roomStatusID) {
        this.roomStatusID = roomStatusID;
    }
    
    
}
