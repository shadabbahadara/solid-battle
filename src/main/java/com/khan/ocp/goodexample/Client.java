package com.khan.ocp.goodexample;

public class Client {
    private NotificationService notificationService;
    public Client(NotificationService notificationService) {
        this.notificationService = notificationService;
    }
    public static void main(String[] args) {
        Client client = new Client(new EmailNotificationService());

        client.notificationService.sendNotification();
    }
}
