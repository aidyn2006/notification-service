package com.example.notificationservice.notification.consumer;

import com.example.notificationservice.core.domain.Notification;
import com.example.notificationservice.core.service.NotificationService;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class NotificationRabbitConsumer {

    private final NotificationService notificationService;

    public void handleEmail(Notification notification) {
        notificationService.notify(notification);
    }
}
