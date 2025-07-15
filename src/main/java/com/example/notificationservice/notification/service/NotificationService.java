package com.example.notificationservice.notification.service;

import com.example.notificationservice.notification.NotifyAdapter.Notification;
import com.example.notificationservice.notification.NotifyAdapter.Notify;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    public void sendNotification(Notification notification, Notify notify) {
        notify.send(notification);
    }
}
