package com.example.LMSBackend.RequestDto;

import jakarta.persistence.Column;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@NoArgsConstructor
public class AuthorRequestDto {
    private String name;

    @Column(unique = true)
    private String email;

    private int age;

    private String Country;

}
