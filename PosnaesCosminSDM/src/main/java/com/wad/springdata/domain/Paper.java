package com.wad.springdata.domain;

import javax.persistence.*;

@Entity
public class Paper {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String abstractText;
    private String fileUrl;
    public void setId(Long id) {
        this.id = id;
    }
}
