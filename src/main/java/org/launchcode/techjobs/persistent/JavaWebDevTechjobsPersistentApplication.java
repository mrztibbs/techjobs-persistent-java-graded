package org.launchcode.techjobs.persistent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan("org.launchcode.techjobs.persistent")
@EntityScan("org.launchcode.techjobs.persistent")
@EnableJpaRepositories
public class JavaWebDevTechjobsPersistentApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(JavaWebDevTechjobsPersistentApplication.class, args);
	}

}
