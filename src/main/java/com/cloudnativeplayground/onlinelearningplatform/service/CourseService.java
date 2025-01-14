package com.cloudnativeplayground.onlinelearningplatform.service;

import com.cloudnativeplayground.onlinelearningplatform.model.Course;
import com.cloudnativeplayground.onlinelearningplatform.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseService {

    private final CourseRepository courseRepository;

    @Autowired
    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    // Create a new course
    public Course createCourse(Course course) {
        return courseRepository.save(course);
    }

    // Get all courses
    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    // Get course by ID
    public Optional<Course> getCourseById(Long id) {
        return courseRepository.findById(id);
    }

    // Update an existing course
    public Course updateCourse(Long id, Course updatedCourse) {
        return courseRepository.findById(id).map(course -> {
            course.setTitle(updatedCourse.getTitle());
            course.setDescription(updatedCourse.getDescription());
            course.setInstructor(updatedCourse.getInstructor());
            course.setPrice(updatedCourse.getPrice());
            course.setQuizzes(updatedCourse.getQuizzes());
            return courseRepository.save(course);
        }).orElseThrow(() -> new IllegalArgumentException("Course with ID " + id + " not found."));
    }

    // Delete a course by ID
    public void deleteCourse(Long id) {
        if (!courseRepository.existsById(id)) {
            throw new IllegalArgumentException("Course with ID " + id + " does not exist.");
        }
        courseRepository.deleteById(id);
    }
}
