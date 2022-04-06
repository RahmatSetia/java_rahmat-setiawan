package com.alterra.RelationalDatabase.service;

import com.alterra.RelationalDatabase.Entity.Brands;

import java.util.List;

public interface BrandService {
    List<Brands> getAllBrands();
    Brands getBrand();
    Brands insertBrands(Brands brands);
}
