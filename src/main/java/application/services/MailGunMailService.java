package application.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Primary
@Service
public class MailGunMailService implements MailService{

    private  HelloService helloService;

    @Autowired
    public void setHelloService(HelloService helloService){
        System.out.println("creating  mailGunMailService");
        this.helloService = helloService;
    }
    @Override
    public void sendMailTo(String email) {
        helloService.sayHello(email);
        System.out.println("Mail delivered to "+ email + " using Mail gun");
    }
}
