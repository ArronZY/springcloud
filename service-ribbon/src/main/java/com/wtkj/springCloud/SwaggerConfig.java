package com.wtkj.springCloud;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created by wtkj_jxb_07 on 2019/12/24.
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("测试Swagger")
                .apiInfo(buildApiInf())
                .pathMapping("/")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.wtkj.springCloud.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo buildApiInf() {
        return new ApiInfoBuilder()
                .title("SpringClould整合Swagger - Restful API")
                .termsOfServiceUrl("https://xxxxxx/openapi/")
                .description("皖通科技")
                .version("1.0").build();
    }
}
