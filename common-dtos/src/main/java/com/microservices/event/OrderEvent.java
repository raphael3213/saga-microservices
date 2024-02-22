package com.microservices.event;

import com.microservices.dto.OrderRequestDto;

public class OrderEvent {
    private OrderRequestDto orderRequestDto;
    private OrderStatus orderStatus;
}
