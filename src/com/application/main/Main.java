package com.application.main;

import com.application.model.Employee;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.application.model.Student;

import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args){
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        Employee employee = context.getBean("employee",Employee.class);
        List<Student> studentList = employee.getStudentList();
        System.out.println("------------------------- Student List ------------------------------");
        for(Student studentlist : studentList){
            System.out.println(studentlist.getStudentId()+"\t"+studentlist.getStudentName()+"\t"+studentlist.getRollno()+"\t"+studentlist.getStudentAddress());
        }
        System.out.println("------------------------- Student Set ------------------------------");
        Set<Student> studentSet = employee.getStudentsSet();
        for(Student studentset : studentSet){
            System.out.println(studentset.getStudentId()+"\t"+studentset.getStudentName()+"\t"+studentset.getRollno()+"\t"+studentset.getStudentAddress());
        }
        System.out.println("------------------------- Student Array ------------------------------");
        Student[] studentsArray = employee.getEmployeeArray();
        for(Student studentarray : studentsArray){
            System.out.println(studentarray.getStudentId()+"\t"+studentarray.getStudentName()+"\t"+studentarray.getRollno()+"\t"+studentarray.getStudentAddress());
        }
        context.close();
    }
}
