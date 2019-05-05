package Seewts;

import Seewts.Sweet;

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
        return "Seewts.Chocolate  Name:" + "\t" +getName() + ", Weight: " + getWeight() + ", Price:" + getPrice()
                + ", Kind of chicolate: "+ getKindOfChocolate();
    }
}
