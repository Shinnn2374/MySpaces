package com.example.light_app.controller;

import com.example.light_app.model.Card;
import com.example.light_app.service.CardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/cards")
@RequiredArgsConstructor
public class CardController {
    private final CardService cardService;

    @PostMapping
    public Card createCard(@RequestBody Card card) {
        return cardService.createCard(card);
    }

    @GetMapping("/{cvv}")
    public Card getCardByCVV(@PathVariable String cvv) {
        return cardService.findByCVV(cvv);
    }

    @DeleteMapping("/{cvv}")
    public void deleteCardByCVV(@PathVariable String cvv) {
        cardService.deleteByCVV(cvv);
    }
}
