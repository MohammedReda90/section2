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
public class address {
    int StreetNO;
    String city;
    String country;

    public address() {
    }

    public address(int StreetNO, String city, String country) {
        this.StreetNO = StreetNO;
        this.city = city;
        this.country = country;
    }

    public int getStreetNO() {
        return StreetNO;
    }

    public void setStreetNO(int StreetNO) {
        this.StreetNO = StreetNO;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    
}
