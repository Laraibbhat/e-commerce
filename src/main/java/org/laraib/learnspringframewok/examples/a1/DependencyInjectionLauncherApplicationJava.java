package org.laraib.learnspringframewok.examples.a1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class YourBussinessClass {


//    @Autowired // For Field Injection
    Dependency1 dependency1;

//    @Autowired // For Field Injection
    Dependency2 dependency2;

//    @Autowired // For Constructor Injection
    public YourBussinessClass(Dependency1 dependency1, Dependency2 dependency2) {
        super();
        this.dependency1 = dependency1;
        this.dependency2 = dependency2;
    }

//    @Autowired // For Setter Injection
//    public void setDependency1(Dependency1 dependency1) {
//        this.dependency1 = dependency1;
//    }



//    @Autowired // For Setter Injection
//    public void setDependency2(Dependency2 dependency2) {
//        this.dependency2 = dependency2;
//    }


    public String toString() {
        return "Using " + dependency1 + " and " + dependency2;
    }

    public void doSomething() {
        dependency1.getName();
        dependency2.getName();
    }
}

@Component
class Dependency1 {

    public void getName() {
        System.out.println("I am Dependency 1");
    }
}

@Component
class Dependency2 {

public void getName() {
        System.out.println("I am Dependency 2");
    }

}


@Configuration
@ComponentScan
public class DependencyInjectionLauncherApplicationJava {

    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(DependencyInjectionLauncherApplicationJava.class)) {
//            Arrays.stream(context.getBeanDefinitionNames())
//                    .forEach(System.out::println);

            System.out.println(context.getBean(YourBussinessClass.class));
            context.getBean(YourBussinessClass.class).doSomething();
        }
    }
}
