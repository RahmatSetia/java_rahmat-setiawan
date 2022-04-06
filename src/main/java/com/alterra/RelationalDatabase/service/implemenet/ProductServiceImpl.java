package com.alterra.RelationalDatabase.service.implemenet;

import com.alterra.RelationalDatabase.Entity.Products;
import com.alterra.RelationalDatabase.Repository.ProductRepository;
import com.alterra.RelationalDatabase.service.ProductServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductServiceInterface {
    @Autowired
    private ProductRepository productRepository;

    public List<Products> getAllProductCategories(){
        return productRepository.findAll();
    }

    @Override
    public List<Products> getAllProducts() {
        return null;
    }

    @Override
    public Products getProducts() {
        return null;
    }

    @Override
    public Products addProducts() {
        return null;
    }
}
