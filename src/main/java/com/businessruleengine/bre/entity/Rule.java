package com.businessruleengine.bre.entity;

import java.util.Arrays;
import java.util.List;

public class Rule {

    public static List<String> rulesProducts = Arrays.asList(
            "Generated packing slip for shipping service for product ",
            "Generated commission payment to agent service for product ");

    public static List<String> rulesBooks = Arrays.asList(
            "Generated packing slip for shipping service for book ",
            "Generated commission payment to agent service for book ",
            "Generated Duplicate Packing Slip for Royalty Department service for book ");

    public static List<String> rulesMembershipActivate = Arrays.asList(
            "Activate the membership for ",
            "Email Service for activating membership to user ");

    public static List<String> rulesMembershipUpgrade = Arrays.asList(
            "Upgrading the membership for ",
            "Email Service for upgrading membership to user ");

    public static List<String> rulesVideo = Arrays.asList(
            "Generated packing slip service for video ");

    public static List<String> ruleLearningtoSki = Arrays.asList(
            "Adding First Aid Video to the packaging slip with video ");
}
