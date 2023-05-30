package com.wad.springdata.domain;

import javax.persistence.*;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String password;
    private boolean receiveUpdates;

    public void setId(Long id) {
        this.id = id;
    }
}
