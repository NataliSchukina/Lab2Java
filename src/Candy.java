public class Candy extends Sweet {
    private String topping;
    public Candy(String name, float weight, String topping) {
        super(name, weight);
        this.topping = topping;
    }
}
