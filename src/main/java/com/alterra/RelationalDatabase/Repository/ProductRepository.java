package com.alterra.RelationalDatabase.Repository;

import com.alterra.RelationalDatabase.Entity.Categories;
import com.alterra.RelationalDatabase.Entity.Products;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository<Products,Long> {
    List<Products> getAllByName(String name, Pageable pageable);
}
