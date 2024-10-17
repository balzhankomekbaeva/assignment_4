package state_pattern;

class CancelledState implements State {
    @Override
    public void payOrder(Order order) {
        System.out.println("Cannot pay. The order is cancelled.");
    }

    @Override
    public void shipOrder(Order order) {
        System.out.println("Cannot ship. The order is cancelled.");
    }

    @Override
    public void deliverOrder(Order order) {
        System.out.println("Cannot deliver. The order is cancelled.");
    }

    @Override
    public void cancelOrder(Order order) {
        System.out.println("The order is already cancelled.");
    }
}

