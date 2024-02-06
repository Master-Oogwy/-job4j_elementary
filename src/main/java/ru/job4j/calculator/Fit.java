package ru.job4j.calculator;

public class Fit {
    public static double manWeight(short height) {
        return (height - 100) * 1.15;
    }

    public static double womanWeight(short height) {
        return (height - 110) * 1.15;
    }

    public static void main(String[] args) {
        System.out.println("Man 175 is " + manWeight((short) 175));
        System.out.println("Woman 170 is " + womanWeight((short) 170));
    }
}
