package com.my.blog.website;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import springfox.documentation.oas.annotations.EnableOpenApi;

/**
 * @author
 */
@EnableDiscoveryClient
@EnableOpenApi
@MapperScan("com.my.blog.website.dao")
@SpringBootApplication
@EnableTransactionManagement
public class CoreApplication extends SpringBootServletInitializer
{


    public static void main(String[] args) {
        System.setProperty("spring.devtools.restart.enabled", "false");
        SpringApplication.run(CoreApplication.class, args);
    }
}
