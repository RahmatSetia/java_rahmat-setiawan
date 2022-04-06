package com.alterra.RelationalDatabase.Repository;

import com.alterra.RelationalDatabase.Entity.Brands;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrandsRepository extends JpaRepository<Brands, Long> {
}
