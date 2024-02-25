package com.microservices.service;


import com.microservices.entity.UserBalance;
import com.microservices.event.OrderEvent;
import com.microservices.event.PaymentEvent;
import com.microservices.repository.UserBalanceRepository;
import com.microservices.repository.UserTransactionRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class PaymentService {

    @Autowired
    private UserBalanceRepository userBalanceRepository;
    @Autowired
    private UserTransactionRepository userTransactionRepository;


    @PostConstruct
    public void initUserBalanceInDb(){

        userBalanceRepository.saveAll(Stream.of(
                new UserBalance(101, 5000),
                new UserBalance(102, 3000),
                new UserBalance(101, 4200)).collect(Collectors.toList() ));

    }
    public PaymentEvent newOrderEvent(OrderEvent orderEvent) {
    }

    public void cancelOrderEvent(OrderEvent orderEvent) {
    }
}
