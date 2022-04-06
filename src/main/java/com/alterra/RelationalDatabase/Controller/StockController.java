package com.alterra.RelationalDatabase.Controller;

import com.alterra.RelationalDatabase.Controller.base.BaseResponse;
import com.alterra.RelationalDatabase.Entity.Stocks;
import com.alterra.RelationalDatabase.dto.RequestStocksDTO;
import com.alterra.RelationalDatabase.service.implemenet.StocksServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/stocks")
public class StockController {
    @Autowired
    private StocksServiceImpl stocksServiceImpl;

    @GetMapping
    public BaseResponse<List<Stocks>> getStocks(){
        BaseResponse baseResponse = new BaseResponse();
        baseResponse.setSuccess(true);
        baseResponse.setMessage("Berhasil");
        baseResponse.setData(stocksServiceImpl.getAllStocks());
        return baseResponse;
    }

    @PostMapping
    private BaseResponse<List<RequestStocksDTO>> addStocks(@RequestBody Stocks stocksInput){
        BaseResponse baseResponse = new BaseResponse();
        baseResponse.setSuccess(true);
        baseResponse.setMessage("Berhasil");
        baseResponse.setData(stocksServiceImpl.insertStock(stocksInput));
        return baseResponse;
    }
}
