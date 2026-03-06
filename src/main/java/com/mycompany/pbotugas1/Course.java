/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pbotugas1;

/**
 *
 * @author LENOVO
 */
public class Course {
    
    private String courseCode;
    private String courseName;
    private double grade;

    
    public Course(String courseCode, String courseName) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.grade = 0.0; 
    }

    
    public String getCourseCode() { return courseCode; }
    public String getCourseName() { return courseName; }
    public double getGrade() { return grade; }

    
    public void setGrade(double grade) {
        if (grade < 0 || grade > 100) {
            System.out.println("Error Validasi: Nilai untuk " + courseName + " gagal ditambahkan. Nilai harus antara 0 dan 100.");
        } else {
            this.grade = grade;
            System.out.println("Sukses: Nilai " + grade + " berhasil dimasukkan untuk " + courseName);
        }
    }
}
