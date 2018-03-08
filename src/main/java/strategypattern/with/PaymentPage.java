package strategypattern.with;

import strategypattern.with.strategy.PaymentStrategy;

/**
 * Created by hiteshs on 3/7/18.
 */
public class PaymentPage {

    PaymentStrategy strategy;

    public PaymentPage(PaymentStrategy strategy){
        this.strategy=strategy;
    }

    public void pay(){
        strategy.payment();
    }
}
