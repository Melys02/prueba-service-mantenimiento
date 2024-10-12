package t_prueba_springcloud.prueba_service_mantenimiento.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import t_prueba_springcloud.prueba_service_mantenimiento.remoteservice.ServiceInventarioClient;

@RequiredArgsConstructor
@RestController

public class MantenimientoController {

    @GetMapping("/orden")
    public String consultarOrden() {
        return "Respuesta del Servicio Mantenimiento- Orden";

}
