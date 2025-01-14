package com.cloudnativeplayground.onlinelearningplatform.service;

import com.cloudnativeplayground.onlinelearningplatform.model.Quiz;
import com.cloudnativeplayground.onlinelearningplatform.repository.QuizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QuizService {

    private final QuizRepository quizRepository;

    @Autowired
    public QuizService(QuizRepository quizRepository) {
        this.quizRepository = quizRepository;
    }

    /**
     * Retrieve all quizzes.
     *
     * @return List of quizzes.
     */
    public List<Quiz> getAllQuizzes() {
        return quizRepository.findAll();
    }

    /**
     * Find a quiz by its ID.
     *
     * @param id The ID of the quiz.
     * @return Optional containing the quiz if found, otherwise empty.
     */
    public Optional<Quiz> getQuizById(Long id) {
        return quizRepository.findById(id);
    }

    /**
     * Create or update a quiz.
     *
     * @param quiz The quiz object to save.
     * @return The saved quiz.
     */
    public Quiz saveQuiz(Quiz quiz) {
        return quizRepository.save(quiz);
    }

    /**
     * Delete a quiz by its ID.
     *
     * @param id The ID of the quiz to delete.
     */
    public void deleteQuiz(Long id) {
        quizRepository.deleteById(id);
    }

    /**
     * Create a new quiz.
     *
     * @param quiz The quiz object to create.
     * @return The created quiz.
     */
    public Quiz createQuiz(Quiz quiz) {
        return quizRepository.save(quiz);
    }

    /**
     * Update an existing quiz.
     *
     * @param id The ID of the quiz to update.
     * @param quiz The updated quiz object.
     * @return The updated quiz.
     */
    public Quiz updateQuiz(Long id, Quiz quiz) {
        return quizRepository.findById(id).map(quizToUpdate -> {
            quizToUpdate.setTitle(quiz.getTitle());
            quizToUpdate.setDescription(quiz.getDescription());
            quizToUpdate.setTotalQuestions(quiz.getTotalQuestions());
            return quizRepository.save(quizToUpdate);
        }).orElseThrow(() -> new IllegalArgumentException("Quiz with ID " + id + " not found."));
    }
}
