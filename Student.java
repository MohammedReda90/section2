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
public class Student {
    String name;
    int id;
    double GPA;
    subject  sd;
    address  add;

    public Student(String name, int id, double GPA, subject sd, address add) {
        this.name = name;
        this.id = id;
        this.GPA = GPA;
        this.sd = sd;
        this.add = add;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public subject getSd() {
        return sd;
    }

    public void setSd(subject sd) {
        this.sd = sd;
    }

    public address getAdd() {
        return add;
    }

    public void setAdd(address add) {
        this.add = add;
    }
   

   
   
}
