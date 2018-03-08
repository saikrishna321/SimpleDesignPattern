package factory;

import pizzastore.CheesePizza;
import pizzastore.ChickenPizza;
import pizzastore.MushroomPizza;
import pizzastore.Pizza;

public class PizzaFactory {
    public Pizza getPizza(String type){
        if("cheese".equalsIgnoreCase(type))
            return new CheesePizza();
        if("mushroom".equalsIgnoreCase(type))
            return new MushroomPizza();
        if("chicken".equalsIgnoreCase(type))
            return new ChickenPizza();
        else
            return new Pizza();
    }
}
