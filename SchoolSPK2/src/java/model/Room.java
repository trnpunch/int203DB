/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author lambopunchh
 */
public class Room {
    private int roomId;
    private String bulid;
    private String Floor;
    private String degreeID;

    public Room() {
    }

    public Room(ResultSet rs) throws SQLException {
        this.roomId = rs.getInt("ROOMID");
        this.bulid = rs.getString("BULID");
        this.Floor = rs.getString("FLOOR");
        this.degreeID = rs.getString("degreeID");
    }

    
    
    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public String getBulid() {
        return bulid;
    }

    public void setBulid(String bulid) {
        this.bulid = bulid;
    }

    public String getFloor() {
        return Floor;
    }

    public void setFloor(String Floor) {
        this.Floor = Floor;
    }

    public String getDegreeID() {
        return degreeID;
    }

    public void setDegreeID(String degreeID) {
        this.degreeID = degreeID;
    }

 
    
}
