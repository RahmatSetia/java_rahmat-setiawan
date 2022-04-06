package com.alterra.RelationalDatabase.Controller;

import com.alterra.RelationalDatabase.Controller.base.BaseResponse;
import com.alterra.RelationalDatabase.Entity.Products;
import com.alterra.RelationalDatabase.service.implemenet.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductServiceImpl productServiceImpl;

    @GetMapping
    public BaseResponse<List<Products>> getProducts(){
        BaseResponse baseResponse = new BaseResponse();
        baseResponse.setSuccess(true);
        baseResponse.setMessage("Berhasil");
        baseResponse.setData(productServiceImpl.getAllProductCategories());
        return baseResponse;
    }
}
