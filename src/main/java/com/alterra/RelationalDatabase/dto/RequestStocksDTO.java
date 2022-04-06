package com.alterra.RelationalDatabase.dto;

import com.alterra.RelationalDatabase.Entity.Stocks;
import lombok.Data;

@Data
public class RequestStocksDTO {
    private Long store_id;
    private Integer quantity;
}
