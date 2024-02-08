package ru.job4j.condition;

public class Game {
    public static void manu(String name) {
        if ("super mario".equals(name)) {
            System.out.println("Start - super mario");
        }
        if ("tanks".equals(name)) {
            System.out.println("Start - Tanks");
        }
        if ("tetris".equals(name)) {
            System.out.println("Start - Tetris");
        }
    }

    public static void main(String[] args) {
        Game.manu("tanks");
    }
}
