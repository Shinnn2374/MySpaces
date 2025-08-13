package com.example.light_app.service.impl;

import com.example.light_app.dao.UserRepository;
import com.example.light_app.model.User;
import com.example.light_app.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User updateUser(Integer id, User user) {
        User updatedUser = userRepository.findUserByEmail(user.getEmail());
        updatedUser.setEmail(user.getEmail());
        updatedUser.setUsername(user.getUsername());
        updatedUser.setDescription(user.getDescription());
        updatedUser.setCards(user.getCards());
        return userRepository.save(updatedUser);
    }

    @Override
    public void deleteUser(Integer id) {
        userRepository.deleteById(id);
    }
}
