package behavioral.chainOfResponsibility.bankHandlers;

import behavioral.ChainOfResponsibility.BankHandler;
import behavioral.ChainOfResponsibility.TransactionRequest;
import behavioral.ChainOfResponsibility.enums.Bank;

public class AxisHandler extends BankHandler {

    public AxisHandler(BankHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handleRequest(TransactionRequest transactionRequest) {
          if(transactionRequest.getBank() == Bank.AXIS) {
              System.out.println("Axis Bank Handler for amount - " + transactionRequest.getAmount());
          } else {
              if (nextHandler != null) {
                  System.out.println("Try next, currently at Axis Handler");
                  nextHandler.handleRequest(transactionRequest);
              } else {
                  System.out.println("At Axis Handler and Next Handler is Null");
              }
          }
    }
}
