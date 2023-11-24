package com.example.memorypalace.repository;

import com.example.memorypalace.entity.PAOentry;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PAOentryRepository extends JpaRepository<PAOentry, Long> {
}