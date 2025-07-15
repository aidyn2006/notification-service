package com.example.notificationservice.core.service;

import com.example.notificationservice.core.domain.Notification;
import com.example.notificationservice.core.usecase.SendNotificationUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.HashMap;

@Service
public class NotificationService {
    private final Map<Class<? extends Notification>, SendNotificationUseCase> notifierMap = new HashMap<>();

    @Autowired
    public NotificationService(List<SendNotificationUseCase> notifiers) {
        for (SendNotificationUseCase notifier : notifiers) {

        }
    }

    public void notify(Notification notification) {
        SendNotificationUseCase notifier = notifierMap.get(notification.getClass());
        if (notifier != null) {
            notifier.send(notification);
        } else {
            throw new IllegalArgumentException("No adapter for notification type: " + notification.getClass());
        }
    }
}
