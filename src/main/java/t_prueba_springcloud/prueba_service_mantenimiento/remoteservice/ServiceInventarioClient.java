package t_prueba_springcloud.prueba_service_mantenimiento.remoteservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;


@FeignClient(name = "prueba-service-logistica")

public interface ServiceInventarioClient {

    @GetMapping("/inventario")
    String consultarInventario();
    }
