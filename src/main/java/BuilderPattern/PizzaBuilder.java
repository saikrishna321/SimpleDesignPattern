package BuilderPattern;

public class PizzaBuilder {

    private String toppings;
    private String crust;
    private String type;
    private String size;

    public PizzaBuilder addToppings(String toppings) {
        this.toppings = toppings;
        return this;
    }

    public PizzaBuilder addCrust(String crust) {
        this.crust = crust;
        return this;
    }

    public PizzaBuilder addType(String type) {
        this.type = type;
        return this;
    }

    public PizzaBuilder addSize(String size) {
        this.size = size;
        return this;
    }

    public Pizza build() {
        return new Pizza(toppings, crust, type, size);
    }
}
