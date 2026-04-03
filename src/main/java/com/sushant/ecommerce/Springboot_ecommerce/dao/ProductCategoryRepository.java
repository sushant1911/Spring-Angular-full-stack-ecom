package com.sushant.ecommerce.Springboot_ecommerce.dao;


import com.sushant.ecommerce.Springboot_ecommerce.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200")
@Repository
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {
}
