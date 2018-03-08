package BuilderPattern;

import org.junit.Test;
import pizzastore.Pizza;

public class PizzaBuilderTest {

    @Test
    public void pizzaBuilder() {
        Pizza pizza = new PizzaBuilder()
                .addTopping("mushroom")
                .addTopping("chicken")
                .addTopping("mozarella")
                .withCrust("thin crust")
                .withSize("Super BIG")
                .withType("SUPER SPECIAL")
                .build();
        System.out.println(pizza);
    }
}
