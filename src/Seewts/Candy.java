package Seewts;

import Seewts.Sweet;

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
        return "Seewts.Candy  Name:" + "\t" + getName() + ", Weight: " + getWeight() + ", Price:" + getPrice() +
                ", Topping: " + getTopping();
    }
}
