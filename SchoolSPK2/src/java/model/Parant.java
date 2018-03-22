/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lambopunchh
 */
public class Parant {
    int parantId ;
    String pName;
    String pAddress;
    String pPhone;

    public Parant(ResultSet rs) throws SQLException {
        this.parantId = rs.getInt("PARANTID");
        this.pName = rs.getString("PNAME");
        
        this.pAddress = rs.getString("PADDRESS");
        this.pPhone = rs.getString("PPHONE");
    }
private static final String FIND_BY_ID = "select * from PARANT where PARANTID = ?";
    public static Parant findById(int param) {
        Parant s = null;
        Connection conn = ConnectionBuilder.getCon();
        try {
            PreparedStatement pstm = conn.prepareStatement(FIND_BY_ID);
            pstm.setInt(1, param);
            ResultSet rs = pstm.executeQuery();

            while (rs.next()) {
                s = new Parant(rs);
            }
            rs.close();
            pstm.close();
            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        return s;
    }


    
    
    public Parant() {
    }

    public int getParantId() {
        return parantId;
    }

    public void setParantId(int parantId) {
        this.parantId = parantId;
    }

   
    public String getpName() {
        return pName;
    }

    public void setpName(String pame) {
        this.pName = pName;
    }

    public String getpAddress() {
        return pAddress;
    }

    public void setpAddress(String pAddress) {
        this.pAddress = pAddress;
    }

    public String getpPhone() {
        return pPhone;
    }

    public void setpPhone(String pPhone) {
        this.pPhone = pPhone;
    }

    @Override
    public String toString() {
        return "Parant{" + "parantId=" + parantId + ", pFName=" + pName + ", pAddress=" + pAddress + ", pPhone=" + pPhone + '}';
    }
    
}
