package app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;

@SpringBootApplication
@Controller
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}


}
