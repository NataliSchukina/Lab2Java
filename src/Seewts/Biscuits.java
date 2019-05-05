package Seewts;

import Seewts.Sweet;

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
        return "Seewts.Biscuits  Name:" +"\t" + getName() + ", Weight: " + getWeight() + ", Price:" + getPrice() +
                ", Number in pack: " + getNumberInPack();
    }
}
