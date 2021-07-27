package com.stockexchange.stockexchangeservice.service;


import com.stockexchange.stockexchangeservice.entity.StockExchange;
import com.stockexchange.stockexchangeservice.repository.StockExchangeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockExchangeService {

    @Autowired
    private StockExchangeRepository stockExchangeRepository;

    public StockExchange saveStockExchange(StockExchange stockExchange){
        return stockExchangeRepository.save(stockExchange);
    }

    public List<StockExchange> getStockExchange(){
        return stockExchangeRepository.findAll();
    }

    public StockExchange getStockExchangeById(int id){
        return stockExchangeRepository.findById(id).orElse(null);
    }

    public String deleteStockExchange(int id){
        stockExchangeRepository.deleteById(id);
        return "stock-exchange-deleted"+id;
    }

    public StockExchange updateStockExchange(StockExchange stockExchange){
        StockExchange existing=stockExchangeRepository.findById(stockExchange.getId()).orElse(null);
        existing.setStockExchange(stockExchange.getStockExchange());
        existing.setBrief(stockExchange.getBrief());
        existing.setContactAddress(stockExchange.getContactAddress());
        existing.setRemarks(stockExchange.getRemarks());
        return stockExchangeRepository.save(existing);



    }


}
