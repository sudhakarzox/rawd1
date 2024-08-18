package com.raw.app.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.raw.app.model.Subscription;

public interface SubscriptionRepo extends JpaRepository<Subscription, Long> {

}
