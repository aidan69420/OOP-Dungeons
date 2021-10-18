package com.company;

public class Boss extends GameEntity{

    private String typeOfProtection;

    public Boss(int health, int damage, String typeOfProtection) {
        super(health, damage);
        this.typeOfProtection = typeOfProtection;
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
                "typeOfProtection = '" + typeOfProtection + '\'' +
                "health = " + super.getHealth() +
                "damage = " + super.getDamage() +
                '}';
    }
}
