package com.example.asn2.models;

import jakarta.persistence.*;

@Entity
@Table(name = "Student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;
    public String name;
    public int number;
    public double height;
    public double weight;
    public String color;
    public double GPA;
    public String birth;
    public int units;

    public Student() {}
    public Student(String name, int number, double height, double weight, String color, double GPA, String birth, int units) {
        this.name = name;
        this.number = number;
        this.height = height;
        this.weight = weight;
        this.color = color;
        this.GPA = GPA;
        this.birth = birth;
        this.units = units;
    }
}