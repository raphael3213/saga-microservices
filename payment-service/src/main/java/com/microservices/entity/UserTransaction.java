package com.microservices.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class UserTransaction {

    @Id
    private Integer orderId;


    private Integer userId;
    private Integer amount;

}
