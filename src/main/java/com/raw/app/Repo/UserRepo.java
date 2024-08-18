package com.raw.app.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.raw.app.model.UserR;

public interface UserRepo extends JpaRepository<UserR, Long> {

}
