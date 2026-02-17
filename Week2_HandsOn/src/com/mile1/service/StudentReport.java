package com.mile1.service;

import com.mile1.bean.Student;

public class StudentReport {

    public String findGrade(Student studentObject){
        int[] marks = studentObject.getMarks();
        int sum = 0;
        for (int i = 0; i < marks.length; i++) {
            if (marks[i]<35) {
                return "F Grade";
                break;
            }
        }
        if Student.
    }
}
