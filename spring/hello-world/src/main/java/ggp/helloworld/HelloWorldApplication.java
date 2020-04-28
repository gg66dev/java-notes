package ggp.helloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import ggp.helloworld.knights.Knight;

@SpringBootApplication
@ComponentScan ({"ggp.helloworld.config"})
public class HelloWorldApplication implements CommandLineRunner  {

	@Autowired
	private ApplicationContext context;
	
	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Knight knight = (Knight)context.getBean(Knight.class);
        knight.embarkOnQuest();
	}

}
