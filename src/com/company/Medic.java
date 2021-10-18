package com.company;

public class Medic extends Hero{

    public Medic(int health, int damage) {
        super(health, damage, "There is always activated carbon", "Medic");
    }

    @Override
    public void applySuperAbility(String superAbilityType) {
        super.applySuperAbility(superAbilityType);
        System.out.println(super.getName() + "used superpower " + '"' + superAbilityType + '"');
    }
}
