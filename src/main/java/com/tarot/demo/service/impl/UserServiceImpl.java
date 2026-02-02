package com.tarot.demo.service.impl;

import com.tarot.demo.entity.User;
import com.tarot.demo.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.tarot.demo.service.UserService;

import java.util.List;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public void delete(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(() -> new IllegalStateException("Not Found"));
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

}
