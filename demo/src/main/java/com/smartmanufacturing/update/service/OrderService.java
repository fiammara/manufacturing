package com.smartmanufacturing.update.service;

import com.smartmanufacturing.update.model.Order;
import com.smartmanufacturing.update.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public List<Order> findAllOrders() {

        return orderRepository.findAll();
    }
}

