package com.stockexchange.stockexchangeservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
//@Table(name="stock-exchange")
public class StockExchange {

    @Id
    @GeneratedValue
    private int id;
    private String stockExchange;
    private String Brief;
    private String ContactAddress;
    private String remarks;
}
