package state_pattern;

class PaidState implements State {
    @Override
    public void payOrder(Order order) {
        System.out.println("Order is already paid.");
    }

    @Override
    public void shipOrder(Order order) {
        System.out.println("Order has been shipped.");
        order.setState(new ShippedState());
    }

    @Override
    public void deliverOrder(Order order) {
        System.out.println("Cannot deliver the order before it's shipped.");
    }

    @Override
    public void cancelOrder(Order order) {
        System.out.println("Cancelling the order...");
        order.setState(new CancelledState());
    }
}

