package com.llax.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
// ComponentScan говорит Spring'у рекурсивно искать в пакете hello и его потомках классы, 
// помеченные прямо или косвенно Spring аннотацией @Component. Эта директива гарантирует, 
// что Spring найдет и зарегистрирует GreetingController, потому что он отмечен @RestController, 
// который, в свою очередь, является своего рода @Component аннотацией.

@EnableAutoConfiguration
// Аннотация @EnableAutoConfiguration переключает на приемлемое по умолчанию поведение, 
// основанное на содержании вашего classpath

public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
