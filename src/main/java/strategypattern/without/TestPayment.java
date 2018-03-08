package strategypattern.without;

/**
 * Created by hiteshs on 3/5/18.
 */


public class TestPayment {

    public static void main(String[] args) {
        testAliPay();
        testCardPay();
        testCardWeChatPay();
    }

    public static void testAliPay() {
        ShippingDetails details= new ShippingDetails();
        details.addShippingDetails();
        Payment payment= new Payment();
        payment.payUsingAliPay();
    }

    public static void testCardPay(){
        ShippingDetails details= new ShippingDetails();
        details.addShippingDetails();
        Payment payment= new Payment();
        payment.payUsingCard();
    }

    public static void testCardWeChatPay(){
        ShippingDetails details= new ShippingDetails();
        details.addShippingDetails();
        Payment payment= new Payment();
        payment.payUsingWechatPay();
    }
}
