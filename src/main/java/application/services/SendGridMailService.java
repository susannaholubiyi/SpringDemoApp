package application.services;

public class SendGridMailService implements MailService{
    @Override
    public void sendMailTo(String email) {
        System.out.println("Mail delivered to "+ email + " using Send grid");
    }
}
