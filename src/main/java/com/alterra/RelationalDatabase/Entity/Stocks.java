package com.alterra.RelationalDatabase.Entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

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

    @JsonManagedReference
    @OneToOne(mappedBy = "stocks")
    private Products products;
}
