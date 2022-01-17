package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.entity.Wallet;

public interface WalletRepository extends JpaRepository<Wallet, Long> {

}
