package fr.infrastructure;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan("fr.cailliaud")
@EnableAutoConfiguration
@EnableJpaRepositories(basePackages = "fr.cailliaud")
@EntityScan(basePackages = "fr.cailliaud.infrastuctrure")
public class InfrastructureConfiguration {}
