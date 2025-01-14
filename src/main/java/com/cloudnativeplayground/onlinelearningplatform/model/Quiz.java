package com.cloudnativeplayground.onlinelearningplatform.model;

import jakarta.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "quizzes")
public class Quiz {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private int totalQuestions;

    @Column(nullable = false)
    private int passingScore;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;

    // Constructors
    public Quiz() {
    }

    public Quiz(Long id, String title, String description, int totalQuestions, int passingScore, Course course) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.totalQuestions = totalQuestions;
        this.passingScore = passingScore;
        this.course = course;
    }

    // Getters and Setters
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

    public int getTotalQuestions() {
        return totalQuestions;
    }

    public void setTotalQuestions(int totalQuestions) {
        this.totalQuestions = totalQuestions;
    }

    public int getPassingScore() {
        return passingScore;
    }

    public void setPassingScore(int passingScore) {
        this.passingScore = passingScore;
    }

    // Equals and HashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Quiz quiz = (Quiz) o;
        return totalQuestions == quiz.totalQuestions &&
                passingScore == quiz.passingScore &&
                Objects.equals(id, quiz.id) &&
                Objects.equals(title, quiz.title) &&
                Objects.equals(description, quiz.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, description, totalQuestions, passingScore);
    }

    // toString
    @Override
    public String toString() {
        return "Quiz{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", totalQuestions=" + totalQuestions +
                ", passingScore=" + passingScore +
                '}';
    }
}
