package com.demo.service;

import org.springframework.stereotype.Service;

import com.demo.entity.Wallet;

@Service
public interface WalletService {

	Wallet save(Wallet w);
}
