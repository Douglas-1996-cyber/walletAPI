package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.entity.UserWallet;

public interface UserWalletRepository extends JpaRepository<UserWallet, Long> {

}
