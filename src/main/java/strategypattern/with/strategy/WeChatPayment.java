package strategypattern.with.strategy;

/**
 * Created by hiteshs on 3/5/18.
 */
public class WeChatPayment implements PaymentStrategy {
    public void payment() {
        System.out.println("We chat payment done");
    }
}
