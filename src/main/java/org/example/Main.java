package org.example;

import org.example.Config.config;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext();
        annotationConfigApplicationContext.register(config.class);
        annotationConfigApplicationContext.refresh();




        annotationConfigApplicationContext.registerShutdownHook();
    }
}