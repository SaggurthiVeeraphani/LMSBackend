package com.example.LMSBackend.Convertor;

import com.example.LMSBackend.Models.Author;
import com.example.LMSBackend.RequestDto.AuthorRequestDto;

public class AuthorConvertor {
    public static Author convertDtotoEntity(AuthorRequestDto authorRequestDto){

        Author author = Author.builder().
                        name(authorRequestDto.getName()).
                        email(authorRequestDto.getEmail()).
                        age(authorRequestDto.getAge()).
                        Country(authorRequestDto.getCountry()).build();
        return author;


    }
}
