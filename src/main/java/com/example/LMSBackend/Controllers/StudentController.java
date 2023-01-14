package com.example.LMSBackend.Controllers;

import com.example.LMSBackend.RequestDto.StudentRequestDto;
import com.example.LMSBackend.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Student")
public class StudentController {
    @Autowired
    StudentService studentservice;

    @PostMapping("/create")
    public ResponseEntity<String> createStudent(@RequestBody()StudentRequestDto studentRequestDto){

        String result = studentservice.addstudent(studentRequestDto);

        return new ResponseEntity<>(result, HttpStatus.CREATED);

    }
}
