/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student_inf;

/**
 *
 * @author hp
 */
public class subject {
    int subjectID;
    String subjectName;
    int subjectHours;

    public subject() {
    }

    public subject(int subjectID, String subjectName, int subjectHours) {
        this.subjectID = subjectID;
        this.subjectName = subjectName;
        this.subjectHours = subjectHours;
    }

    public int getSubjectID() {
        return subjectID;
    }

    public void setSubjectID(int subjectID) {
        this.subjectID = subjectID;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getSubjectHours() {
        return subjectHours;
    }

    public void setSubjectHours(int subjectHours) {
        this.subjectHours = subjectHours;
    }
    
}
