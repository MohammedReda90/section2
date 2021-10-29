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
public class staff extends employee{
    
    String title;

    public staff(String title, String office, double salary, myData data, String name, int phonenum, String email, Address address) {
        super(office, salary, data, name, phonenum, email, address);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
    
    
}
