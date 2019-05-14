package com.application.model;

import java.util.List;
import java.util.Set;

public class Employee {
    public Student employeeArray[] = new Student[4];
    public List<Student> studentList;
    public Set<Student> studentsSet;

    public Student[] getEmployeeArray() {
        return employeeArray;
    }

    public void setEmployeeArray(Student[] employeeArray) {
        this.employeeArray = employeeArray;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public Set<Student> getStudentsSet() {
        return studentsSet;
    }

    public void setStudentsSet(Set<Student> studentsSet) {
        this.studentsSet = studentsSet;
    }
}
