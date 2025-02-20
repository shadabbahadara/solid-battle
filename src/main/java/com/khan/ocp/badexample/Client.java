package com.khan.ocp.badexample;

public class Client {
    public static void main(String[] args) {
        NotificationService notificationService = new NotificationService();
        notificationService.sendNotification("email");
        notificationService.sendNotification("sms");
    }
}
