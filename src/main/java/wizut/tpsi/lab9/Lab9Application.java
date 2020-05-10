package wizut.tpsi.lab9;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"wizut.tpsi"})
public class Lab9Application {

	public static void main(String[] args) {
		SpringApplication.run(Lab9Application.class, args);
	}

}
