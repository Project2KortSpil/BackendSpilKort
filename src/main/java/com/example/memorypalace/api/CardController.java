package com.example.memorypalace.api;


import com.example.memorypalace.entity.Card;
import com.example.memorypalace.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@CrossOrigin("*")
@RestController
@RequestMapping("/api/cards")
public class CardController {

    private final CardService cardService;

    @Autowired
    public CardController(CardService cardService) {
        this.cardService = cardService;
    }

    // Endpoint to retrieve all cards
    @GetMapping
    public List<Card> getAllCards() {
        return cardService.getAllCards();
    }

    // Endpoint to retrieve a card by its ID
    @GetMapping("/{cardId}")
    public Optional<Card> getCardById(@PathVariable Long cardId) {
        return cardService.getCardById(cardId);
    }
    @GetMapping("/values")
    public List<String> getAllCardValues() {
        return cardService.getAllCardsValues();
    }






}
