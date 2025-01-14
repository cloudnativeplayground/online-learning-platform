package com.cloudnativeplayground.onlinelearningplatform.repository;

import com.cloudnativeplayground.onlinelearningplatform.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Repository interface for Course entity.
 * Provides basic CRUD operations and custom queries for Course management.
 */
@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

    // Add custom query methods if needed, for example:
     List<Course> findByTitleContaining(String title);

}

