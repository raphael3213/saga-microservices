package com.microservices.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;

@Entity
@Table(name="USER_BALANCE_TABLE")
@AllArgsConstructor
public class UserBalance {


    @Id
    private Integer userId;
    private Integer price;
}
