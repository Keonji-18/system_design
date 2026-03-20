package Factory.que1;
import Factory.que1.Notification;
public class SMSNotification implements Notification{
    @Override
    public void send(){
        System.out.println("SMS Notification sent");
    }
}