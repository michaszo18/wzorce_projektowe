package pl.michaszo.notification;

import pl.michaszo.order.Order;

public class TextMessage implements Observer {

    @Override
    public void update(Order order) {
        System.out.println("SMS. Zam. nr: " + order.getOrderNumber() + " " + order.getOrderStatus());
    }

}
