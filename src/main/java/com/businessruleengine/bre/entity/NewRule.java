package com.businessruleengine.bre.entity;

import java.util.List;

public class NewRule {

    private String product;
    private String description;


    public NewRule(String products, String description) {
        this.product = products;
        this.description = description;
    }

    public String getProduct() {
        return product;
    }

    public String getDescription() {
        return description;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "NewRule{" +
                "product=" + product +
                ", description=" + description +
                '}';
    }


}
