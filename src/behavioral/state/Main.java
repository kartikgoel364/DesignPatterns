package behavioral.state;

import behavioral.state.states.CancelledState;

public class Main {
    public static void main(String[] args) {
        OrderContext orderContext = new OrderContext();

        // Ordered State
        orderContext.previousState();
        orderContext.printStatus();

        // Shipped State
        orderContext.nextState();
        orderContext.printStatus();

        // Delivered State
        orderContext.nextState();
        orderContext.printStatus();

        // Returned State
        orderContext.returnOrder();
        orderContext.printStatus();

        // Refunded State
        orderContext.nextState();
        orderContext.printStatus();
        orderContext.nextState();

        // Cancelled State
        orderContext.setState(new CancelledState());
        orderContext.printStatus();
        orderContext.nextState();
        orderContext.previousState();
    }
}
