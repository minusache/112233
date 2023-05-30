package com.wad.springdata.domain;

import javax.persistence.*;

@Entity
public class Reviewer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String expertise;

    public void setId(Long id) {
        this.id = id;
    }
}
