package com.cloudnativeplayground.onlinelearningplatform.controller;

import com.cloudnativeplayground.onlinelearningplatform.model.Certification;
import com.cloudnativeplayground.onlinelearningplatform.service.CertificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/certifications")
public class CertificationController {

    @Autowired
    private CertificationService certificationService;

    @GetMapping
    public ResponseEntity<List<Certification>> getAllCertifications() {
        List<Certification> certifications = certificationService.getAllCertifications();
        return ResponseEntity.ok(certifications);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Certification> getCertificationById(@PathVariable Long id) {
        Optional<Certification> certification = certificationService.getCertificationById(id);
        return certification != null ? ResponseEntity.ok(certification.get()) : ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<Certification> createCertification(@RequestBody Certification certification) {
        Certification createdCertification = certificationService.addCertification(certification);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdCertification);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Certification> updateCertification(@PathVariable Long id, @RequestBody Certification certification) {
        Certification updatedCertification = certificationService.updateCertification(id, certification);
        return updatedCertification != null ? ResponseEntity.ok(updatedCertification) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCertification(@PathVariable Long id) {
        boolean deleted = certificationService.deleteCertification(id);
        return deleted ? ResponseEntity.noContent().build() : ResponseEntity.notFound().build();
    }
}
