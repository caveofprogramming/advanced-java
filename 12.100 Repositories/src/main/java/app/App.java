package app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication(scanBasePackages = {"configuration", "main"})
@EntityScan(basePackages = {"entities"})
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

}
