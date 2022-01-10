package com.demo.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.demo.entity.User;

@Service
public interface UserService {
	User save(User u);
	Optional<User> findByEmail(String email);

}
