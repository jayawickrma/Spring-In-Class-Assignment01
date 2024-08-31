package org.example.Config;

import org.example.beans.ChickenRoll;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"org.example"})
public class config {
    @Bean
    ChickenRoll chickenRoll(){
        return chickenRoll();
    }
}
