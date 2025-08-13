package com.example.light_app.service;

import com.example.light_app.model.Card;

public interface CardService {

    Card createCard(Card card);
    Card findByCVV(String cvv);
    void deleteByCVV(String cvv);
}
