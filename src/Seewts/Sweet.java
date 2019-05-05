package Seewts;

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
    public String toString() {
        return "Seewts.Sweet:";
    }
}

