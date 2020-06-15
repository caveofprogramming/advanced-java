package app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"greeters", "main"})
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

}
