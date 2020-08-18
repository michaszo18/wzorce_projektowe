package pl.michaszo.notification;

import pl.michaszo.order.Order;

public class EmailNotification implements Observer {

    @Override
    public void update(Order order) {
        System.out.println("Email. Zam. nr: " + order.getOrderNumber() + " " + order.getOrderStatus());
    }
}
