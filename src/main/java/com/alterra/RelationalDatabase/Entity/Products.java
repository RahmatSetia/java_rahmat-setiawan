package com.alterra.RelationalDatabase.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "products")
public class Products {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "brand_id")
    private Long brand_id;

    @Column(name = "category_id")
    private Long category_id;

    @Column(name = "model_year")
    private String model_year;

    @Column(name = "list_price")
    private String list_price;

    @Column(name = "created_at")
    private String created_at;

    @Column(name = "updated_at")
    private String updated_at;

    //many to one dengan categories
    @JsonBackReference
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "category_id", nullable = false, insertable = false, updatable = false)
    private Categories categories;

    //public Products() {};
    @JsonBackReference
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "brand_id", nullable = false, insertable = false, updatable = false)
    private Brands brands;
}

