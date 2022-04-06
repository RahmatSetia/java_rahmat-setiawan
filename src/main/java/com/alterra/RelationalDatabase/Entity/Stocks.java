package com.alterra.RelationalDatabase.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "stocks")
public class Stocks {
    @Id
    @GeneratedValue
    private Long product_id;

    @Column(name = "store_id")
    private Long store_id;

    @Column(name = "quantity")
    private Integer quantity;
}
