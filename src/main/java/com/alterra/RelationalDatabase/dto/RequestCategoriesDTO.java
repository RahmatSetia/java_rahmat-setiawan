package com.alterra.RelationalDatabase.dto;

import com.alterra.RelationalDatabase.Entity.Categories;
import lombok.Data;

@Data
public class RequestCategoriesDTO {
    private Categories categories;
    private String name;
}
