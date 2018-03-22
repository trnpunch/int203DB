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

/**
 *
 * @author lambopunchh
 */
public class Programs {
    private int programId;
    private String programName;
    private String fee;

    public Programs() {
    }

    public Programs(ResultSet rs) throws SQLException {
        this.programId = rs.getInt("PROGRAMID");
        this.programName = rs.getString("PROGRAMNAME");
        this.fee = rs.getString("FEE");
    }

    
    private static final String FIND_BY_ID = "select * from PROGRAM where PROGRAMID = ?";
    public static Programs findById(int param) {
        Programs s = null;
        Connection conn = ConnectionBuilder.getCon();
        try {
            PreparedStatement pstm = conn.prepareStatement(FIND_BY_ID);
            pstm.setInt(1, param);
            ResultSet rs = pstm.executeQuery();

            while (rs.next()) {
                s = new Programs(rs);
            }
            rs.close();
            pstm.close();
            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        return s;
    }
    public int getProgramId() {
        return programId;
    }

    public void setProgramId(int programId) {
        this.programId = programId;
    }

    public String getProgramName() {
        return programName;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }

    public String getFee() {
        return fee;
    }

    public void setFee(String fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        return "Program{" + "programId=" + programId + ", programName=" + programName + ", fee=" + fee + '}';
    }
    
    
}
