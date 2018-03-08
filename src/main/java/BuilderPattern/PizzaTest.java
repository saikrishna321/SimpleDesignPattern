package BuilderPattern;

public class PizzaTest {

    public static void main(String[] args) {
        Pizza pizza = new PizzaBuilder().addCrust("crust").addToppings("hehe").build();
        System.out.println(pizza.getCrust());
    }
}
