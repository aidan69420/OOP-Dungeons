package com.company;

public class Hero extends GameEntity{
    private String superAbility;

    public Hero(int health, int damage, String superAbility) {
        super(health, damage);
        this.superAbility = superAbility;
    }

    public Hero(int health, int damage) {
        super(health, damage);
    }


    public String getSuperAbility() {
        return superAbility;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "superAbility='" + superAbility + '\'' +
                "health = " + super.getHealth() +
                "damage = " + super.getDamage() +
                '}';
    }
}
