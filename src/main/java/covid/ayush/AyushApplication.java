package covid.ayush;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class AyushApplication {

	public static void main(String[] args) {
		SpringApplication.run(AyushApplication.class, args);
	}

}
