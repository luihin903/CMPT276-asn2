package com.example.asn2.models;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer>{
    List<Student> findByWeight(double weight);
    List<Student> findByNameAndNumber(String name, int number);
    List<Student> findById(int id);
}
