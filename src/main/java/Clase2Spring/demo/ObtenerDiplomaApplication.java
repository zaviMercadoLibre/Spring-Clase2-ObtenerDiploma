package Clase2Spring.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"Controllers"})
public class ObtenerDiplomaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ObtenerDiplomaApplication.class, args);
	}

}
