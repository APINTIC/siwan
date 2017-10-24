package org.siwan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;


@SpringBootApplication
public class SwanWebApplication extends SpringBootServletInitializer{

			@Override
		    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		        return application.sources(SwanWebApplication.class);
		    }

			public static void main(String[] args) {
				SpringApplication.run(SwanWebApplication.class, args);
			}
			
//			@Bean
//			public CommandLineRunner demo(MemberRepository repository) {
//				return (args) -> {
//					// save a couple of customers
//					repository.save(new Member("Jack", "Bauer"));
//					repository.save(new Member("Chloe", "O'Brian"));
//					repository.save(new Member("Kim", "Bauer"));
//					repository.save(new Member("David", "Palmer"));
//					repository.save(new Member("Michelle", "Dessler"));
//
//					// fetch all customers
//					logger.info("Customers found with findAll():");
//					logger.info("-------------------------------");
//					for (Member customer : repository.findAll()) {
//						logger.info(customer.toString());
//					}
//					logger.info("");
//
//					// fetch an individual customer by ID
//					Member customer = repository.findOne(1L);
//					logger.info("Customer found with findOne(1L):");
//					logger.info("--------------------------------");
//					logger.info(customer.toString());
//					logger.info("");
//
//					// fetch customers by last name
//					logger.info("Customer found with findByLastName('Bauer'):");
//					logger.info("--------------------------------------------");
//					for (Member bauer : repository.findByLastName("Bauer")) {
//						logger.info(bauer.toString());
//					}
//					logger.info("");
//				};
//			}
}
