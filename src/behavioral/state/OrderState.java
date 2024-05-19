package behavioral.state;

public interface OrderState {
    void next(OrderContext orderContext);
    void prev(OrderContext orderContext);
    void currentStatus();
    void returnOrder(OrderContext orderContext);
}
