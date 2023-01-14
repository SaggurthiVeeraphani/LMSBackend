package com.example.LMSBackend.Models;

import com.example.LMSBackend.Enums.CardStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter

public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    @Enumerated(value = EnumType.STRING)
    private CardStatus cardStatus;

    // This is a unidirectional type you are connecting the child card to parent student
    @OneToOne
    @JoinColumn
    private Student student;
}
