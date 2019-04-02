package com.springbt.app.springbtsecurity.config;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;



/**
 * @author Ramesh Sv
 * SwaggerConfig class provides swagger configuration
 *
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig { 
	
    @Bean
    public Docket api() { 
        return new Docket(DocumentationType.SWAGGER_2)  
          .select()                                  
          .apis(RequestHandlerSelectors.any())              
          .paths(PathSelectors.any())                          
          .build()
          .apiInfo(apiInfo());                                           
    }
    
    private ApiInfo apiInfo() {
        return new ApiInfo(
          "Spring Security API", 
          "Spring Security for Authentication and Authorizatin.", 
          "API TOS", 
          "Terms of service", 
          new Contact("Ramesh", "www.ramesh.com", "ramesh@gmail.com"), 
          "License of API", "API license URL", Collections.emptyList());
   }
}