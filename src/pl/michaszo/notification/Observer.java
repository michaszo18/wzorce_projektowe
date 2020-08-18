package pl.michaszo.notification;

import pl.michaszo.order.Order;

public interface Observer {

    void update(Order order);

}
