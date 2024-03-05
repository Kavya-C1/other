package com.traning.inter;

import java.util.function.Consumer;

public class AdditionMain {
    public static void main(String[] args) {
        
        Consumer<Integer[]> adder = numbers -> {
            int sum = numbers[0] + numbers[1];
            System.out.println("Sum of " + numbers[0] + " and " + numbers[1] + " is: " + sum);
        };

       
        Integer[] numbers = {5, 7};

        
        adder.accept(numbers);
    }
}