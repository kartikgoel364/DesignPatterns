package behavioral.state.states;

import behavioral.state.OrderContext;
import behavioral.state.OrderState;

public class DeliveredState implements OrderState {
    @Override
    public void next(OrderContext orderContext) {
      System.out.println("Order is delivered, no next state");
    }

    @Override
    public void prev(OrderContext orderContext) {
      orderContext.setState(new ShippedState());
    }

    @Override
    public void currentStatus() {
      System.out.println("Current State is Delivered!!");
    }

    @Override
    public void returnOrder(OrderContext orderContext) {
       orderContext.setState(new ReturnedState());
    }
}
