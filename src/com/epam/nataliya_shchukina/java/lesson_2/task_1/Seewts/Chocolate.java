package com.epam.nataliya_shchukina.java.lesson_2.task_1.Seewts;

public class Chocolate extends Sweet {
    /*шоколад*/

    private String kindOfChocolate;
    public Chocolate(String name, float weight,float price, String kindOfChocolate ) {
        super(name, weight,price);
        this.kindOfChocolate = kindOfChocolate;
    }

    public String getKindOfChocolate() {
        return kindOfChocolate;
     }

    @Override
    public String toString() {
        return "Chocolate Name:" + "\t" +getName() + ","+"\t"+ "Weight: " + getWeight() + "," + "\t" +
                "Price:" + getPrice()+ "," + "\t" + "Kind of chicolate: "+ getKindOfChocolate();
    }
}
