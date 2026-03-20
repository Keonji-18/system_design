package Factory.que1;

import Factory.que1.*;
public class NotificationFactory {
    public static Notification createNotification(String type){
        switch (type){
            case "emailnotification":
                return new EmailNotification();
            case "smsnotification" :
                return new SMSNotification();
            case "pushnotification":
                return new PushNotification();
            default:
                System.out.println("Invalid notification type");
                return null;
    }
}
}