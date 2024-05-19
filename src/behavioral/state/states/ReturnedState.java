package behavioral.state.states;

import behavioral.state.OrderContext;
import behavioral.state.OrderState;

public class ReturnedState implements OrderState {
    @Override
    public void next(OrderContext orderContext) {
      orderContext.setState(new RefundedState());
    }

    @Override
    public void prev(OrderContext orderContext) {
        System.out.println("Cannot go back from returned state!!");
    }

    @Override
    public void currentStatus() {
        System.out.println("Order Returned!!");
    }

    @Override
    public void returnOrder(OrderContext orderContext) {
        System.out.println("The order is already returned!!");
    }
}
