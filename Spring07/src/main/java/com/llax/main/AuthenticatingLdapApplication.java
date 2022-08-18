package com.llax.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
/*
@SpringBootApplication is a convenience annotation that adds all of the following:
- @Configuration
- @EnableAutoConfiguration
- @ComponentScan
*/
public class AuthenticatingLdapApplication {

    public static void main(String[] args) {
	SpringApplication.run(AuthenticatingLdapApplication.class, args);
    }

}
