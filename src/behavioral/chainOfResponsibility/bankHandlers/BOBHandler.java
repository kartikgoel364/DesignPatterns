package behavioral.chainOfResponsibility.bankHandlers;

import behavioral.ChainOfResponsibility.BankHandler;
import behavioral.ChainOfResponsibility.TransactionRequest;
import behavioral.ChainOfResponsibility.enums.Bank;

public class BOBHandler extends BankHandler {

    public BOBHandler(BankHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handleRequest(TransactionRequest transactionRequest) {
            if(transactionRequest.getBank() == Bank.BOB) {
                System.out.println("Bob Bank Handler  for amount - " + transactionRequest.getAmount());
            } else {
                if (nextHandler != null) {
                    System.out.println("Try next, currently at Bob Handler");
                    nextHandler.handleRequest(transactionRequest);
                } else {
                    System.out.println("At Bob Handler and Next Handler is Null");
                }
            }
    }
}

