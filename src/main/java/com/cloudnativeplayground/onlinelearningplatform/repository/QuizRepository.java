package com.cloudnativeplayground.onlinelearningplatform.repository;

import com.cloudnativeplayground.onlinelearningplatform.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuizRepository extends JpaRepository<Quiz, Long> {

    // Custom query methods can be added here, for example:
    List<Quiz> findByTitleContaining(String title);

}
