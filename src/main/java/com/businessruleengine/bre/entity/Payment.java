package com.businessruleengine.bre.entity;

import java.util.List;

public class Payment {

    private List<String> products;
    private List<String> books;
    private List<String> membershipActivate;
    private List<String> membershipUpgrade;
    private List<String> video;

    public Payment(List<String> products, List<String> books, List<String> membershipActivate, List<String> video, List<String> membershipUpgrade) {
        this.products = products;
        this.books = books;
        this.membershipActivate = membershipActivate;
        this.video = video;
        this.membershipUpgrade = membershipUpgrade;
    }

    public List<String> getProducts() {
        return products;
    }

    public List<String> getBooks() {
        return books;
    }

    public List<String> getMembershipActivate() {
        return membershipActivate;
    }

    public List<String> getVideo() {
        return video;
    }

    public List<String> getMembershipUpgrade() {
        return membershipUpgrade;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "products=" + products +
                ", books=" + books +
                ", membership=" + membershipActivate +
                ", membershipUpgrade=" + membershipUpgrade +
                ", video=" + video +
                '}';
    }
}
