package Factory.que1;

import Factory.que1.Notification;

public class PushNotification implements Notification{
    @Override
    public void send(){
        System.out.println("Push Notification Sent");
    }
}