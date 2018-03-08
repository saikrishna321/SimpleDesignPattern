package strategypattern.with.strategy;

/**
 * Created by hiteshs on 3/5/18.
 */
public class AliPay implements PaymentStrategy {
    public void payment() {
        System.out.println("Alipay payment done");
    }
}
