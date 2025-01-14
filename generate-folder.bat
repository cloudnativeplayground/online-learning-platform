@echo off
echo Creating project structure for Online Learning Platform...

REM Create folders
REM mkdir online-learning-platform
REM cd online-learning-platform

mkdir src\main\java\com\cloudnativeplayground\onlinelearningplatform\controller
mkdir src\main\java\com\cloudnativeplayground\onlinelearningplatform\model
mkdir src\main\java\com\cloudnativeplayground\onlinelearningplatform\repository
mkdir src\main\java\com\cloudnativeplayground\onlinelearningplatform\service
mkdir src\main\resources
mkdir src\test\java\com\cloudnativeplayground\onlinelearningplatform

REM Create files
echo. > src\main\java\com\cloudnativeplayground\onlinelearningplatform\OnlineLearningPlatformApplication.java
echo. > src\main\java\com\cloudnativeplayground\onlinelearningplatform\controller\CourseController.java
echo. > src\main\java\com\cloudnativeplayground\onlinelearningplatform\controller\QuizController.java
echo. > src\main\java\com\cloudnativeplayground\onlinelearningplatform\controller\CertificationController.java
echo. > src\main\java\com\cloudnativeplayground\onlinelearningplatform\model\Course.java
echo. > src\main\java\com\cloudnativeplayground\onlinelearningplatform\model\Quiz.java
echo. > src\main\java\com\cloudnativeplayground\onlinelearningplatform\model\Certification.java
echo. > src\main\java\com\cloudnativeplayground\onlinelearningplatform\repository\CourseRepository.java
echo. > src\main\java\com\cloudnativeplayground\onlinelearningplatform\repository\QuizRepository.java
echo. > src\main\java\com\cloudnativeplayground\onlinelearningplatform\repository\CertificationRepository.java
echo. > src\main\java\com\cloudnativeplayground\onlinelearningplatform\service\CourseService.java
echo. > src\main\java\com\cloudnativeplayground\onlinelearningplatform\service\QuizService.java
echo. > src\main\java\com\cloudnativeplayground\onlinelearningplatform\service\CertificationService.java
echo. > src\main\resources\application.properties
echo. > src\main\resources\data.sql
echo. > src\main\resources\schema.sql
echo. > src\test\java\com\cloudnativeplayground\onlinelearningplatform\OnlineLearningPlatformApplicationTests.java
echo. > Dockerfile
echo. > docker-compose.yml
REM echo. > .gitignore
REM echo. > LICENSE
REM echo. > README.md

echo Project structure created successfully.
pause
