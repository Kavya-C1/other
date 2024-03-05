package com.traning.inter;

import java.util.function.BiConsumer;

public class UserCheckMain {
    public static void main(String[] args) {
        
        String name = "Admin";
        int age = 35;

        
        BiConsumer<String, Integer> userChecker = (userName, userAge) -> {
            if (userName.equals("Admin") && userAge > 30) {
                System.out.println("Welcome Admin!");
            } else {
                System.out.println("Wrong user!");
            }
        };

        
        userChecker.accept(name, age);
    }
}