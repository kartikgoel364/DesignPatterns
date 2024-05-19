package behavioral.state.states;

import behavioral.state.OrderContext;
import behavioral.state.OrderState;

public class OrderedState implements OrderState {

    @Override
    public void next(OrderContext orderContext) {
      orderContext.setState(new ShippedState());
    }

    @Override
    public void prev(OrderContext context) {
        System.out.println("The order is in its initial state!!");
    }

    @Override
    public void currentStatus() {
      System.out.println("Order placed but not shipped yet!!");
    }

    @Override
    public void returnOrder(OrderContext orderContext) {
        orderContext.setState(new ReturnedState());
    }
}
