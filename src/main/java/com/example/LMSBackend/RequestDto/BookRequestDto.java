package com.example.LMSBackend.RequestDto;

import com.example.LMSBackend.Enums.Genre;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class BookRequestDto {
    private String name;

    @Enumerated(value = EnumType.STRING)
    private Genre genre;

     private int authorId;
}
