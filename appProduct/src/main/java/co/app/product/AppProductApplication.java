package co.app.product;
/**
 * This class starts the project that contains the entities, 
 * the controllers, the micro service, everything related to the product and category
 * @author yadira muñoz herrera
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class AppProductApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(AppProductApplication.class, args);
	}
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(getClass());
	}

}
