package org.laraib.learnspringframewok.helloWorld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.time.Year;

record Person(String name, int age, Address address) {
}

record Address(String firstLane, String city) {
}


@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name() {
        return "Laraib";
    }

    @Bean
    public int age() {
        return 26;
    }

//    @Bean
//    public int ageCalulator (int birthYear) {
//        int currentYear = new Date().getYear() + 1900;
////        return Date. - birthYear;
//        return currentYear - birthYear;
//    }

    @Bean
    public App02HelloWorldSpringJava.AgeCalculator ageCalculator() {
        return birthYear -> Year.now().getValue() - birthYear;
    }

    @Bean
    public Person person() {
        var person = new Person("Laraib", 26, new Address("123 Main St", "New York"));
        return person;
    }

    @Bean(name = "laraibAddress")
    @Qualifier("laraibAddressQualifier")
    public Address address() {
        var address = new Address("123 Main St", "New York");
        return address;
    }

    @Bean
    public Person person2MethodCall() {
        var person = new Person(name(), age(), new Address("123 Main St", "New York"));
        return person;
    }

    @Bean
    public Person person3Parameters(String name, int age, Address address) {
        var person = new Person(name, age, address);
        return person;
    }

    @Bean
    @Primary
    public Person person4Parameters(String name, int age, Address laraibAddress) {
        var person = new Person(name, age, laraibAddress);
        return person;
    }


}
