/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

/**
 *
 * @author hp
 */
public class employee extends person {
    
    String office;
    double salary;
    myData data;

    public employee(String office, double salary, myData data, String name, int phonenum, String email, Address address) {
        super(name, phonenum, email, address);
        this.office = office;
        this.salary = salary;
        this.data = data;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public myData getData() {
        return data;
    }

    public void setData(myData data) {
        this.data = data;
    }
    
    
    
    
    
}
