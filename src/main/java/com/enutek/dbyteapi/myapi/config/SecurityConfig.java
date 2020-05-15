package com.enutek.dbyteapi.myapi.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http.authorizeRequests()
                .anyRequest()
                .permitAll()
                .and().csrf().disable();
    }
}

/**
 * once the spring starter security dependency on the classpth of the applation
 * all endpoints are secured by default, using either httpBAsic or formLogin
 * based on spring security's content-negotiation strateby
 *
 * if i have the starter on the classpath i define my own custom
 * security congiguration by extending the websecuritycongigureradaper class
 * this had to be added to class path which was completed by intellij at
 * as it suggested.
 *
**/
