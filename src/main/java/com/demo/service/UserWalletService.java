package com.demo.service;

import org.springframework.stereotype.Service;

import com.demo.entity.UserWallet;

@Service
public interface UserWalletService {
	
	UserWallet save(UserWallet uw);

}
