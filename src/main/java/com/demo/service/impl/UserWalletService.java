package com.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entity.UserWallet;
import com.demo.repository.UserWalletRepository;

@Service
public class UserWalletService implements com.demo.service.UserWalletService {
	  
	@Autowired
	UserWalletRepository repository;	

	@Override
	public UserWallet save(UserWallet uw) {
		
		return repository.save(uw);
	}
	

}
