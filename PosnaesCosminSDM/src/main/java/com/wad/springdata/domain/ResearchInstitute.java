package com.wad.springdata.domain;

import javax.persistence.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@Entity
public class ResearchInstitute {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String address;

    public void setId(Long id) {
        this.id = id;
    }

}