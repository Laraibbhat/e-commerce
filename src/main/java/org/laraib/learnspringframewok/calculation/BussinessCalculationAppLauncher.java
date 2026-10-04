package org.laraib.learnspringframewok.calculation;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class BussinessCalculationAppLauncher {


    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(BussinessCalculationAppLauncher.class)) {
             context.getBean(BussinessCalculatorService.class).findMax();

        }
    }


}
