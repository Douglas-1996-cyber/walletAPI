package com.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entity.Wallet;
import com.demo.repository.WalletRepository;
import com.demo.service.WalletService;

@Service
public class WalletServiceImpl implements WalletService {
    
	@Autowired
	private WalletRepository repository;
	@Override
	public Wallet save(Wallet w) {
		return repository.save(w);
	}

	
 

}
