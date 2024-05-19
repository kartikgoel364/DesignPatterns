package behavioral.chainOfResponsibility;

import behavioral.ChainOfResponsibility.enums.Bank;

public class TransactionRequest {
    private final Bank bank;

    public Integer getAmount() {
        return amount;
    }

    private final Integer amount;

    public TransactionRequest(Bank bank, Integer amount) {
        this.bank = bank;
        this.amount = amount;
    }

    public Bank getBank() {
        return bank;
    }
}
