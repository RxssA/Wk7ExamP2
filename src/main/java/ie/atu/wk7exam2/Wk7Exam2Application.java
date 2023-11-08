package ie.atu.wk7exam2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class Wk7Exam2Application {

    public static void main(String[] args) {
        SpringApplication.run(Wk7Exam2Application.class, args);
    }

}
