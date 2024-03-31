package com.ksbhat.java.exceptionhandling;

import java.util.Scanner;

public class SampleFinally {
    public static void main(String[] args) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(System.in);
            // ... Program logic, probably using scanner input
            int[] numbers = {1, 2, 3, 4};
            int num = numbers[5];
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if(scanner != null) {
                System.out.println("Before scanner close");
                scanner.close();
            }
        }
        System.out.println("Before exiting main");
    }
}

abstract class AbstractAnimal {
    abstract public void bark();
}
class Animal {
    public void bark() {
        System.out.println("Animal Bark");
    }
}
