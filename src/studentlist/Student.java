/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package studentlist;

/**
 *
 * @author Iman Alghanimi
 */
public class Student {
    private int studId;
    private String studName;
    
    public Student (){}
    
        public Student(int studId, String studName) {
        this.studId = studId;
        this.studName = studName;
    }
    
    
    
    
    public String getStudName() {
        return studName;
    }

    public void setStudName(String studName) {
        this.studName = studName;
    }

    public int getStudId() {
        return studId;
    }

    public void setStudId(int studId) {
        this.studId = studId;
    }

}
