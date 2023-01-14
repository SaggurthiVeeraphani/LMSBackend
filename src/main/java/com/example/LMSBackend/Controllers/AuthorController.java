package com.example.LMSBackend.Controllers;


import com.example.LMSBackend.RequestDto.AuthorRequestDto;
import com.example.LMSBackend.Service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/author")
public class AuthorController {
    @Autowired
    AuthorService authorservice;

    @PostMapping("/create-author")
    public String createauthor(@RequestBody() AuthorRequestDto authorRequestDto){
        return authorservice.createauthors(authorRequestDto);
    }
}
