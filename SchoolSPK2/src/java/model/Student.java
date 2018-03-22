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
import java.nio.charset.StandardCharsets;

/**
 *
 * @author lambopunchh
 */
public class Student {

    private int sId;
    private String sFName;
    private String sLName;

    private String sAddress;
    private String sPhone;
    private String classroom;
    private int programId;
    private int parantId;
    private int deRoomId;
    private String dob;

    public Student(ResultSet rs) throws SQLException {
        this.sId = rs.getInt("STUDENTID");

        this.sAddress = rs.getString("STDADDRESS");
        this.sPhone = rs.getString("STDPHONE");

        this.parantId = rs.getInt("PARANTID");
        this.programId = rs.getInt("PROGRAMID");

        this.deRoomId = rs.getInt("DEROOMID");
        this.dob = rs.getString("DOB");
        this.sFName = rs.getString("FNAME");
        this.sLName = rs.getString("LNAME");
    }

    private static final String FIND_BY_NAME = "select * from STUDENT where FNAME like ?";
    private static final String FIND_BY_ID = "select * from STUDENT where STUDENTID = ? and DOB = ?";
    private static final String FIND_BY_ID2 = "select * from STUDENT where STUDENTID = ? ";

    public static List<Student> findByName(String param) {
        Student s = null;
        List<Student> std = null;
        Connection conn = ConnectionBuilder.getCon();
        try {
            PreparedStatement pstm = conn.prepareStatement(FIND_BY_NAME);
            pstm.setString(1, param + "%");
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                s = new Student(rs);
                if (std == null) {
                    std = new ArrayList<>();
                }
                std.add(s);
            }
            rs.close();
            pstm.close();
            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        return std;
    }

    public static Student findById(int param,String param2) {
        Student s = null;
        Connection conn = ConnectionBuilder.getCon();
        try {
            PreparedStatement pstm = conn.prepareStatement(FIND_BY_ID);
            pstm.setInt(1, param);
                        pstm.setString(2, param2);

            ResultSet rs = pstm.executeQuery();

            while (rs.next()) {
                s = new Student(rs);

            }
            rs.close();
            pstm.close();
            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        return s;
    }
 public static Student findById2(int param) {
        Student s = null;
        Connection conn = ConnectionBuilder.getCon();
        try {
            PreparedStatement pstm = conn.prepareStatement(FIND_BY_ID2);
            pstm.setInt(1, param);

            ResultSet rs = pstm.executeQuery();

            while (rs.next()) {
                s = new Student(rs);

            }
            rs.close();
            pstm.close();
            conn.close();
        } catch (Exception e) {
            System.out.println(e+"");
        }

        return s;
    }

    @Override
    public String toString() {
        return "Student{" + "sId=" + sId + ", sFName=" + sFName + ", sLName=" + sLName + ", sAddress=" + sAddress + ", sPhone=" + sPhone + ", classroom=" + classroom + ", programId=" + programId + ", parantId=" + parantId + ", roomId=" + deRoomId + ", dob=" 
                + dob.substring(0, 2)+"/"+dob.substring(2, 4)+"/"+(dob.substring(4, dob.length())) + '}';
    }

    public static void parantStudent(int param) {

    }

    public Student() {
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    public int getProgramId() {
        return programId;
    }

    public void setProgramId(int programId) {
        this.programId = programId;
    }

    public int getParantId() {
        return parantId;
    }

    public void setParantId(int parantId) {
        this.parantId = parantId;
    }

    public int getRoomId() {
        return deRoomId;
    }

    public void setRoomId(int roomId) {
        this.deRoomId = roomId;
    }

    public String getDob() {
        String dob2 = dob;
       
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public int getsId() {
        return sId;
    }

    public void setsId(int sId) {
        this.sId = sId;
    }

    public String getsFName() {
        return sFName;
    }

    public void setsFName(String sFName) {
        this.sFName = sFName;
    }

    public String getsLName() {
        return sLName;
    }

    public void setsLName(String sLName) {
        this.sLName = sLName;
    }

    public String getsAddress() {
        return sAddress;
    }

    public void setsAddress(String sAddress) {
        this.sAddress = sAddress;
    }

    public String getsPhone() {
        return sPhone;
    }

    public void setsPhone(String sPhone) {
        this.sPhone = sPhone;
    }

}
