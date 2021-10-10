package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss =new Boss(500, 100, "Physical");
        System.out.println(boss.toString());
        Hero[] heroes = createHero();
        for (int h = 0; h < heroes.length; h++) {
            System.out.println(heroes[h].toString());
        }
    }

    public static Hero[] createHero() {
        Hero[] heroes = new Hero[3];
        for (int i = 0; i < heroes.length; i++) {
            if (i == 0) {
                heroes[i] = new Hero(250, 50);
            } else {
                heroes[i] = new Hero(250, 50, "Can eat a lot of donuts");
            }
        }
        return heroes;
    }
}
