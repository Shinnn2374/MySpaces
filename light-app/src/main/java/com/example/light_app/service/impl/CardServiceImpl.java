package com.example.light_app.service.impl;

import com.example.light_app.dao.CardRepository;
import com.example.light_app.model.Card;
import com.example.light_app.service.CardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CardServiceImpl implements CardService {

    private final CardRepository cardRepository;

    @Override
    public Card createCard(Card card) {
        return cardRepository.save(card);
    }

    @Override
    public Card findByCVV(String cvv) {
        return cardRepository.findByCVV(cvv);
    }

    @Override
    public void deleteByCVV(String cvv) {
        cardRepository.removeCardByCVV(cvv);
    }
}
