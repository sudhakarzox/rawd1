package com.raw.app.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.raw.app.model.Cart;

public interface CartRepo extends JpaRepository<Cart, Long> {

}
