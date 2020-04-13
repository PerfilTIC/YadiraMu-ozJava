package co.app.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * This class starts the project that contains the entities, 
 * the controllers, the micro service, everything related to the user and role
 * @author yadira muñoz herrera
 */

@SpringBootApplication
public class AppUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppUserApplication.class, args);
	}

}
