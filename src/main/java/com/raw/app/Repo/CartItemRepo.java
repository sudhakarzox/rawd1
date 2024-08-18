package com.raw.app.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.raw.app.model.CartItem;

public interface CartItemRepo extends JpaRepository<CartItem, Long> {

}
