package com.example;

public class HelloWorld {

    static String greeting() {
        return "Hello, World from GraalVM Native Image!";
    }

    public static void main(String[] args) {
        System.out.println(greeting());
    }
}
