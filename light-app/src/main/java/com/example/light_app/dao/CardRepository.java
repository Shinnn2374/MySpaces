package com.example.light_app.dao;

import com.example.light_app.model.Card;
import org.springframework.data.repository.CrudRepository;

public interface CardRepository extends CrudRepository<Card, Long> {
    Card findById(Integer id);

    Card findByCVV(String cvv);

    void removeCardByCVV(String cvv);
}
