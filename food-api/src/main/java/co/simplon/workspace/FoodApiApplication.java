package co.simplon.workspace;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
@SpringBootApplication
public class FoodApiApplication {

    public static void main(String[] args) {
	SpringApplication.run(FoodApiApplication.class, args);
    }

}
