package uz.bakhromjon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SpringBootAppProductionApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootAppProductionApplication.class, args);
    }

}
