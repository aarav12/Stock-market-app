package com.stockexchange.stockexchangeservice.controller;

import com.stockexchange.stockexchangeservice.entity.StockExchange;
import com.stockexchange.stockexchangeservice.service.StockExchangeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StockExchangeController {

    @Autowired
    private StockExchangeService stockExchangeService;

    @PostMapping("/addStockExchange")
    public StockExchange addStockExchange(@RequestBody StockExchange stockExchange){
        return stockExchangeService.saveStockExchange(stockExchange);
    }

    @GetMapping("/getAllStockExchange")
    public List<StockExchange> getAllStockExchange(){
        return stockExchangeService.getStockExchange();
    }
    @GetMapping("/getStockExchange/{Id}")
    public StockExchange getStockExchangeById(@PathVariable int id){
        return stockExchangeService.getStockExchangeById(id);
    }
    @PutMapping("/updateStockExchange")
    public StockExchange UpdateStockExchange(@RequestBody StockExchange stockExchange){
        return stockExchangeService.updateStockExchange(stockExchange);
    }
    @DeleteMapping("/delete/{id}")
    public String deleteStockExchange(@PathVariable int id){
        return stockExchangeService.deleteStockExchange(id);

    }
}
