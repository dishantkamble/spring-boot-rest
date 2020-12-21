package com.dishant.springbootrest.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class SpringDocConfiguration {

    @Bean
    public OpenAPI springDocOpenAPI() {
        return new OpenAPI().info(this.apiInfo());
    }

    private Info apiInfo() {
        return new Info()
                .title("Employee APIs")
                .description("Test Employee APIs")
                .version("1.0");
    }
}
