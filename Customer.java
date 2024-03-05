package com.traning.inter;

import java.util.Scanner;

interface FeaturePhone {
    void call();
    void messaging();
}

class BasicMobile implements FeaturePhone {
    public void call() {
        System.out.println("Making a call using buttons");
    }

    public void messaging() {
        System.out.println("Using SMS messaging service");
    }
}

interface SmartPhone extends FeaturePhone {
    void showApps();
    void cameraTypes();
}

class TouchScreenMobile extends BasicMobile implements SmartPhone {
    public void showApps() {
        System.out.println("Displaying installed apps");
    }

    public void cameraTypes() {
        System.out.println("Front camera for selfies, Rear camera for regular photos");
    }
}

public class Customer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which type of phone do you want? (basic/touchscreen)");
        String phoneType = scanner.next();

        FeaturePhone phone;
        switch (phoneType) {
            case "basic":
                phone = new BasicMobile();
                break;
            case "touchscreen":
                phone = new TouchScreenMobile();
                break;
            default:
                System.out.println("Invalid phone type");
                return;
        }

        if (phone instanceof SmartPhone) {
            SmartPhone smartPhone = (SmartPhone) phone;
            smartPhone.call();
            smartPhone.messaging();
            smartPhone.showApps();
            smartPhone.cameraTypes();
        } else {
            phone.call();
            phone.messaging();
        }
    }
}