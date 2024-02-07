package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float result = value / 70;
        return result;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        System.out.println(rubleToEuro(1350));
        System.out.println(rubleToDollar(270000));
        float input = 140;
        float expected = 2;
        float output = Converter.rubleToDollar(input);
        boolean passed = expected == output;
        System.out.println("140 rubles are 2. Test result : " + passed);
    }
}
