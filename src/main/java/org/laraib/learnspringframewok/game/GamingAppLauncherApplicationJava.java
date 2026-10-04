package org.laraib.learnspringframewok.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan("org.laraib.learnspringframewok.game")
public class GamingAppLauncherApplicationJava {

//    @Bean
//    public IGame game() {
//        var game = new MarioGame();
//        return game;
//    }

//    @Bean
//    public GameRunner gameRunner(IGame game) {
//        System.out.println("Parameter game = " + game);
//        var runner = new GameRunner(game);
//        return runner;
//    }

    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(GamingAppLauncherApplicationJava.class)) {
//            context.getBean(IGame.class).up();
            context.getBean(GameRunner.class).run();
        }
    }
}
