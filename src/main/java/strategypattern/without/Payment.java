package strategypattern.without;

/**
 * Created by hiteshs on 3/5/18.
 */
public class Payment {
    public void payUsingAliPay(){
        System.out.println("payment done by ali pay");
    }

    public void payUsingCard(){
        System.out.println("payment done by card");
    }

    public void payUsingWechatPay(){
        System.out.println("payment done by we chat pay");
    }
    
}
