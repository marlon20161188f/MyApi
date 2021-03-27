package com.MarlonAvila.MyAPI.dao;

import com.MarlonAvila.MyAPI.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
public interface ProductRepository extends JpaRepository<Product,Long> {
    Page<Product> findByCategoryId(Long id, Pageable pageable);
}
