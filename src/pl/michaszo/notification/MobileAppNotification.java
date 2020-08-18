package pl.michaszo.notification;

import pl.michaszo.order.Order;

public class MobileAppNotification implements Observer {

    @Override
    public void update(Order order) {
        System.out.println("App. Zam. nr: " + order.getOrderNumber() + " " + order.getOrderStatus());
    }
}
