package app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by Filip Burlaga on 2016-12-24.
 */
@SpringBootApplication(scanBasePackages = {"customer"})
public class Application {

    public static void main(String[] arg){
        SpringApplication.run(Application.class);
    }

}
