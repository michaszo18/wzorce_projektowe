package pl.michaszo;

import pl.michaszo.notification.EmailNotification;
import pl.michaszo.notification.MobileAppNotification;
import pl.michaszo.notification.TextMessage;
import pl.michaszo.order.Order;
import pl.michaszo.order.OrderStatus;

public class Main {

    public static void main(String[] args) {

        Order o = new Order(1024, OrderStatus.ZAREJESTROWANE);

        var textMessage = new TextMessage();
        var mobileAppNotification = new MobileAppNotification();
        var emailNotification = new EmailNotification();

        textMessage.updateOrderStatus(o);
        mobileAppNotification.updateOrderStatus(o);
        emailNotification.updateOrderStatus(o);
    }
}
