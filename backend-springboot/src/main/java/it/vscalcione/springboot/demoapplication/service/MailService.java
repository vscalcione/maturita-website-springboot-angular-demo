package it.vscalcione.springboot.demoapplication.service;

import it.vscalcione.springboot.demoapplication.model.NotificationEmail;

public interface MailService {

    void sendEmail(NotificationEmail notificationEmail);
}
