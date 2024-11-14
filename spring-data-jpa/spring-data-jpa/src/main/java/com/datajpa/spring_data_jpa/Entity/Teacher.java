package com.datajpa.spring_data_jpa.Entity;

import jakarta.persistence.*;

import java.util.List;

public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long techerID;
    private String firstName;
    private String lastName;

    @OneToMany(
            cascade = CascadeType.ALL,mappedBy="course"
    )
    @JoinColumn()
    private List<Course> courses;




}
