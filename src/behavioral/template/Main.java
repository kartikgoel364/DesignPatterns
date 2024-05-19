package behavioral.template;

public class Main {
    public static void main(String[] args) {
        System.out.println("<<<<<<------>>>>>>>>>>");
        PaymentFlow payToFriend = new PayToFriend();
        payToFriend.sendMoney();

        System.out.println("<<<<<<------>>>>>>>>>>");
        PaymentFlow payToMerchant = new PayToMerchant();
        payToMerchant.sendMoney();

    }
}
