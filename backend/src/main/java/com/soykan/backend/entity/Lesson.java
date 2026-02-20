package com.soykan.backend.entity;

import jakarta.persistence.*;

@Entity
public class Lesson {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(nullable=false)
    private String header;

    @Column(nullable=false)
    private String content;

    @Column(nullable=false)
    private int sequence_number;

    @ManyToOne
    @JoinColumn(nullable=false)
    private Subject subject;
}
