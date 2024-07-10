package com.dnsouzadev.data.repository;

import com.dnsouzadev.data.entity.CarModelPriceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarPriceAnalyticsRepository extends JpaRepository<CarModelPriceEntity, Long> {
}

