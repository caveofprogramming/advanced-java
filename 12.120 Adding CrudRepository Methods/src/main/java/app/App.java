package app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"configuration", "main"})
@EntityScan(basePackages = {"entities"})
@EnableJpaRepositories(basePackages = {"repositories"})
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

}
