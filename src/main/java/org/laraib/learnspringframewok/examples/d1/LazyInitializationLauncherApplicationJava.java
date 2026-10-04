package org.laraib.learnspringframewok.examples.d1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class  ClassA {

}

@Component
@Lazy
class ClassB{

    private ClassA classA;
    public ClassB(ClassA classA) {
        System.out.println("Constructor Injection - ClassB");
        this.classA = classA;
    }
}

@Configuration
@ComponentScan
public class LazyInitializationLauncherApplicationJava {

    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(LazyInitializationLauncherApplicationJava.class)) {
//            Arrays.stream(context.getBeanDefinitionNames())
//                    .forEach(System.out::println);
            System.out.println(context.getBean(ClassB.class));

        }
    }
}
