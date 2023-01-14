package com.example.LMSBackend.Service;

import com.example.LMSBackend.Convertor.AuthorConvertor;
import com.example.LMSBackend.Models.Author;
import com.example.LMSBackend.Repository.AuthorRepository;
import com.example.LMSBackend.RequestDto.AuthorRequestDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class AuthorService {
    @Autowired
    AuthorRepository authorrepository;


    public String createauthors(AuthorRequestDto authorRequestDto){
        // we are sending this to convertor which converts Dto into Entity
        try{
            Author author = AuthorConvertor.convertDtotoEntity(authorRequestDto);
            authorrepository.save(author);
        }catch(Exception e){
            log.info("create Author has caused a issue");
            return "create author didnt work";

        }

       return "Author created successfully";
    }
}
