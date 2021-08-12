package com.amanda.prideDevBank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan({"com.amanda.prideDevBank.entity"})
@EnableJpaRepositories({"com.amanda.prideDevBank.repository"})

@SpringBootApplication
public class PrideDevBankApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrideDevBankApplication.class, args);
	}
}
