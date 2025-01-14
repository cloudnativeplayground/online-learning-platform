package com.cloudnativeplayground.onlinelearningplatform.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String title;

    @Column(length = 1000)
    private String description;

    @Column(nullable = false)
    private String instructor;

    @OneToMany(mappedBy = "course", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Quiz> quizzes;

    @Column(nullable = false)
    private boolean certificationEnabled;

    @Column(nullable = false)
    private double price;

    public Course(Long id, String title, String description, String instructor, List<Quiz> quizzes, boolean certificationEnabled, double price) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.instructor = instructor;
        this.quizzes = quizzes;
        this.certificationEnabled = certificationEnabled;
        this.price = price;
    }

    public Course(String title, String description, String instructor, List<Quiz> quizzes, boolean certificationEnabled, double price) {
        this.title = title;
        this.description = description;
        this.instructor = instructor;
        this.quizzes = quizzes;
        this.certificationEnabled = certificationEnabled;
        this.price = price;
    }
    public Course(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public List<Quiz> getQuizzes() {
        return quizzes;
    }

    public void setQuizzes(List<Quiz> quizzes) {
        this.quizzes = quizzes;
    }

    public boolean isCertificationEnabled() {
        return certificationEnabled;
    }

    public void setCertificationEnabled(boolean certificationEnabled) {
        this.certificationEnabled = certificationEnabled;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

