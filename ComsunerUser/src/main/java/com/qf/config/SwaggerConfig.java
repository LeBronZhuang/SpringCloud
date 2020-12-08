package com.qf.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Value("${swagger.basepackage}")
    private String basePackage;

    @Value("${swagger.title}")
    private String title;

    @Value("${swagger.desc}")
    private String desc;

    @Value("${swagger.version}")
    private String version;

    @Value("${swagger.contact}")
    private String contact;

    @Value("${swagger.url}")
    private String url;

    @Bean
    public Docket getSwagger(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(getInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.qf.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    /**
     * 自定义方法，用来设置项目的基本信息
     * @return
     */
    public ApiInfo getInfo() {
        return new ApiInfoBuilder()
                .title(title)
                .description(desc)
                .version(version)
                .contact(contact)
                .licenseUrl(url)
                .build();
    }
}
