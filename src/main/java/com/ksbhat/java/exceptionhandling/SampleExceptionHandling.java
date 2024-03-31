package com.ksbhat.java.exceptionhandling;

public class SampleExceptionHandling {
    public static void main(String[] args) {
        method1();
        System.out.println("main() Done");
    }
    static void method1() {
        method2();
        System.out.println("method1() done");
    }
    static void method2() {
        try {
            String str = null;
            int len = str.length();
            System.out.println("method2() Done");
        } catch (Exception ex) {
        }
    }
}
