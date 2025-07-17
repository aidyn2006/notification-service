//package com.example.notificationservice.notification.config;
//
//
//import jakarta.mail.MessagingException;
//import jakarta.mail.internet.MimeMessage;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.amqp.rabbit.annotation.RabbitListener;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.mail.javamail.JavaMailSender;
//import org.springframework.mail.javamail.MimeMessageHelper;
//
////JUST FOR TEST
//@Slf4j
//public class EmailConfig {
//
//    private final JavaMailSender mailSender;
//
//    public EmailConfig(JavaMailSender mailSender) {
//        this.mailSender = mailSender;
//    }
//
//    @RabbitListener(queues = "notification_queue")
//    public void sendEmail(String email) {
//        try {
//            log.info("📥 Получено сообщение:");
//            log.info("📦 Тело: {}", email);
//            log.info("📩 Queue: my-queue-name");
//            MimeMessage mimeMessage = mailSender.createMimeMessage();
//            MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, "utf-8");
//            helper.setText(email, true);
//            helper.setTo("nurlan.aydin06@gmail.com");
//            helper.setSubject("Rabbit");
//            helper.setFrom("nurlan.aydin06nnn@mail.ru");
//            mailSender.send(mimeMessage);
//        } catch (MessagingException e) {
//            throw new IllegalStateException("Failed to send email", e);
//        }
//    }
//}
