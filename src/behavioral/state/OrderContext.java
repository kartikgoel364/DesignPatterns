package behavioral.state;

import behavioral.state.states.OrderedState;

public class OrderContext {
    OrderState orderState;

    public OrderContext() {
        this.orderState = new OrderedState();
    }

    public void setState(OrderState orderState) {
      this.orderState = orderState;
    }

    public void nextState() {
      orderState.next(this);
    }

    public void previousState() {
        orderState.prev(this);
    }

    public void printStatus() {
      orderState.currentStatus();
    }

    public void returnOrder() {
      orderState.returnOrder(this);
    }
}
