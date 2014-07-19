package com.khalart.springmvcapp.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * Created by artur on 19.07.14.
 */
@Configuration
@ComponentScan("com.khalart.springmvcapp")
@PropertySource(value = {
        "classpath:app.properties"
})
public class AppConfig {
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }
}
