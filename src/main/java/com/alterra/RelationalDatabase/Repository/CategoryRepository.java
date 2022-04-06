package com.alterra.RelationalDatabase.Repository;

import com.alterra.RelationalDatabase.Entity.Categories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CategoryRepository extends PagingAndSortingRepository<Categories, Long> {
    //Categories findByName(String name);
}
