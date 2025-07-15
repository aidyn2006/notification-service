package com.example.notificationservice.notification.entity;

import com.example.notificationservice.core.domain.Notification;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PhoneNotification implements Notification {
    
    @Id
    private UUID id;
    
    private String phoneNumber;
    private String message;
    
    @CreationTimestamp
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private LocalDateTime updatedAt;

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public String getRecipient() {
        return phoneNumber;
    }
}
