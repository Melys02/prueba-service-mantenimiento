package t_prueba_springcloud.prueba_service_mantenimiento;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients

public class PruebaServiceMantenimientoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PruebaServiceMantenimientoApplication.class, args);
	}

}
