package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss =new Boss(500, 100, "Physical");
        System.out.println(boss.toString());

        Hero[] heroes = new Hero[3];
        heroes[0] = new Magic(100, 35);
        heroes[1] = new Medic(75, 10);
        heroes[2] = new Warrior(150, 45);

        for (int i = 0; i < heroes.length; i++) {
            heroes[i].applySuperAbility(heroes[i].getSuperAbility());
        }

//        Hero[] heroes = createHero();
//        for (int h = 0; h < heroes.length; h++) {
//            System.out.println(heroes[h].toString());
//        }

        Skeleton[] spookyMemes = new Skeleton[2];
        for (int i = 0; i < spookyMemes.length; i++) {
            spookyMemes[i] = new Skeleton(300, 100, "Calcium", 12);
            System.out.println(spookyMemes[i].toString());
        }
    }

//    public static Hero[] createHero() {
//        Hero[] heroes = new Hero[3];
//
//        for (int i = 0; i < heroes.length; i++) {
//            if (i == 0) {
//                heroes[i] = new Hero(250, 50);
//            } else {
//                heroes[i] = new Hero(250, 50, "Can eat a lot of donuts");
//            }
//        }
//
//        return heroes;
//    }
}
