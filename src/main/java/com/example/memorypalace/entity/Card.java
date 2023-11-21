package com.example.memorypalace.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "card")
@Getter
@Setter
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cardID;

    @ManyToOne
    @JoinColumn(name = "suitID")
    private CardSuit suit;

    @ManyToOne
    @JoinColumn(name = "rankID")
    private CardRank rank;

    @ManyToOne
    @JoinColumn(name = "personID")
    private Person person;

    // Getters and setters
}
