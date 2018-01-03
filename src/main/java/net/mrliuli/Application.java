package net.mrliuli;

import net.mrliuli.web.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by li.liu on 2017/12/29.
 */


/**
 * @EnableAutoConfiguration 这个注解告诉Spring Boot根据添加的jar依赖猜测你想如何配置Spring。
 * 由于 spring-boot-starter-web 添加了Tomcat和Spring MVC，所以auto-configuration将假定你正在开发一个web应用并相应地对Spring进行设置。
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan
// @SpringBootApplication // same as @Configuration @EnableAutoConfiguration @ComponentScan
public class Application  {



    public static void main(String[] args) throws Exception{
        SpringApplication.run(Application.class, args);
    }


}
