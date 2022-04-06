package com.alterra.RelationalDatabase.service;

import com.alterra.RelationalDatabase.Entity.Stocks;

import java.util.List;

public interface StockServiceInterface {
    List<Stocks> getAllStocks();
    Stocks getStock();
    Stocks insertStock(Stocks stocks);
}
