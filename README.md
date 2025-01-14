# Online Learning Platform

An open-source platform for managing courses, video streaming, quizzes, and certifications, built with **Spring Boot**, **MySQL**, and containerized deployment.

## Features

- **Course Management**: Create, update, and delete courses.
- **Video Streaming**: Stream educational videos seamlessly.
- **Quizzes and Certifications**: Evaluate learners with quizzes and award certifications.
- **Progress Tracking**: Track user progress through courses.
- **Swagger UI**: API documentation with Swagger for easy testing.

## Tech Stack

- **Backend**: Java with Spring Boot
- **Database**: MySQL
- **Containerization**: Docker
- **API Documentation**: Swagger/OpenAPI

## Getting Started

### Prerequisites

- Java 17 or later
- Maven 3.8 or later
- Docker (for containerized deployment)
- MySQL 8.0 or later

### Installation

1. **Clone the repository**:
   ```bash
   git clone https://github.com/cloudnativeplayground/online-learning-platform.git
   cd online-learning-platform
   ```

2. **Build the application**:
   ```bash
   mvn clean install
   ```

3. **Run the application**:
   ```bash
   mvn spring-boot:run
   ```

4. **Access Swagger UI**:
   Open [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html) in your browser.

### Docker Deployment

1. **Build the Docker image**:
   ```bash
   docker build -t online-learning-platform .
   ```

2. **Run the Docker container**:
   ```bash
   docker run -p 8080:8080 online-learning-platform
   ```

### Database Setup

1. Create a MySQL database:
   ```sql
   CREATE DATABASE online_learning_platform;
   ```

2. Update the `application.properties` file with your database credentials:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/online_learning_platform
   spring.datasource.username=<your-username>
   spring.datasource.password=<your-password>
   ```

## Contributing

Contributions are welcome! Please follow these steps:

1. Fork the repository.
2. Create a new branch for your feature: `git checkout -b feature-name`.
3. Commit your changes: `git commit -m 'Add some feature'`.
4. Push to the branch: `git push origin feature-name`.
5. Submit a pull request.

## License

This project is licensed under the [GNU General Public License v3.0](LICENSE).

## Maintainer

**Aditya Pratap Bhuyan**
- Senior Architect, Developer, Instructor, and Author
- [LinkedIn Profile](https://linkedin.com/in/adityabhuyan)

---

Happy learning! 🎓