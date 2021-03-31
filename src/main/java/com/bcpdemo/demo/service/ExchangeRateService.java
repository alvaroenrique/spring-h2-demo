package com.bcpdemo.demo.service;


import com.bcpdemo.demo.model.ExchangeRate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExchangeRateService extends JpaRepository<ExchangeRate, String>{
}
