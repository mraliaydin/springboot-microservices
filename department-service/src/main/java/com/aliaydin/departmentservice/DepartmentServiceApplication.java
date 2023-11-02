package com.aliaydin.departmentservice;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@OpenAPIDefinition(
		info = @Info(
				title = "Department Service REST APIs",
				description = "Department Service Documentation",
				version = "v1.0",
				contact = @Contact(
						name = "Ali",
						email = "co.aliaydin@gmail.com",
						url = "https://www.linkedin.com/in/aaliaydin/"
				),
				license = @License(
						name = "Apache",
						url = "https://www.linkedin.com/in/aaliaydin/"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "Department Service Doc",
				url = "https://www.linkedin.com/in/aaliaydin/"
		)
)
@SpringBootApplication
public class DepartmentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DepartmentServiceApplication.class, args);
	}

}
