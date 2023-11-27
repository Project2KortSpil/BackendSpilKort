package com.example.memorypalace.service;


import com.example.memorypalace.entity.Card;
import com.example.memorypalace.repository.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CardService {

    private final CardRepository cardRepository;

    @Autowired
    public CardService(CardRepository cardRepository) {
        this.cardRepository = cardRepository;
    }


    // Retrieve all cards
    public List<Card> getAllCards() {
        return cardRepository.findAll();
    }

    // Retrieve a card by its ID
    public Optional<Card> getCardById(Long cardId) {
        return cardRepository.findById(cardId);

    }
}
