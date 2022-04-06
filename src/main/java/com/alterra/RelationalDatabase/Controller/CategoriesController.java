package com.alterra.RelationalDatabase.Controller;

import com.alterra.RelationalDatabase.Controller.base.BaseResponse;
import com.alterra.RelationalDatabase.Entity.Categories;
import com.alterra.RelationalDatabase.Repository.CategoryRepository;
import com.alterra.RelationalDatabase.Repository.ProductRepository;
import com.alterra.RelationalDatabase.dto.RequestCategoriesDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoriesController {
    @Autowired
    private CategoryRepository categoryRepository;
    @Autowired
    private ProductRepository productRepository;

    @GetMapping
    public BaseResponse<List<Categories>> getCategories(){
        BaseResponse baseResponse = new BaseResponse();
        baseResponse.setMessage("Berhasil");
        baseResponse.setSuccess(true);
        baseResponse.setData(categoryRepository.findAll());
        return baseResponse;
    }
    @PostMapping
    public BaseResponse<List<Categories>> postCategories(@RequestBody RequestCategoriesDTO requestCategoriesDTO){
        BaseResponse baseResponse = new BaseResponse();
        baseResponse.setMessage("Berhasil");
        baseResponse.setSuccess(true);
        baseResponse.setData(categoryRepository.save(requestCategoriesDTO.getCategories()));
        return baseResponse;
    }
}
