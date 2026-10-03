package org.laraib.learnspringframewok;

import org.laraib.learnspringframewok.game.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App03GamingSpringBeansJava {


    public static void main(String[] args) {

        try (var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)) {

//            context.getBean(IGame.class).up();

            context.getBean(GameRunner.class).run();


        }


    }
}
