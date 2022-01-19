package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.entity.WalletItem;

public interface WalletItemRepository extends JpaRepository<WalletItem, Long> {

}
