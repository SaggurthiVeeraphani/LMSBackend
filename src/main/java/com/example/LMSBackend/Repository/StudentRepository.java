package com.example.LMSBackend.Repository;

import com.example.LMSBackend.Models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

// student entity,Primary key type is Integer

public interface StudentRepository extends JpaRepository<Student,Integer> {


}
