package com.ksbhat.java.exceptionhandling;

public class SampleNullPointerException {
    public static void main(String[] args) {
        callMethod();
        System.out.println("callMethod Done");
    }
    static void callMethod() {
        String str = null;
        int len = str.length();
        System.out.println("String Length Done");
    }
}
