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
public class Address {
    
    String city;
    String street;
    int streetnum;

    public Address(String city, String street, int streetnum) {
        this.city = city;
        this.street = street;
        this.streetnum = streetnum;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getStreetnum() {
        return streetnum;
    }

    public void setStreetnum(int streetnum) {
        this.streetnum = streetnum;
    }
    
    
    
}
