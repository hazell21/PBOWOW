/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pbotugas1;

/**
 *
 * @author LENOVO
 */
import java.util.ArrayList;
import java.util.List;

public class Student {
   
    private String studentId;
    private String studentName;
    private List<Course> courses;

   
    public Student(String studentId, String studentName) {
        this.studentId = studentId;
        setStudentName(studentName); 
        this.courses = new ArrayList<>();
    }

  
    public String getStudentId() { return studentId; }
    public String getStudentName() { return studentName; }

    
    public void setStudentName(String studentName) {
        if (studentName == null || studentName.trim().isEmpty()) {
            System.out.println("Error Validasi: Nama mahasiswa tidak boleh kosong! Menggunakan nama default 'Anonim'.");
            this.studentName = "Anonim";
        } else {
            this.studentName = studentName;
        }
    }

   
    public void addCourse(Course course) {
        if (course == null) {
            System.out.println("Error Validasi: Data mata kuliah tidak valid (null).");
            return;
        }
        
        for (Course c : courses) {
            if (c.getCourseCode().equals(course.getCourseCode())) {
                System.out.println("Error Validasi: Mata kuliah " + course.getCourseName() + " sudah ada di transkrip.");
                return;
            }
        }
        
        courses.add(course);
        System.out.println("Sukses: Mata kuliah " + course.getCourseName() + " berhasil ditambahkan ke profil mahasiswa.");
    }

    
    public double calculateAverageGrade() {
        if (courses.isEmpty()) {
            return 0.0;
        }
        double totalGrade = 0;
        for (Course course : courses) {
            totalGrade += course.getGrade();
        }
        return totalGrade / courses.size();
    }

    
    public void printTranscript() {
        System.out.println("\n==================================");
        System.out.println("        TRANSKRIP NILAI");
        System.out.println("==================================");
        System.out.println("NIM   : " + studentId);
        System.out.println("Nama  : " + studentName);
        System.out.println("----------------------------------");
        for (Course course : courses) {
            System.out.println("- [" + course.getCourseCode() + "] " + course.getCourseName() + " : " + course.getGrade());
        }
        System.out.println("----------------------------------");
        System.out.println("RATA-RATA NILAI : " + String.format("%.2f", calculateAverageGrade()));
        System.out.println("==================================\n");
    }
}
