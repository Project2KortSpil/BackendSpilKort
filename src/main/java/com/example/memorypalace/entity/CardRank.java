package com.example.memorypalace.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "card_rank")
@Getter
@Setter
public class CardRank {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long rankID;

    private String rankName;

}
