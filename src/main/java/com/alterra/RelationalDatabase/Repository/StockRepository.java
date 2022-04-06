package com.alterra.RelationalDatabase.Repository;

import com.alterra.RelationalDatabase.Entity.Stocks;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockRepository extends JpaRepository<Stocks, Long> {
}
