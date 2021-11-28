package com.businessruleengine.bre.service;

import com.businessruleengine.bre.entity.Payment;
import com.businessruleengine.bre.entity.Rule;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Service
public class BREService {

    public List<String> handlePaymentOrders(Payment payment) {

        List<String> responses = new CopyOnWriteArrayList<>();

        // For more clarity, each of the payments types can be in new functions

        payment.getProducts().forEach(e -> {
            Rule.rulesProducts.forEach(f -> responses.add(f + e));
        });

        payment.getBooks().forEach(e -> {
            Rule.rulesBooks.forEach(f -> responses.add(f + e));
        });

        payment.getMembershipActivate().forEach(e -> {
            Rule.rulesMembershipActivate.forEach(f -> responses.add(f + e));
        });

        payment.getMembershipUpgrade().forEach(e -> {
            Rule.rulesMembershipUpgrade.forEach(f -> responses.add(f + e));
        });

        payment.getVideo().forEach(e -> {
            Rule.rulesVideo.forEach(f -> responses.add(f + e));
            if(e.equals("Learning to Ski")) {
                Rule.ruleLearningtoSki.forEach(g -> responses.add(g + e));
            }
        });
        return responses;
    }

    public String newRule(NewRule rule) {

        String product = rule.getProduct();

        switch(product){
            case "physical product" :
                Rule.addRulesProducts(rule.getDescription());
                break;
            case "book":
                Rule.addRulesBooks(rule.getDescription());
                break;
            case "membership":
                Rule.addRulesMembershipActivate(rule.getDescription());
                break;
            case "upgrade to a membership":
                Rule.addRulesMembershipUpgrade(rule.getDescription());
                break;
            case "video":
                Rule.addRulesVideo(rule.getDescription());
                break;
            default:
                return "No Data Found"



        }
        return "Successfully added new Rule";
    }
}
