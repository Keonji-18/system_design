package Factory.que1;
import Factory.que1.NotificationFactory;

class Client{
    public static void main(String[] args) {
        Notification notification1 = NotificationFactory.createNotification("SMSNotification".toLowerCase());
        notification1.send();

        Notification notification2 = NotificationFactory.createNotification("pushnotification".toLowerCase());
        notification2.send();

        Notification notification3 = NotificationFactory.createNotification("emailnotification".toLowerCase());
        notification3.send();

//        Notification notification4 = NotificationFactory.createNotification("WhtsappNotification".toLowerCase());
/*       If we enter a invalid notification type the default message inside Notification Factory will run with the message :
            "Invalid notification type" */
    }
}