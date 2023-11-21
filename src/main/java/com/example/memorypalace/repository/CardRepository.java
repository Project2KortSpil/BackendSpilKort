package com.example.memorypalace.repository;

import com.example.memorypalace.entity.Card;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepository extends JpaRepository<Card, Long> {

}
