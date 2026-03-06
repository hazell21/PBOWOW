/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pbotugas1;

/**
 *
 * @author LENOVO
 */
public class PBOTUGAS1 {
    public static void main(String[] args) {
        System.out.println("--- MULAI SIMULASI STUDENT GRADE SYSTEM ---\n");

      
        Student student1 = new Student("103012400142", ""); 
        student1.setStudentName("Pedil gemink"); 

       
        Course math = new Course("CS101", "DKA");
        Course oop = new Course("CS102", "PBO");
        Course db = new Course("CS103", "Jarkom");

        System.out.println("\n--- PENGISIAN NILAI ---");
      
        math.setGrade(-15.0); 
        math.setGrade(85.5);  

        oop.setGrade(110.0);  
        oop.setGrade(92.0);  
        
        db.setGrade(88.0);   

        System.out.println("\n--- PENAMBAHAN KELAS KE MAHASISWA ---");
     
        student1.addCourse(null); 
        student1.addCourse(math); 
        student1.addCourse(math); 
        student1.addCourse(oop);
        student1.addCourse(db);   

       
        student1.printTranscript();
    }
}
