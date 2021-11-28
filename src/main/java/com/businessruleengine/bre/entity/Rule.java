package com.businessruleengine.bre.entity;

import java.util.Arrays;
import java.util.List;

public class Rule {

    public  List<String> rulesProducts = new ArrayList<>(Arrays.asList(
            "Generated packing slip for shipping service for product ",
            "Generated commission payment to agent service for product "));

    public  List<String> rulesBooks = new ArrayList<>(Arrays.asList(
            "Generated packing slip for shipping service for book ",
            "Generated commission payment to agent service for book ",
            "Generated Duplicate Packing Slip for Royalty Department service for book "));

    public  List<String> rulesMembershipActivate = new ArrayList<>(Arrays.asList(
            "Activate the membership for ",
            "Email Service for activating membership to user "));

    public  List<String> rulesMembershipUpgrade = new ArrayList<>(Arrays.asList(
            "Upgrading the membership for ",
            "Email Service for upgrading membership to user "));

    public  List<String> rulesVideo = new ArrayList<>(Arrays.asList(
            "Generated packing slip service for video "));

    public  List<String> ruleLearningtoSki = new ArrayList<>(Arrays.asList(
            "Adding First Aid Video to the packaging slip with video "));

    public void addRulesProducts(String rulesProducts) {
        this.rulesProducts.add(rulesProducts);
    }

    public void addRulesBooks(String rulesBooks) {
        this.rulesBooks.add(rulesBooks);
    }

    public void addRulesMembershipActivate(String rulesMembershipActivate) {
        this.rulesMembershipActivate.add(rulesMembershipActivate);
    }

    public void addRulesMembershipUpgrade(String rulesMembershipUpgrade) {
        this.rulesMembershipUpgrade.add(rulesMembershipUpgrade);
    }

    public void addRulesVideo(String rulesVideo) {
        this.rulesVideo.add(rulesVideo);
    }

    public void addRuleLearningtoSki(String ruleLearningtoSki) {
        this.ruleLearningtoSki.add(ruleLearningtoSki);
    }
}
