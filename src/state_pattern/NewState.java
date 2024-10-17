package state_pattern;

class NewState implements State {
    @Override
    public void payOrder(Order order) {
        System.out.println("Order has been paid.");
        order.setState(new PaidState());
    }

    @Override
    public void shipOrder(Order order) {
        System.out.println("Cannot ship the order. Payment required.");
    }

    @Override
    public void deliverOrder(Order order) {
        System.out.println("Cannot deliver the order. Payment required.");
    }

    @Override
    public void cancelOrder(Order order) {
        System.out.println("Order has been cancelled.");
        order.setState(new CancelledState());
    }
}

