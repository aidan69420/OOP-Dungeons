package com.company;

public class Boss {
    private int health;
    private int damage;
    private String typeOfProtection;

    public Boss(int health, int damage, String typeOfProtection) {
        this.health = health;
        this.damage = damage;
        this.typeOfProtection = typeOfProtection;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getTypeOfProtection() {
        return typeOfProtection;
    }

    public void setTypeOfProtection(String typeOfProtection) {
        this.typeOfProtection = typeOfProtection;
    }

    @Override
    public String toString() {
        return "Boss{" +
                "health=" + health +
                ", damage=" + damage +
                ", typeOfProtection='" + typeOfProtection + '\'' +
                '}';
    }
}
