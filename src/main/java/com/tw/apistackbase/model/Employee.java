package com.tw.apistackbase.model;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private int id;
    private String name;
    private int age;
    private String gender;

    public Employee() {
    }

    public Employee(int id, String name, int age, String gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public static List<Employee> getEmployeeList(){
        List<Employee> list = new ArrayList<>();
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();
        Employee employee4 = new Employee();
        employee1.setId(1);
        employee1.setName("张三");
        employee1.setAge(18);
        employee1.setGender("女");

        employee2.setId(2);
        employee2.setName("李四");
        employee2.setAge(19);
        employee2.setGender("男");

        employee3.setId(3);
        employee3.setName("王五");
        employee3.setAge(20);
        employee3.setGender("男");

        employee4.setId(4);
        employee4.setName("郭六");
        employee4.setAge(21);
        employee4.setGender("男");

        list.add(employee1);
        list.add(employee2);
        list.add(employee3);
        list.add(employee4);
        return list;
    }
}
