package com.beesgrow.beesmail.repositories;

import com.beesgrow.beesmail.models.EmailModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface EmailRepository extends JpaRepository<EmailModel, UUID> {
    Optional<EmailModel> findById(UUID emailId);
}