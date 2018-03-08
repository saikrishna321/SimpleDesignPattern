package strategypattern.with.strategy;

/**
 * Created by hiteshs on 3/5/18.
 */
public class CardPayment implements PaymentStrategy {
    public void payment() {

        System.out.println("Card payment done");
    }
}
