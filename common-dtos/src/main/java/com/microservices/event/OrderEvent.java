package com.microservices.event;

import com.microservices.dto.OrderRequestDto;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class OrderEvent {
    private final OrderRequestDto orderRequestDto;
    private final OrderStatus orderStatus;


}
