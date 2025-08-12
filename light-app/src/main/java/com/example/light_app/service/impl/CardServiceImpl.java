package com.example.light_app.service.impl;

import com.example.light_app.dao.CardRepository;
import com.example.light_app.service.CardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CardServiceImpl implements CardService {

    private final CardRepository cardRepository;
}
