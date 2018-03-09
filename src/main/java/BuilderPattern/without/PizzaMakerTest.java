package BuilderPattern.without;

import BuilderPattern.PizzaBuilder;
import org.junit.Test;
import pizzastore.Pizza;

public class PizzaMakerTest {

    @Test
    public void pizzaBuilder() {
        String toppings = "Mushroom, Chicken, Mozarella";
        String crust = "Thin crust";
        String type = "SUPER SPECIAL";
        String size = "Super BIG";

        Pizza pizza = new Pizza(toppings,crust,type,size);

        System.out.println(pizza);
    }
}
