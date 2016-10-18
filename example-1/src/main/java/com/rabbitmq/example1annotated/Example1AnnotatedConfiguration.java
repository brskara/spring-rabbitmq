package com.rabbitmq.example1annotated;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;


@SpringBootApplication
public class Example1AnnotatedConfiguration {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(Example1AnnotatedConfiguration.class, args);
    }
}
