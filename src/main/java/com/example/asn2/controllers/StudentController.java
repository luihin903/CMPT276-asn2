package com.example.asn2.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.asn2.models.Student;
import com.example.asn2.models.StudentRepository;

import jakarta.servlet.http.HttpServletResponse;

@Controller
public class StudentController {

    @Autowired
    public StudentRepository studentRepo;

    @GetMapping("/Student/display")
    public String getAllStudents(Model model) {

        System.out.println("Getting all students");
        // get all students from database
        List<Student> students = studentRepo.findAll();
        
        // end of database call
        model.addAttribute("st", students);
        return "Student/showAll";
    }

    @PostMapping("/Student/add")
    public String addStudent(@RequestParam Map<String, String> newstudent, HttpServletResponse response) {
        System.out.println("ADD student");
        Student s = new Student();
        s.name = newstudent.get("name");
        s.number = Integer.parseInt(newstudent.get("number"));
        s.height = Double.parseDouble(newstudent.get("height"));
        s.weight = Double.parseDouble(newstudent.get("weight"));
        s.color = newstudent.get("color");
        s.GPA = Double.parseDouble(newstudent.get("GPA"));
        s.birth = newstudent.get("birth");
        s.units = Integer.parseInt(newstudent.get("units"));
        studentRepo.save(s);
        response.setStatus(201);
        return "Student/addedStudent";
    }
}
