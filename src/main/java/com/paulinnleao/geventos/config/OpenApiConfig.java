package com.paulinnleao.geventos.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI(){
        return new OpenAPI()
                .info(new Info()
                        .title("API Gerenciamento de Eventos")
                        .version("V1")
                        .description("Descrição swagger dos endpoints da API")
                        .termsOfService("https://www.geventos.com.br")
                        .license(
                                new License()
                                        .name("Apache 2.0")
                                        .url("https://www.geventos.com.br")
                        ));
    }
}
