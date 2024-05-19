package behavioral.template;

public class PayToFriend extends PaymentFlow {

    public PayToFriend() {
    }

    @Override
    public void validateRequest() {
        // Specific validation for PayToFriend flow
        System.out.println("Validate logic for PayToFriend");
    }

    @Override
    public void calculateFees() {
        // Specific Fee Calculation for PayToFriend flow
        System.out.println("0% Fee Charged");
    }

    @Override
    public void debitAmount() {
        // Debit the amount
        System.out.println("Debit the amount logic for PayToFriend");
    }

    @Override
    public void creditAmount() {
        // Credit the amount logic
        System.out.println("Credit the full amount");
    }


}
