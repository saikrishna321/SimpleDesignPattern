package factory;

import org.junit.Test;
import pizzastore.CheesePizza;
import pizzastore.ChickenPizza;
import pizzastore.Pizza;

public class PizzaFactoryTest {

    @Test
    public void withoutFactory(){
        CheesePizza cheesePizza = new CheesePizza();
        System.out.println(cheesePizza);

        ChickenPizza chickenPizza = new ChickenPizza();
        System.out.println(chickenPizza);

        //Some new pizza comes up I need to know a new class as a user.
    }

    @Test
    public void withFactory(){
        PizzaFactory pizzaFactory = new PizzaFactory();

        Pizza cheese = pizzaFactory.getPizza("cheese");
        System.out.println(cheese);

        Pizza chicken = pizzaFactory.getPizza("chicken");
        System.out.println(chicken);
    }
}
