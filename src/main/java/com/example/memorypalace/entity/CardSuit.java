package com.example.memorypalace.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "card_suit")
@Getter
@Setter
public class CardSuit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long suitID;

    private String suitName;

}
