package behavioral.state.states;

import behavioral.state.OrderContext;
import behavioral.state.OrderState;

public class RefundedState implements OrderState {
    @Override
    public void next(OrderContext orderContext) {
      System.out.println("The order is already refunded.");
    }

    @Override
    public void prev(OrderContext orderContext) {
        System.out.println("Order is already refunded!!");
    }

    @Override
    public void currentStatus() {
      System.out.println("Current State is Refunded!!");
    }

    @Override
    public void returnOrder(OrderContext orderContext) {
        System.out.println("The order is already refunded!!");
    }
}
