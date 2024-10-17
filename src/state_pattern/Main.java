package state_pattern;

public class Main {
    public static void main(String[] args) {
        Order order = new Order();

        System.out.println("---- Scenario 1: Successful Order ----");
        order.payOrder();
        order.shipOrder();
        order.deliverOrder();

        System.out.println("\n---- Scenario 2: Cancelled Order ----");
        Order anotherOrder = new Order();
        anotherOrder.cancelOrder();
        anotherOrder.payOrder(); // This should not be allowed
    }
}
