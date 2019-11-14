package com.andrei.learning;

public class Calculator {

    public static void main(String[] args) {
        System.out.println(Calculator.add(5,5));
    }
    private Calculator() {}

    public static int add(int i, int j) {
        return i + j;
    }
}