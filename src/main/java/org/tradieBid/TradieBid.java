package org.tradieBid;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
@EnableWebMvc
public class TradieBid {
    public static void main(String[] args) {

        SpringApplication.run(TradieBid.class, args);
    }

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/*/**")
                        .allowedMethods("*")
                        .allowedHeaders("*")
                        .allowedHeaders("*").allowedOrigins("*")
                        .exposedHeaders("*");
            }
        };
    }
}