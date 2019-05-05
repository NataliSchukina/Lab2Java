package com.epam.nataliya_shchukina.java.lesson_2.task_1.Seewts;

public class Candy extends Sweet {
    /*конфета*/

    private String topping;
    public Candy(String name, float weight, float price, String topping) {
        super(name, weight,price);
        this.topping = topping;
    }

    public String getTopping() {
        return topping;
            }

    @Override
    public String toString() {
        return "Candy Name:" + "\t" + getName() + "," + "\t"+ "Weight: " + getWeight() + ","+ "\t" +
                " Price: " + getPrice() + "," +  "\t" + "Topping: " + getTopping();
    }
}
