package co.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//@EnableAutoConfiguration
@SpringBootApplication
//@EnableJpaRepositories(basePackages = {"co.com.daos.*"})
//@ComponentScan(basePackages = {"co.com.*"})
public class Main {
	
	public static void main( String[] args ){
    	SpringApplication.run(Main.class, args);
    }

}
