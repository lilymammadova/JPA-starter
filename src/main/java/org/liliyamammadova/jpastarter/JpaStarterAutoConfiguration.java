package org.liliyamammadova.jpastarter;

import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@AutoConfiguration
@EnableJpaRepositories(basePackages = "org.liliyamammadova")
public class JpaStarterAutoConfiguration {

}