package com.javalearning.jpa.join.controller;

import com.javalearning.jpa.join.dto.OrderRequest;
import com.javalearning.jpa.join.entity.Customer;
import com.javalearning.jpa.join.repository.CustomerRepository;
import com.javalearning.jpa.join.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OderController {
    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private ProductRepository productRepository;

    @PostMapping("/postoders")
    public Customer placeOrders(@RequestBody OrderRequest orderRequest) {
        return customerRepository.save(orderRequest.getCustomer());
    }

}
