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
public class Student_Inf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       address ad=new address(11,"mania","Egypt");
       subject su=new subject(66,"math",6);
       Student st=new Student("mohamed",1346,2.3,su,ad);
       
       System.out.println("the student name is "+st.name);
       System.out.println("the student GPA is "+st.GPA);
       System.out.println("the student ID "+ st.id);
       System.out.println("the city name is "+st.getAdd().city);
       System.out.println("the country nmae is "+st.getAdd().country);
       System.out.println(" the sybject name is "+st.getSd().subjectName);
       System.out.println("the subject ID "+st.getSd().subjectID);
       System.out.println("the subject Hourse "+st.getSd().subjectHours);
       
       
    }
    
}
