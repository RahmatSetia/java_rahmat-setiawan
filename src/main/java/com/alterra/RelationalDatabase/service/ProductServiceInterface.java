package com.alterra.RelationalDatabase.service;

import com.alterra.RelationalDatabase.Entity.Products;
import org.apache.catalina.LifecycleState;

import java.util.List;

public interface ProductServiceInterface {
    List<Products> getAllProducts();
    Products getProducts();
    Products addProducts();
}
