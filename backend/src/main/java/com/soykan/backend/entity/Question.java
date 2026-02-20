package com.soykan.backend.entity;

import jakarta.persistence.*;

@Entity
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(nullable=false)
    private String question;

    @Column(nullable=false)
    private String correctAnswer;

    @Column(nullable=false)
    private String wrongAnswer1;

    @Column(nullable=false)
    private String wrongAnswer2;

    @ManyToOne
    @JoinColumn(nullable=false)
    private Lesson lesson;

}
