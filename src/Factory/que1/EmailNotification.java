package Factory.que1;

import Factory.que1.Notification;
public class EmailNotification implements Notification {

    @Override
    public void send(){
        System.out.println("Email Notification sent");
    }
}