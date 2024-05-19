package behavioral.state.states;

import behavioral.state.OrderContext;
import behavioral.state.OrderState;

public class CancelledState implements OrderState {
    @Override
    public void next(OrderContext orderContext) {
        System.out.println("The order is cancelled and cannot proceed!!");
    }

    @Override
    public void prev(OrderContext orderContext) {
        System.out.println("The order is cancelled and cannot revert!!");
    }

    @Override
    public void currentStatus() {
        System.out.println("Current state is Returned!!");
    }

    @Override
    public void returnOrder(OrderContext orderContext) {
        System.out.println("The order is cancelled and cannot be returned.");
    }


}
