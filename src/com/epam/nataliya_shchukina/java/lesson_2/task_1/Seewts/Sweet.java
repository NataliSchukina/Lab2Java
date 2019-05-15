package com.epam.nataliya_shchukina.java.lesson_2.task_1.Seewts;

abstract public class Sweet {
    /*супер класс сладость*/

    private float weight;
    private String name;
    private float price;

    public Sweet(String name, float weight, float price) {
        this.name = name;
        this.weight = weight;
        this.price = price;

    }

    public String getName() {
        return name;
    }

    public float getWeight() {
        return weight;
    }

    public float getPrice() {
        return price;
    }


    @Override
    public abstract String toString();
}

