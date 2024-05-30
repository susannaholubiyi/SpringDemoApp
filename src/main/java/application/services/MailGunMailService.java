package application.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;
@Primary
@Repository
public class MailGunMailService implements MailService{
    @Override
    public void sendMailTo(String email) {
        System.out.println("Mail delivered to "+ email + " using Mail gun");
    }
}
