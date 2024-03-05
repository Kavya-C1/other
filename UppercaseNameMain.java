package com.traning.inter;
import java.util.function.Supplier;

public class UppercaseNameMain {
    public static void main(String[] args) {
       
        Supplier<String> uppercaseNameSupplier = () -> "YOUR_NAME".toUpperCase();

        
        String uppercaseName = uppercaseNameSupplier.get();

       
        System.out.println("Uppercase name: " + uppercaseName);
    }
}