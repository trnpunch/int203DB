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
public class StudentCourse {

    private int stdCourseId;
    private int stdId;
    private int tableProgramId;
    private String year;
    private String semester;
    private String grade;

    public StudentCourse() {
    }

    public StudentCourse(ResultSet rs) throws SQLException {
        this.stdCourseId = rs.getInt("STDCOURSEID");
        this.year = rs.getString("YEARS");
        this.semester = rs.getString("SEMESTER");
        this.grade = rs.getString("GRADE");

        this.stdId = rs.getInt("STUDENTID");
        this.tableProgramId = rs.getInt("TABLEPROGRAMID");
    }
    private static final String FIND_BY_ID = "select * from STUDENTCOURSE where STUDENTID = ? and YEARS like ? AND SEMESTER like ?";

    public static List<StudentCourse> findById(int id,String y,String se){
        StudentCourse stc = null;
        List<StudentCourse> s = null;
         Connection conn = ConnectionBuilder.getCon();
        try {
            PreparedStatement pstm = conn.prepareStatement(FIND_BY_ID);
            pstm.setInt(1, id);
            pstm.setString(2, y);
            pstm.setString(3, se);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                stc = new StudentCourse(rs);
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
    public int getStdCourseId() {
        return stdCourseId;
    }

    public void setStdCourseId(int stdCourseId) {
        this.stdCourseId = stdCourseId;
    }

    public int getStdId() {
        return stdId;
    }

    public void setStdId(int stdId) {
        this.stdId = stdId;
    }

    public int getTableProgramId() {
        return tableProgramId;
    }

    public void setTableProgramId(int tableProgramId) {
        this.tableProgramId = tableProgramId;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return  stdCourseId + "     " + stdId + "     " + tableProgramId + "     " + year + "    " + semester + "     " + grade ;
    }
    

}
