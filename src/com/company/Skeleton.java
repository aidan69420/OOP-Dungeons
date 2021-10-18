package com.company;

public class Skeleton extends Boss{
    int numberOfArrows;

    public Skeleton(int health, int damage, String typeOfProtection, int numberOfArrows) {
        super(health, damage, typeOfProtection);
        this.numberOfArrows = numberOfArrows;
    }

    public int getNumberOfArrows() {
        return numberOfArrows;
    }

    public void setNumberOfArrows(int numberOfArrows) {
        this.numberOfArrows = numberOfArrows;
    }

    @Override
    public String toString() {
        return "Skeleton{" +
                "numberOfArrows=" + numberOfArrows +
                "typeOfProtection = '" + super.getTypeOfProtection() + '\'' +
                "health = " + super.getHealth() +
                "damage = " + super.getDamage() +
                '}';
    }
}
