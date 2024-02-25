package com.microservices.controller;


import com.microservices.dto.OrderRequestDto;
import com.microservices.entity.PurchaseOrder;
import com.microservices.service.OrderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {
        OrderService orderService;


        @PostMapping("/")
        public PurchaseOrder createOrder(@RequestBody OrderRequestDto orderRequestDto){
            return orderService.createOrder(orderRequestDto);
        }

        @GetMapping("/")
        public List<PurchaseOrder> getAllOrder(){
            return orderService.getAllOrders();
        }

}
