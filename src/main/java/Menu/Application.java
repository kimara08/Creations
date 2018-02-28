package Menu;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;

import Recipe.Creations.Level;
import Recipe.Creations.Measurement;



@SpringBootApplication	
@EntityScan(basePackages = "Recipe.Creations")

public class Application {

	private static final Logger log = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Application.class);
	}


	@Bean
	public CommandLineRunner demo(LevelRepository repository) {
		return (args) -> {
			// save a couple of customers


			// fetch all customers
			log.info("Level found with findAll():");
			log.info("-------------------------------");
			for (Level aLevel : repository.findAll()) {
				log.info(aLevel.getLevel_Type());
			}
			log.info("");

		};
	}
	
	@Bean
	public CommandLineRunner demo1(MeasurementRepository repository) {
		return (args) -> {
			// save a couple of customers


			// fetch all customers
			log.info("Measurements found with findAll():");
			log.info("-------------------------------");
			for (Measurement aMeasure : repository.findAll()) {
				log.info(aMeasure.getMeasurement_abb());
			}
			log.info("");

		};
	}
}
				