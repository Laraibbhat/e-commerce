package org.laraib.learnspringframewok.examples.d1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

class NormalClass {
    public NormalClass() {
        System.out.println("Normal Class");
    }
}

@Scope
class PrototypeClass {
    public PrototypeClass() {
        System.out.println("Prototype Class");
    }
}

@Configuration
@ComponentScan
public class BeanScopesLauncherApplicationJava {

    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(BeanScopesLauncherApplicationJava.class)) {
//            Arrays.stream(context.getBeanDefinitionNames())
//                    .forEach(System.out::println);

        }
    }
}
