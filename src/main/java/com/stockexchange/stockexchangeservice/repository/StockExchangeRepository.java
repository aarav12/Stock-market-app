package com.stockexchange.stockexchangeservice.repository;

import com.stockexchange.stockexchangeservice.entity.StockExchange;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockExchangeRepository extends JpaRepository<StockExchange, Integer> {

}
