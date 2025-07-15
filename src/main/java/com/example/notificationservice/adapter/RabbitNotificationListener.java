package com.example.notificationservice.adapter;

import com.example.notificationservice.core.service.NotificationService;
import com.example.notificationservice.notification.entity.EmailNotification;
import com.example.notificationservice.notification.entity.PhoneNotification;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class RabbitNotificationListener {
    private final NotificationService notificationService;
    private final ObjectMapper objectMapper;

    public RabbitNotificationListener(NotificationService notificationService, ObjectMapper objectMapper) {
        this.notificationService = notificationService;
        this.objectMapper = objectMapper;
    }

    @RabbitListener(queues = "notification-queue")
    public void receiveNotification(String messageJson) throws Exception {
        if (messageJson.contains("\"email\"")) {
            EmailNotification notification = objectMapper.readValue(messageJson, EmailNotification.class);
            notificationService.notify(notification);
        } else if (messageJson.contains("\"phoneNumber\"")) {
            PhoneNotification notification = objectMapper.readValue(messageJson, PhoneNotification.class);
            notificationService.notify(notification);
        }
    }
}
