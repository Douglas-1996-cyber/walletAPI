package com.demo.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entity.UserWallet;
import com.demo.repository.UserWalletRepository;

@Service
public class UserWalletServiceImpl implements com.demo.service.UserWalletService {
	  
	@Autowired
	UserWalletRepository repository;	

	@Override
	public UserWallet save(UserWallet uw) {
		
		return repository.save(uw);
	}

	@Override
	public Optional<UserWallet> findByUsersIdAndWalletId(Long user, Long wallet) {
		return repository.findByUsersIdAndWalletId(user, wallet);
	}
	

}
