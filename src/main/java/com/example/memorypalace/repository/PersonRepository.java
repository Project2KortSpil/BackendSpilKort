package com.example.memorypalace.repository;

import com.example.memorypalace.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}