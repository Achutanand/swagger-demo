package com.swagger.swaggerdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

@SpringBootApplication
@EnableSwagger2
public class SwaggerDemoApplication {


	@Bean
	public Docket getDocketInfo(){

		return new Docket(DocumentationType.SWAGGER_2)
				   .select()
				    .paths(PathSelectors.ant("/api/*"))
				    .apis(RequestHandlerSelectors.basePackage("com.swagger.swaggerdemo"))
				    .build()
				     .apiInfo(getApiInfo());

	}

	private ApiInfo getApiInfo(){
		return  new ApiInfo(
				"Swagger Project",
				"Related Information About Swagger",
				"V0.0.1",
				"Free to Use",
				 new Contact("Achu", "httt://gmail.com", "ab.com"),
				"test",
				"License URL",
				Collections.emptyList()
		);
	}

	public static void main(String[] args) {
		SpringApplication.run(SwaggerDemoApplication.class, args);
	}

}
