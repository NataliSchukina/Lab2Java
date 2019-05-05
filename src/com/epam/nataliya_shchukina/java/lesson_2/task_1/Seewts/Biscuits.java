package com.epam.nataliya_shchukina.java.lesson_2.task_1.Seewts;

public class Biscuits extends Sweet {
    /*печенье*/

    private int numberInPack;
    public Biscuits(String name, float weight, float price,int numberInPack ) {
        super(name, weight,price);
        this.numberInPack = numberInPack;
    }

    public int getNumberInPack() {
        return numberInPack;
    }

    @Override
    public String toString() {
        return "Biscuits Name:" +"\t" + getName()+"," + "\t" + "Weight: " + getWeight()+"," + "\t" +
                "Price: " + getPrice() + "," + "\t" + "Number in pack: " + getNumberInPack();
    }
}
