package pl.michaszo.notification;

import pl.michaszo.order.Order;

public class EmailNotification {

    public void updateOrderStatus(Order order) {
        System.out.println("Zam. nr: " + order.getOrderNumber() + " " + order.getOrderStatus());
    }
    
}
