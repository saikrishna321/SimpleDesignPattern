package strategypattern.with;

import strategypattern.with.strategy.AliPay;
import strategypattern.with.strategy.CardPayment;
import strategypattern.with.strategy.WeChatPayment;

/**
 * Created by hiteshs on 3/5/18.
 */


public class TestPayment {

    public static void main(String[] args) {
        testAliPay();
        testCardPay();
        testWeChatPay();
    }

    public static void testAliPay() {
        ShippingDetails details= new ShippingDetails();
        details.addShippingDetails();
        PaymentPage payment= new PaymentPage(new AliPay());
        payment.pay();
    }

    public static void testCardPay(){
        ShippingDetails details= new ShippingDetails();
        details.addShippingDetails();
        PaymentPage payment= new PaymentPage(new CardPayment());
        payment.pay();
    }

    public static void testWeChatPay(){
        ShippingDetails details= new ShippingDetails();
        details.addShippingDetails();
        PaymentPage payment= new PaymentPage(new WeChatPayment());
        payment.pay();
    }
}
