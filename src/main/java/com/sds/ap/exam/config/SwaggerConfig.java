package com.sds.ap.exam.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import lombok.RequiredArgsConstructor;
import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@OpenAPIDefinition(
        info = @Info(
                title = "테스트 서버 명세서",
                description = "테스트 서버 기반 API 명세서",
                version = "v1"))
@RequiredArgsConstructor
@Configuration
public class SwaggerConfig {

    @Bean
    public GroupedOpenApi testApi(){
        String[] paths = {"/v1/**"};

        return GroupedOpenApi.builder()
                .group("테스트 API V1")
                .pathsToMatch(paths)
                .build();
    }
}
