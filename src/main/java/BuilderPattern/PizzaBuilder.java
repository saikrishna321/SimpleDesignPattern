package BuilderPattern;

import pizzastore.Pizza;

import java.util.ArrayList;
import java.util.List;

public class PizzaBuilder {

    private List<String> toppings;
    private String crust;
    private String type;
    private String size;

    public PizzaBuilder() {
        toppings = new ArrayList<String>();
    }

    public PizzaBuilder addTopping(String topping) {
        toppings.add(topping);
        return this;
    }

    public PizzaBuilder withCrust(String crust) {
        this.crust = crust;
        return this;
    }

    public PizzaBuilder withType(String type) {
        this.type = type;
        return this;
    }

    public PizzaBuilder withSize(String size) {
        this.size = size;
        return this;
    }

    public Pizza build() {
        final StringBuilder combinedToppings = new StringBuilder();
        toppings.forEach(topping -> {
            combinedToppings.append(topping + " ,");
        });
        return new Pizza(combinedToppings.toString(), crust, type, size);
    }
}
