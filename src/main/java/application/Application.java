package application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@ComponentScan(basePackages = {"config", "rest"})
// this sentence is necessary, or else th rest controller cannot be found
// Although spring boot has @ComponentScan annotation, it will only scan the package containing this class.
// As a result, the package "config" and "rest" will be ignored
// This ComponentScan will cover the ComponentScan in SpringBootApplication


@SpringBootApplication
@PropertySource("classpath:/property/application-${spring.profiles.active}.properties")
public class Application {
    public static void main(String ...args){
        SpringApplication.run(Application.class, args);
    }
}
