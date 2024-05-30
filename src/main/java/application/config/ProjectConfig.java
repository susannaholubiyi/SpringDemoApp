package application.config;

import application.services.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;

@Configuration
@ComponentScan(basePackages = "application")
public class ProjectConfig {
    @Bean
    public HelloService helloService(){
        HelloService helloService = new HelloService();
        System.out.println("helloService bean in context => "+ helloService);
        return helloService;
    }

    @Bean
    public BigDecimal bigDecimal(){
        return new BigDecimal(200);
    }
}
