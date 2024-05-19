package behavioral.template;

public abstract class PaymentFlow {
    public abstract void validateRequest();
    public abstract void calculateFees();
    public abstract void debitAmount();
    public abstract void creditAmount();

    // This is the template method, which defines the order of steps to execute the task
    public final void sendMoney() {
         // Step-1
         validateRequest();

        // Step-2
        calculateFees();

        // Step-3
        debitAmount();

        // Step-4
        creditAmount();
    }
}
