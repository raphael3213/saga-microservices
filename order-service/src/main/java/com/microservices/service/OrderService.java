package com.microservices.service;


import com.microservices.dto.OrderRequestDto;
import com.microservices.entity.PurchaseOrder;
import com.microservices.event.OrderStatus;
import com.microservices.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private OrderStatusPublisher orderStatusPublisher;
    public PurchaseOrder createOrder(OrderRequestDto orderRequestDto) {

        PurchaseOrder order =  orderRepository.save(convertDtoToEntity(orderRequestDto));

        orderRequestDto.setOrderId(order.getId());
        orderStatusPublisher.publishOrderEvent(orderRequestDto,order.getOrderStatus());
        return order;


    }

    public List<PurchaseOrder> getAllOrders(){
        return orderRepository.findAll();
    }

    private PurchaseOrder convertDtoToEntity(OrderRequestDto orderRequestDto){
        PurchaseOrder order = new PurchaseOrder();
        order.setPrice(orderRequestDto.getAmount());
        order.setUserId(orderRequestDto.getUserId());
        order.setOrderStatus(OrderStatus.ORDER_CREATED);
        order.setProductId(orderRequestDto.getProductId());;
        return order;
    }
}
