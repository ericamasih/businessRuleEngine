package com.businessruleengine.bre.service;

import com.businessruleengine.bre.entity.Payment;
import com.businessruleengine.bre.entity.Rule;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Service
public class BREService {

    @Autowired
    Rule rule;

    public List<String> handlePaymentOrders(Payment payment) {

        List<String> responses = new CopyOnWriteArrayList<>();

        // For more clarity, each of the payments types can be in new functions

        payment.getProducts().forEach(e -> {
            rule.rulesProducts.forEach(f -> responses.add(f + e));
        });

        payment.getBooks().forEach(e -> {
            rule.rulesBooks.forEach(f -> responses.add(f + e));
        });

        payment.getMembershipActivate().forEach(e -> {
            rule.rulesMembershipActivate.forEach(f -> responses.add(f + e));
        });

        payment.getMembershipUpgrade().forEach(e -> {
            rule.rulesMembershipUpgrade.forEach(f -> responses.add(f + e));
        });

        payment.getVideo().forEach(e -> {
            rule.rulesVideo.forEach(f -> responses.add(f + e));
            if(e.equals("Learning to Ski")) {
                rule.ruleLearningtoSki.forEach(g -> responses.add(g + e));
            }
        });
        return responses;
    }

    public String newRule(NewRule newRule) {

        String product = newRule.getProduct();

        switch(product){
            case "physical product" :
                rule.addRulesProducts(newRule.getDescription());
                break;
            case "book":
                rule.addRulesBooks(newRule.getDescription());
                break;
            case "membership":
                rule.addRulesMembershipActivate(newRule.getDescription());
                break;
            case "upgrade to a membership":
                rule.addRulesMembershipUpgrade(newRule.getDescription());
                break;
            case "video":
                rule.addRulesVideo(newRule.getDescription());
                break;
            default:
                return "No Data Found"



        }
        return "Successfully added new Rule";
    }
}
