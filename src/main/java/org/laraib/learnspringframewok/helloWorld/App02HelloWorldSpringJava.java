package org.laraib.learnspringframewok.helloWorld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class App02HelloWorldSpringJava {

    @FunctionalInterface
    public interface AgeCalculator {
        int calculateAge(int birthYear);
    }

    public static void main(String[] args) {
        // launch a Spring Context

        try (var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)) {

//            Configure the things that we want Spring to manage - @Configuration
            var name = context.getBean("name");
            System.out.println(name);

            var age1 = context.getBean("ageCalculator");
            System.out.println(age1);

            var calculator = context.getBean(AgeCalculator.class);
            int age = calculator.calculateAge(1997);
            System.out.println(age);

            //person bean
            var person = context.getBean("person");
            System.out.println(person);

            // address bean
            var address = context.getBean(Address.class);
            System.out.println(address);

            // person2MethodCall bean
            var person2MethodCall = context.getBean("person2MethodCall");
            System.out.println(person2MethodCall);


            // person3Parameters bean
            var person3Parameters = context.getBean("person3Parameters");
            System.out.println(person3Parameters);

            // list all the beans
            Arrays.stream(context.getBeanDefinitionNames())
                    .forEach(System.out::println);
        }
    }
}
