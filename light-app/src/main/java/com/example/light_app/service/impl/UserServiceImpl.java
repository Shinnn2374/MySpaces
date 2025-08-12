package com.example.light_app.service.impl;

import com.example.light_app.dao.UserRepository;
import com.example.light_app.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
}
