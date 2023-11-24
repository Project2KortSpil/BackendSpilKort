package com.example.memorypalace.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "PAOentry")
@Getter
@Setter
public class PAOentry {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long paoentryid;

    private String name;
    private String image;
    private String action;
    private String object;

}
