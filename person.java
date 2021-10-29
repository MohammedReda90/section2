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
public class person {
    
    String name ;
    int phonenum;
    String email;
    Address address;

    public person(String name, int phonenum, String email, Address address) {
        this.name = name;
        this.phonenum = phonenum;
        this.email = email;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getPhonenum() {
        return phonenum;
    }

    public String getEmail() {
        return email;
    }

    public Address getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhonenum(int phonenum) {
        this.phonenum = phonenum;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
  
    
}
