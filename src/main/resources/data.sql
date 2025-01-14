-- Sample data for Online Learning Platform

-- Insert sample courses
INSERT INTO courses (id, name, description, duration, created_at) VALUES
(1, 'Java Programming', 'Learn the basics of Java programming', 30, CURRENT_TIMESTAMP),
(2, 'Spring Boot Essentials', 'Master the fundamentals of Spring Boot', 45, CURRENT_TIMESTAMP),
(3, 'Database Design', 'Understand relational database design principles', 20, CURRENT_TIMESTAMP);

-- Insert sample quizzes
INSERT INTO quizzes (id, course_id, name, total_questions, created_at) VALUES
(1, 1, 'Java Basics Quiz', 10, CURRENT_TIMESTAMP),
(2, 2, 'Spring Boot Quiz', 15, CURRENT_TIMESTAMP),
(3, 3, 'Database Design Quiz', 10, CURRENT_TIMESTAMP);

-- Insert sample certifications
INSERT INTO certifications (id, course_id, name, issued_by, created_at) VALUES
(1, 1, 'Java Programming Certification', 'Online Learning Platform', CURRENT_TIMESTAMP),
(2, 2, 'Spring Boot Mastery Certification', 'Online Learning Platform', CURRENT_TIMESTAMP),
(3, 3, 'Database Design Certification', 'Online Learning Platform', CURRENT_TIMESTAMP);
