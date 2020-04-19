package ggp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import ggp.knights.*;

public class KnightMain {

    public static void main(String[] args) {
        
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
        Knight knight = (Knight)context.getBean(Knight.class);
        knight.embarkOnQuest();
        context.close();
    }

}