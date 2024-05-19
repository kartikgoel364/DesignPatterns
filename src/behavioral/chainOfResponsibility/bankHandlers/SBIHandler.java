package behavioral.chainOfResponsibility.bankHandlers;

import behavioral.ChainOfResponsibility.BankHandler;
import behavioral.ChainOfResponsibility.TransactionRequest;
import behavioral.ChainOfResponsibility.enums.Bank;

public class SBIHandler extends BankHandler {

    public SBIHandler(BankHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handleRequest(TransactionRequest transactionRequest) {
            if(transactionRequest.getBank() == Bank.SBI) {
                System.out.println("Sbi Bank Handler  for amount - " + transactionRequest.getAmount());
            } else {
                if (nextHandler != null) {
                    System.out.println("Try next, currently at Sbi Handler");
                    nextHandler.handleRequest(transactionRequest);
                } else {
                    System.out.println("At Sbi Handler and Next Handler is Null");
                }
            }

    }
}
