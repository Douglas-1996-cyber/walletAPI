package com.demo.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.demo.entity.UserWallet;

@Service
public interface UserWalletService {
	
	UserWallet save(UserWallet uw);

	Optional<UserWallet> findByUsersIdAndWalletId(Long user, Long wallet);

}
