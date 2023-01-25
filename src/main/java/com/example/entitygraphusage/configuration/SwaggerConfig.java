package com.example.entitygraphusage.configuration;

import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

//    @Bean
//    public Docket swaggerSettings() {
//        return new Docket(DocumentationType.SWAGGER_2)
//                .produces(ImmutableSet.of(MediaType.APPLICATION_JSON_VALUE))
//                .select()
//                .apis(RequestHandlerSelectors.any())
//                .paths(PathSelectors.any())
//                .build();
//    }
}