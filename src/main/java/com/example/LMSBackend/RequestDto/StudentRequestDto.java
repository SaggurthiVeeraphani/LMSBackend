package com.example.LMSBackend.RequestDto;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

public class StudentRequestDto {
    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String email;

    private int age;

    private String country;
}
