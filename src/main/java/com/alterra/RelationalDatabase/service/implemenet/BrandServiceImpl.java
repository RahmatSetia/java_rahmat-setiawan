package com.alterra.RelationalDatabase.service.implemenet;

import com.alterra.RelationalDatabase.Entity.Brands;
import com.alterra.RelationalDatabase.Repository.BrandsRepository;
import com.alterra.RelationalDatabase.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandServiceImpl implements BrandService {
    @Autowired
    private BrandsRepository brandsRepository;

    @Override
    public Brands insertBrands(Brands brandsIn) {
        Brands brands = new Brands();
        brands.setName(brandsIn.getName());
        brandsRepository.save(brands);
        return brandsIn;
    }

    @Override
    public List<Brands> getAllBrands() {
        return brandsRepository.findAll();
    }

    @Override
    public Brands getBrand() {
        return null;
    }
}
