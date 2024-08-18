package com.raw.app.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.raw.app.model.Product;

public interface ProductRepo extends JpaRepository<Product, Long> {

}
