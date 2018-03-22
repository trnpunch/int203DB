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
public class TableProgram {
    private int tableProgramId;
    private String programId;
    private String courseId;
    private String degreeId;

    public TableProgram() {
    }

    public TableProgram(ResultSet rs) throws SQLException {
        this.tableProgramId = rs.getInt("TABLEPROGRAMID");
                this.courseId = rs.getString("COURSEID");
        this.degreeId = rs.getString("DEGREEID");
        this.programId = rs.getString("PROGRAMID");
    }

    public int getTableProgramId() {
        return tableProgramId;
    }

    public void setTableProgramId(int tableProgramId) {
        this.tableProgramId = tableProgramId;
    }

    public String getProgramId() {
        return programId;
    }

    public void setProgramId(String programId) {
        this.programId = programId;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getDegreeId() {
        return degreeId;
    }

    public void setDegreeId(String degreeId) {
        this.degreeId = degreeId;
    }
    
    
    
}
