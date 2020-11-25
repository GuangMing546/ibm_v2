package com.wyu.ibm_v2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket Api(){
//        Docket build = new Docket(DocumentationType.SWAGGER_2)
//                .apiInfo(new ApiInfo())
//                .select()
//                .apis(RequestHandlerSelectors.basePackage("com.wyu.ibm_v2.Swagger2.controller"))
//                .paths(PathSelectors.any())
//                .build();
       // return new Docket(DocumentationType.SWAGGER_2)
        //Docket build = new Docket(DocumentationType.SWAGGER_2)
        return new Docket(DocumentationType.SWAGGER_2)
                //.apiInfo(new ApiInfo())
                .apiInfo(apiInfo())
                .select()
                //.apis(RequestHandlerSelectors.any())
                //.apis(RequestHandlerSelectors.withClassAnnotation(Api.class))
                //.apis(RequestHandlerSelectors.basePackage("com.wyu.ibm_v2.controller"))
//                .apis(RequestHandlerSelectors.basePackage("com.wyu.ibm_v2.ShowClassIdController"))
//                .apis(RequestHandlerSelectors.basePackage("com.wyu.ibm_v2.StudentController"))
//                .apis(RequestHandlerSelectors.basePackage("com.wyu.ibm_v2.TeacherController"))
                .paths(PathSelectors.any())
                .build()
                ;
    }

    private ApiInfo apiInfo() {
        Contact contact = new Contact("2333",null,null);
        return new ApiInfoBuilder()
                .title(" 学生成绩管理系统")
//                .termsOfServiceUrl("http://despairyoke.github.io/")
//                .contact("ibm_v2")
//                .version("1.0")
                .description("HTTP对外开放接口 API 描述")
                .version("1.0.0")
                //.termsOfServiceUrl("http://192.168.2.43:8081/test/")
                //.license("LICENSE")
               // .licenseUrl("http://192.168.2.43:8081/test/")
                .build();
    }


   // public ApiInfo apiInfo(){}
// 访问网址 http://localhost:8081/swagger-ui.html#/

}
