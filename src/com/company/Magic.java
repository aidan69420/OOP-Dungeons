package com.company;

public class Magic extends Hero{
    String name = "Magic";

    public Magic(int health, int damage) {
        super(health, damage, "Can read in polish");
        super.setName(this.name);
    }

    @Override
    public void applySuperAbility(String superAbilityType) {
        super.applySuperAbility(superAbilityType);
        System.out.println(name + "used superpower " + '"' + superAbilityType + '"');
    }
}
