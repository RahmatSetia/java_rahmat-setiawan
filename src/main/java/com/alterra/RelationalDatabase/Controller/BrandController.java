package com.alterra.RelationalDatabase.Controller;

import com.alterra.RelationalDatabase.Controller.base.BaseResponse;
import com.alterra.RelationalDatabase.Entity.Brands;
import com.alterra.RelationalDatabase.dto.BrandsDTO;
import com.alterra.RelationalDatabase.service.implemenet.BrandServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/brands")
public class BrandController {
    @Autowired
    private BrandServiceImpl brandServiceImpl;

    @GetMapping
    public BaseResponse<List<Brands>> getAllBrands(){
        BaseResponse baseResponse = new BaseResponse();
        baseResponse.setSuccess(true);
        baseResponse.setMessage("Berhasil");
        baseResponse.setData(brandServiceImpl.getAllBrands());
        return baseResponse;
    }

    @PostMapping
    public BaseResponse<List<BrandsDTO>> postBrands(@RequestBody Brands payload){
        BaseResponse baseResponse = new BaseResponse();
        baseResponse.setSuccess(true);
        baseResponse.setMessage("Berhasil");
        baseResponse.setData(brandServiceImpl.insertBrands(payload));
        return baseResponse;
    }
}
