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
public class Course {
    int courseId;
    String courseCode;
    String courseName;
    int teacherId;
    int degreeId;

    public Course() {
    }

    public Course(ResultSet rs) throws SQLException {
        this.courseId = rs.getInt("COURSEID");
        this.courseCode = rs.getString("COURSECODE");
        this.courseName = rs.getString("COURSENAME");
        this.teacherId = rs.getInt("TEACHERID");
                this.degreeId = rs.getInt("DEGREEID");

    }

    public static List<Course> findByTe(int paran){
        Course c = null;
        List<Course> s = null;
         Connection conn = ConnectionBuilder.getCon();
        try {
            PreparedStatement pstm = conn.prepareStatement("select * from COURSE WHERE TEACHERID = ? ");
            pstm.setInt(1, paran);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                c = new Course(rs);
                if (s == null) {
                    s = new ArrayList<>();
                }
                s.add(c);
            }
            rs.close();
            pstm.close();
            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        return s;        
    }
    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }
    
    
}
