package com.company;

public abstract class Hero extends GameEntity implements HavingSuperAbility{
    private String superAbility;
    private String name;

    public Hero(int health, int damage, String superAbility) {
        super(health, damage);
        this.superAbility = superAbility;
    }

    public Hero(int health, int damage, String superAbility, String name) {
        super(health, damage);
        this.superAbility = superAbility;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Hero(int health, int damage) {
        super(health, damage);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSuperAbility() {
        return superAbility;
    }

    @Override
    public void applySuperAbility(String superAbilityType) {

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
