package com.gcu.controller.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gcu.business.OrdersBusinessServiceInterface;
import com.gcu.model.OrderList;
import com.gcu.model.OrderModel;

import java.util.List;

@RestController
@RequestMapping("/service")
public class OrdersRestController {

    @Autowired
    private OrdersBusinessServiceInterface service;

    @GetMapping(path = "/getjson", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<OrderModel> getOrdersAsJson() {
        return service.getOrders();
    }

    @GetMapping(path = "/getxml", produces = MediaType.APPLICATION_XML_VALUE)
    public OrderList getOrdersAsXml() {
        OrderList list = new OrderList();
        list.setOrders(service.getOrders());
        return list;
    }
}
