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
public class Assignment2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Address a = new Address("minia","taha hassen",24);
        person p = new person("mohamed",111111,"mm@gamil.com",a);
        System.out.println("the city is "+p.getAddress().city);
        System.out.println("the name is "+p.getName());
        
        myData d = new myData(2021,11,25);
        employee e = new employee("tucher",3500,d,"Ali",2222,"@gmail",a);
        System.out.println("the data month is "+e.getData().month);
        System.out.println("the salary is "+e.getSalary());
        
        student s =new student("freshman","mohamed",111111,"mm@gamil.com",a);
        System.out.println("the status is " + s.getStatus());
        
        faculty f =new faculty(8,"manger","tucher",3500,d,"Ali",2222,"@gmail",a);
        System.out.println("the street address "+f.getAddress().street);
        System.out.println("the hour of office work is "+f.officeHoure);
        
        staff st =new staff("bni mazer","tucher",3500,d,"Ali",2222,"@gmail",a);
        System.out.println("the data of day is "+st.getData().day);
        
    }
    
}
