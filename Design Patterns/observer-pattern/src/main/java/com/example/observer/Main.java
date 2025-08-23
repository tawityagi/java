package com.example.observer;

import com.example.subject.NotificationService;

public class Main {
    public static void main(String[] args) {
        NotificationService service = new NotificationService();

        Observer emailObs = new EmailObserver("user@example.com");
        Observer smsObs = new SMSObserver("+123456789");

        service.addObserver(emailObs);
        service.addObserver(smsObs);

        service.newNotification("Your order has been shipped!");

        service.removeObserver(smsObs);

        service.newNotification("Your package has been delivered!");
    }
}
