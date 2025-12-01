package Inventory_Management;

import java.util.PriorityQueue;

public class OrderProcessor {
    private final PriorityQueue<Order> queue;
    public OrderProcessor() {
        queue = new PriorityQueue<>(); // uses compareTo() automatically
    }
    public void addOrder(Order order) {
        queue.add(order);
    }
    public Order processOrder() {
        if (queue.isEmpty()) return null;
        return queue.poll(); // removes head
    }
    public int getSize() {
        return queue.size();
    }

}
