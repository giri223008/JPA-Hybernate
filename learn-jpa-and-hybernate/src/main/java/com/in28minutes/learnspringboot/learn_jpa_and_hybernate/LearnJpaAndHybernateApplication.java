package com.in28minutes.learnspringboot.learn_jpa_and_hybernate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class LearnJpaAndHybernateApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnJpaAndHybernateApplication.class, args);
	}

}
