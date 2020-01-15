package com.raq.springboot.config;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	public static final Contact DEFAULT_CONTACT = new Contact("Abdul Raquib", "http://www.abdulraquib.org/",
			"abdulraquib1@gmail.com");
	public static final ApiInfo DEFAULT_API_INFO = new ApiInfo("Employee Microservice Api",
			"Employee CRUD operarations documentation", "1.0", "urn:tos", DEFAULT_CONTACT, "Employee 2.0 API",
			"http://www.abdulraquib.org/licenses/LICENSE-1.0");
	private static final Set<String> DEFAULT_PRODUCES_CONSUMES = new HashSet<String>(
			Arrays.asList("application/json", "application/xml"));

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2).apiInfo(DEFAULT_API_INFO).produces(DEFAULT_PRODUCES_CONSUMES);
	}

}
