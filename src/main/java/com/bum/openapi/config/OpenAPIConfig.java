package com.bum.openapi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class OpenAPIConfig {

  @Bean
  public OpenAPI myOpenAPI() {
    Contact contact = new Contact();
    contact.setEmail("test@gmail.com");
    contact.setName("Test");
    contact.setUrl("https://www.test.com");

    License mitLicense = new License().name("MIT License").url("https://choosealicense.com/licenses/mit/");

    Info info = new Info()
        .title("Customer Management API")
        .version("1.0")
        .contact(contact)
        .description("This API exposes endpoints to manage customer.").termsOfService("https://www.test.com/terms")
        .license(mitLicense);
    return new OpenAPI().info(info);
  }
}
