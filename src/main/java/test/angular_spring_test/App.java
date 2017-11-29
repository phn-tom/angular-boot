package test.angular_spring_test;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
/**
 * Hello world!
 *
 */
@SpringBootApplication
@MapperScan("test.angular_spring_test.mapper")
@ComponentScan
public class App{

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
