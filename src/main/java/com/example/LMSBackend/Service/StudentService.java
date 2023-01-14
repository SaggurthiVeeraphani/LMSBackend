package com.example.LMSBackend.Service;

import com.example.LMSBackend.Enums.CardStatus;
import com.example.LMSBackend.Models.Card;
import com.example.LMSBackend.Models.Student;
import com.example.LMSBackend.Repository.StudentRepository;
import com.example.LMSBackend.RequestDto.StudentRequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
@Autowired
StudentRepository studentrepository;
@Autowired
CardService cardservice;

public String addstudent(StudentRequestDto studentrequestdto){
    Student student = new Student();
    student.setAge(studentrequestdto.getAge());
    student.setName(studentrequestdto.getName());
    student.setEmail(studentrequestdto.getEmail());
    student.setCountry(studentrequestdto.getCountry());

    Card newcard = new Card();

   newcard.setCardStatus(CardStatus.ACTIVATED);

   newcard.setStudent(student);// for the new foreign column

    student.setCard(newcard);


    studentrepository.save(student);

    //cardRepository.save() will automatically  be taken of
    return "card successfully added";

}
}
