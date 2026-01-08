package com.flex_reserve.library.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan("com.flex_reserve.library.slot.model")
@EnableJpaRepositories(basePackages = "com.flex_reserve.library.slot.persistence")
@SpringBootApplication(scanBasePackages = {
        "com.flex_reserve.library", "com.example.flex_reserve"
})
public class FlexReserveApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlexReserveApplication.class, args);
	}

}
