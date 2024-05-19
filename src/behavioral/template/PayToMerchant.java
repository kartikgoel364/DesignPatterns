package behavioral.template;

public class PayToMerchant extends PaymentFlow {
    public PayToMerchant() {
    }

    @Override
    public void validateRequest() {
        // Specific validation for PayToMerchant flow
        System.out.println("Validate logic for PayToMerchant");
    }

    @Override
    public void calculateFees() {
        // Specific Fee Calculation for PayToMerchant flow
        System.out.println("2% Fee Charged");
    }

    @Override
    public void debitAmount() {
        // Debit the amount
        System.out.println("Debit the amount logic for PayToMerchant");
    }

    @Override
    public void creditAmount() {
        // Credit the amount logic
        System.out.println("Credit the remaining amount");
    }
}
