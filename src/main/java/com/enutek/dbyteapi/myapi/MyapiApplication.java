package com.enutek.dbyteapi.myapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.persistence.Entity;

/**
 * @springbootapplication is equlivalent to
 * @Configuration @EnableAutoConfiguration and
 * @ComponentScan togetehr
 *
 * */

@ServletComponentScan
@EnableJpaRepositories("com.enutek.dbyteapi.myapi.repo")
@EntityScan("com.enutek.dbyteapi.myapi")
@SpringBootApplication(scanBasePackages = "com.enutek.dbyteapi.myapi")
public class MyapiApplication {

	public static void main(String[] args) {

	    SpringApplication.run(MyapiApplication.class, args);
	}

}
