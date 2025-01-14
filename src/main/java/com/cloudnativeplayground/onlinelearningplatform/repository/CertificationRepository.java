package com.cloudnativeplayground.onlinelearningplatform.repository;

import com.cloudnativeplayground.onlinelearningplatform.model.Certification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CertificationRepository extends JpaRepository<Certification, Long> {
    // Custom query methods can be defined here if needed
}
