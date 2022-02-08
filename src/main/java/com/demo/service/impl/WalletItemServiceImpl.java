package com.demo.service.impl;



import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import com.demo.entity.WalletItem;
import com.demo.repository.WalletItemRepository;
import com.demo.util.enums.TypeEnum;



public class WalletItemServiceImpl {
	@Autowired
	WalletItemRepository repository;
	
	@Value("${pagination.items_per_page}")
	private int itemsPerPage;
	
	@CacheEvict(value = "findByWalletAndType", allEntries = true)
	public WalletItem save(WalletItem i) {
		return repository.save(i);
	}

	public Page<WalletItem> findBetweenDates(Long wallet, Date start, Date end, int page) {
		
		@SuppressWarnings("deprecation")
		PageRequest pg = PageRequest.of(page, itemsPerPage);
		
		return repository.findAllByWalletIdAndDateGreaterThanEqualAndDateLessThanEqual(wallet, start, end, pg);
	}

	
	@Cacheable(value = "findByWalletAndType")
	public List<WalletItem> findByWalletAndType(Long wallet, TypeEnum type) {
		return repository.findByWalletIdAndType(wallet, type);
	}

	public BigDecimal sumByWalletId(Long wallet) {
		return repository.sumByWalletId(wallet);
	}

	
	public Optional<WalletItem> findById(Long id) {
		return repository.findById(id);
	}

	@CacheEvict(value = "findByWalletAndType", allEntries = true)
	public void deleteById(Long id) {
		repository.deleteById(id);
	}


}
