package nett.formacion.aaa.module4.calculadora;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({"classpath:calculadora-context.xml"})
//@ImportResource({"classpath:spring/camel-context.xml"})
public class CalculadoraWebServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalculadoraWebServiceApplication.class, args);
	}
}
