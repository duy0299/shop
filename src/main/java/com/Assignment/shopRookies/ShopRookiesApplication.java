package com.Assignment.shopRookies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(scanBasePackages = "com/Assignment/shopRookies", exclude = {DataSourceAutoConfiguration.class })
public class ShopRookiesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShopRookiesApplication.class, args);
	}

}
