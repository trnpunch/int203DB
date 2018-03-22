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
public class DegreeRoom {
    int deRoomId;
    String roomClass;
    int degreeId ;

    public DegreeRoom(ResultSet rs) throws SQLException {
        this.deRoomId = rs.getInt("DEROOMID");
        this.roomClass = rs.getString("ROOMCLASS");
        this.degreeId = rs.getInt("DEGREEID");
    }

    public DegreeRoom() {
    }

    public int getDeRoomId() {
        return deRoomId;
    }

    public void setDeRoomId(int deRoomId) {
        this.deRoomId = deRoomId;
    }

    public String getRoomClass() {
        return roomClass;
    }

    public void setRoomClass(String roomClass) {
        this.roomClass = roomClass;
    }

    public int getDegreeId() {
        return degreeId;
    }

    public void setDegreeId(int degreeId) {
        this.degreeId = degreeId;
    }
    
    
}
