package com.wad.springdata.domain;

import javax.persistence.*;

@Entity
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Paper paper;

    @ManyToOne
    private Reviewer reviewer;

    private String comments;
    private int grade;

    public void setId(Long id) {
        this.id = id;
    }
}
