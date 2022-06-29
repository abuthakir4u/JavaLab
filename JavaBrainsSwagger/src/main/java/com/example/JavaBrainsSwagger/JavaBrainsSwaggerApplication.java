package com.example.JavaBrainsSwagger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.RequestHandler;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

@SpringBootApplication
@EnableSwagger2
public class JavaBrainsSwaggerApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaBrainsSwaggerApplication.class, args);
	}

	@Bean
	public Docket swaggerConfiguration() {
		//ApiSelectorBuilder
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.paths(PathSelectors.ant("/api/*"))
				.apis(RequestHandlerSelectors.basePackage("com.example.JavaBrainsSwagger"))
				.build()
				.apiInfo(apiDetails());
	}

	private ApiInfo apiDetails() {
		return new ApiInfo(
			"Address Book API",
			"Sample API for course",
			"1.0",
			"Free to use",
			new springfox.documentation.service.Contact("Abu", "http://abu.com", "abu@gmail.com"),
			"API license",
			"http://test.com",
			Collections.emptyList()
		);
	}
}
