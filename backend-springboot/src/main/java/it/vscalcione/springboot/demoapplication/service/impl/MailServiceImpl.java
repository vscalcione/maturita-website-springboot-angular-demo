package it.vscalcione.springboot.demoapplication.service.impl;

import it.vscalcione.springboot.demoapplication.model.NotificationEmail;
import it.vscalcione.springboot.demoapplication.service.MailService;
import org.springframework.stereotype.Service;

@Service
public class MailServiceImpl implements MailService {

    @Override
    public void sendEmail(NotificationEmail notificationEmail) {
        
    }
}
