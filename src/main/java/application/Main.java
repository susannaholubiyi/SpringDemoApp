package application;

import application.config.ProjectConfig;
import application.services.HelloService;
import application.services.MailService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        System.out.println("beans in context");

        MailService mailService = context.getBean(MailService.class);
        mailService.sendMailTo("Elonmusk@gmail.com");
    }
}
