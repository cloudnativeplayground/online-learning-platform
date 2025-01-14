package com.cloudnativeplayground.onlinelearningplatform.service;

import com.cloudnativeplayground.onlinelearningplatform.model.Certification;
import com.cloudnativeplayground.onlinelearningplatform.repository.CertificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CertificationService {

    private final CertificationRepository certificationRepository;

    @Autowired
    public CertificationService(CertificationRepository certificationRepository) {
        this.certificationRepository = certificationRepository;
    }

    // Retrieve all certifications
    public List<Certification> getAllCertifications() {
        return certificationRepository.findAll();
    }

    // Retrieve a certification by ID
    public Optional<Certification> getCertificationById(Long id) {
        return certificationRepository.findById(id);
    }

    // Add a new certification
    public Certification addCertification(Certification certification) {
        return certificationRepository.save(certification);
    }

    // Update an existing certification
    public Certification updateCertification(Long id, Certification certificationDetails) {
        return certificationRepository.findById(id).map(certification -> {
            certification.setName(certificationDetails.getName());
            certification.setDescription(certificationDetails.getDescription());
            certification.setIssueDate(certificationDetails.getIssueDate());
            return certificationRepository.save(certification);
        }).orElseThrow(() -> new RuntimeException("Certification not found with id: " + id));
    }

    // Delete a certification by ID
    public boolean deleteCertification(Long id) {
        certificationRepository.deleteById(id);
        return true;
    }
}

