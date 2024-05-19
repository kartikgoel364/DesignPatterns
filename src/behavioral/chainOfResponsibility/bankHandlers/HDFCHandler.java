package behavioral.chainOfResponsibility.bankHandlers;

import behavioral.ChainOfResponsibility.BankHandler;
import behavioral.ChainOfResponsibility.TransactionRequest;
import behavioral.ChainOfResponsibility.enums.Bank;

public class HDFCHandler extends BankHandler {

    public HDFCHandler(BankHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handleRequest(TransactionRequest transactionRequest) {
            if (transactionRequest.getBank() == Bank.HDFC) {
                System.out.println("Hdfc Bank Handler  for amount - " + transactionRequest.getAmount());
            } else {
                if (nextHandler != null) {
                    System.out.println("Try next, currently at Hdfc Handler");
                    nextHandler.handleRequest(transactionRequest);
                } else {
                    System.out.println("At Hdfc Handler and Next Handler is Null");
                }
            }
    }
}
