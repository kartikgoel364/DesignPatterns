package behavioral.state.states;

import behavioral.state.OrderContext;
import behavioral.state.OrderState;

public class ShippedState implements OrderState {
    @Override
    public void next(OrderContext orderContext) {
      orderContext.setState(new DeliveredState());
    }

    @Override
    public void prev(OrderContext orderContext) {
      orderContext.setState(new OrderedState());
    }

    @Override
    public void currentStatus() {
        System.out.println("Current state is Shipped!!");
    }

    @Override
    public void returnOrder(OrderContext orderContext) {
      orderContext.setState(new ReturnedState());
    }
}
