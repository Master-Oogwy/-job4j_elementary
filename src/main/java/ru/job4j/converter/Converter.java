package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float result = value / 70;
        return result;
    }

    public static float rubleToDollar(float value) {
        return value / 63;
    }

    public static void main(String[] args) {
        System.out.println(rubleToEuro(1350));
        System.out.println(rubleToDollar(270000));
    }
}
