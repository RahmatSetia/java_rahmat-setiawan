package com.alterra.RelationalDatabase.service.implemenet;

import com.alterra.RelationalDatabase.Entity.Stocks;
import com.alterra.RelationalDatabase.Repository.StockRepository;
import com.alterra.RelationalDatabase.service.StockServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StocksServiceImpl implements StockServiceInterface {
    @Autowired
    private StockRepository stockRepository;

    @Override
    public List<Stocks> getAllStocks(){
        return stockRepository.findAll();
    }

    @Override
    public Stocks getStock() {
        Stocks stocks = new Stocks();
        return stocks;
    }

    @Override
    public Stocks insertStock(Stocks stockIn) {
        Stocks stocks = new Stocks();
        stocks.setStore_id(stockIn.getStore_id());
        stocks.setQuantity(stockIn.getQuantity());
        stockRepository.save(stocks);
        return stockIn;
    }
}
