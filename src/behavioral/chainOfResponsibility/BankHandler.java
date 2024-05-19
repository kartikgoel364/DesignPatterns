package behavioral.chainOfResponsibility;

public abstract class BankHandler {
    public BankHandler nextHandler;

    public BankHandler(BankHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handleRequest(TransactionRequest transactionRequest);
}
