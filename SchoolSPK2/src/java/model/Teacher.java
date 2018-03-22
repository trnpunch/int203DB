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

/**
 *
 * @author lambopunchh
 */
public class Teacher {
    private int teacherId;
    private String tName;
   
    private String tPhone;
    private String teacherRoom;
    private String tsub;

    public Teacher(ResultSet rs) throws SQLException {
        this.teacherId = rs.getInt("TEACHERID");
        this.tName = rs.getString("TNAME");
        this.tPhone = rs.getString("TPHONE");
        this.teacherRoom = rs.getString("TEACHERROOM");
        this.tsub = rs.getString("TSUB");
    }  
    private static final String FIND_BY_ID = "select * from TEACHER where TEACHERID = ?";

   
    public Teacher() {
    }
    private static final String FIND_BY_ID2 = "select * from TEACHER where TEACHERID = ? ";

    public static Teacher findById2(int param) {
        Teacher s = null;
        Connection conn = ConnectionBuilder.getCon();
        try {
            PreparedStatement pstm = conn.prepareStatement(FIND_BY_ID2);
            pstm.setInt(1, param);

            ResultSet rs = pstm.executeQuery();

            while (rs.next()) {
                s = new Teacher(rs);

            }
            rs.close();
            pstm.close();
            conn.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return s;
    }
    
     private static final String FIND_BY_ID3 = "select * from STUDENTCOURSE where STUDENTID = ? and YEARS like ? AND SEMESTER like ?";

    public static List<Teacher> findById(int id,String y,String se){
        Teacher stc = null;
        List<Teacher> s = null;
         Connection conn = ConnectionBuilder.getCon();
        try {
            PreparedStatement pstm = conn.prepareStatement(FIND_BY_ID3);
            pstm.setInt(1, id);
            pstm.setString(2, y);
            pstm.setString(3, se);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                stc = new Teacher(rs);
                if (s == null) {
                    s = new ArrayList<>();
                }
                s.add(stc);
            }
            rs.close();
            pstm.close();
            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        return s;
    }

    
    @Override
    public String toString() {
        return "Teacher{" + "teacherId=" + teacherId + ", tName=" + tName + ", tPhone=" + tPhone + ", teacherRoom=" + teacherRoom + ", tsub=" + tsub + '}';
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName;
    }

    public String gettPhone() {
        return tPhone;
    }

    public void settPhone(String tPhone) {
        this.tPhone = tPhone;
    }

    public String getTeacherRoom() {
        return teacherRoom;
    }

    public void setTeacherRoom(String teacherRoom) {
        this.teacherRoom = teacherRoom;
    }

    public String getTsub() {
        return tsub;
    }

    public void setTsub(String tsub) {
        this.tsub = tsub;
    }
    
    
}