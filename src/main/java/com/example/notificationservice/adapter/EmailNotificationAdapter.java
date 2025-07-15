package com.example.notificationservice.adapter;

import com.example.notificationservice.core.domain.Notification;
import com.example.notificationservice.core.usecase.SendNotificationUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class EmailNotificationAdapter implements SendNotificationUseCase {
    @Autowired
    private JavaMailSender mailSender;

    @Override
    public void send(Notification notification) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(notification.getRecipient());
        message.setText(notification.getMessage());
        mailSender.send(message);
    }
}
