package behavioral.chainOfResponsibility;

import behavioral.ChainOfResponsibility.bankHandlers.AxisHandler;
import behavioral.ChainOfResponsibility.bankHandlers.HDFCHandler;
import behavioral.ChainOfResponsibility.bankHandlers.BOBHandler;
import behavioral.ChainOfResponsibility.bankHandlers.SBIHandler;
import behavioral.ChainOfResponsibility.enums.Bank;

public class Main {
    public static void main(String[] args) {
        BankHandler axisBankHandler = new AxisHandler(null);

        BankHandler hdfcBankHandler = new HDFCHandler(axisBankHandler);

        BankHandler sbiBankHandler = new SBIHandler(hdfcBankHandler);

        BankHandler bobBankHandler = new BOBHandler(sbiBankHandler);

        // Linking :- ( BOB -> SBI -> HDFC -> AXIS )

        TransactionRequest axisRequest = new TransactionRequest(Bank.AXIS, 1000);

        bobBankHandler.handleRequest(axisRequest);

        System.out.println("<<<<<<<<<------------>>>>>>>>>>>");

        TransactionRequest invalidRequest = new TransactionRequest(Bank.KOTAK, 3000);

        bobBankHandler.handleRequest(invalidRequest);

        System.out.println("<<<<<<<<<------------>>>>>>>>>>>");

        TransactionRequest sbiRequest = new TransactionRequest(Bank.SBI, 2000);

        bobBankHandler.handleRequest(sbiRequest);

        System.out.println("<<<<<<<<<------------>>>>>>>>>>>");

        TransactionRequest hfdcRequest = new TransactionRequest(Bank.HDFC, 5500);

        bobBankHandler.handleRequest(hfdcRequest);

        System.out.println("<<<<<<<<<------------>>>>>>>>>>>");

        TransactionRequest bobRequest = new TransactionRequest(Bank.BOB, 7500);

        bobBankHandler.handleRequest(bobRequest);

        System.out.println("<<<<<<<<<------------>>>>>>>>>>>");
    }
}