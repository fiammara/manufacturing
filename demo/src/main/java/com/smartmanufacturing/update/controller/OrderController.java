package com.smartmanufacturing.update.controller;

import com.smartmanufacturing.update.model.Order;
import com.smartmanufacturing.update.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/api/orders")
public class OrderController {


    @Autowired
    private OrderService orderService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Order> findAllOrders() {
        return orderService.findAllOrders();
    }
}
