package jkcodebase.BankApplication;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title = "JK CodeSpace Bank Application",
				description = "Backend Rest APIs for Banking Application using Spring Boot",
				version = "v1.0",
				contact = @Contact(
						name = "Jahangeer Kalwar",
						email = "ahmedkalwar38@gmail.com",
						url = "https://github.com/jahangirkalwar"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "Project Documentation",
				url = "https://github.com/jahangirkalwar"
		)
)
public class BankApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankApplication.class, args);
	}

}
