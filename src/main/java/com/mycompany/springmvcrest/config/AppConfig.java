package com.mycompany.springmvcrest.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RestController;

@Configuration
@ComponentScan(
        basePackageClasses = {Constants.class},
        useDefaultFilters = false,
        excludeFilters = {
            @Filter(
                    type = FilterType.ANNOTATION,
                    value = {
                        Configuration.class,
                        RestController.class,
                        ControllerAdvice.class
                    }
            )
        }
)
@PropertySource("classpath:/app.properties")
@PropertySource(value = "classpath:/database.properties", ignoreResourceNotFound = true)
public class AppConfig {

}
