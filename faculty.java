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
public class faculty extends employee {
    
    int officeHoure;
    String rank;

    public faculty(int officeHoure, String rank, String office, double salary, myData data, String name, int phonenum, String email, Address address) {
        super(office, salary, data, name, phonenum, email, address);
        this.officeHoure = officeHoure;
        this.rank = rank;
    }

    public int getOfficeHoure() {
        return officeHoure;
    }

    public void setOfficeHoure(int officeHoure) {
        this.officeHoure = officeHoure;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
    
    

   
    
    
    
}
