package com.company;

public class Warrior extends Hero{

    public Warrior(int health, int damage) {
        super(health, damage, "Nothing special", "Warrior");
    }

    @Override
    public void applySuperAbility(String superAbilityType) {
        super.applySuperAbility(superAbilityType);
        System.out.println(super.getName() + "used superpower " + '"' + superAbilityType + '"');
    }
}
