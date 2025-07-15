package com.example.notificationservice.adapter;

import com.example.notificationservice.core.domain.Notification;
import com.example.notificationservice.core.usecase.SendNotificationUseCase;
import org.springframework.stereotype.Component;

@Component
public class PhoneNotificationAdapter implements SendNotificationUseCase {
    @Override
    public void send(Notification notification) {
        System.out.println("Send SMS to " + notification.getRecipient() + ": " + notification.getMessage());
    }
}
