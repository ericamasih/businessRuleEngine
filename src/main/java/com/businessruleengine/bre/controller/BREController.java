package com.businessruleengine.bre.controller;

import com.businessruleengine.bre.entity.Payment;
import com.businessruleengine.bre.service.BREService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BREController {

    @Autowired
    private BREService breService;

    @GetMapping("/")
    public String getDefault() {

        return "Welcome to Business Rule Engine";
    }

    @GetMapping("/handlePaymentOrders")
    public List<String> getHandlePaymentOrders(@RequestBody Payment payment) {

        return breService.handlePaymentOrders(payment);
    }

    @PostMapping("/newRule")
    public String newRule(@RequestBody NewRule rule) {

        return breService.newRule(rule);
    }


}
