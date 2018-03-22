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
public class Degree {
    int degreeId;
    String degreeName;

    public Degree() {
    }

    public Degree(ResultSet rs) throws SQLException {
        this.degreeId = rs.getInt("DEGREEID");
        this.degreeName = rs.getString("DEGREENAME");
             
    }

    public int getDegreeId() {
        return degreeId;
    }

    public void setDegreeId(int degreeId) {
        this.degreeId = degreeId;
    }

    public String getDegreeName() {
        return degreeName;
    }

    public void setDegreeName(String degreeName) {
        this.degreeName = degreeName;
    }
    
    
}
