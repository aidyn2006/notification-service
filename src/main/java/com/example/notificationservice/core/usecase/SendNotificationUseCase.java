package com.example.notificationservice.core.usecase;

import com.example.notificationservice.core.domain.Notification;

public interface SendNotificationUseCase {
    void send(Notification notification);
}
