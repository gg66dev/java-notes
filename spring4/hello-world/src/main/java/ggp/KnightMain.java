package ggp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import ggp.helloworld.knights.*;



@ComponentScan(basePackages = "ggp.helloworld.config")
@Configuration
public class KnightMain {

    public static void main(String[] args) {
        
        //ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(KnightMain.class);
        Knight knight = (Knight)context.getBean(Knight.class);
        knight.embarkOnQuest();
    }

}