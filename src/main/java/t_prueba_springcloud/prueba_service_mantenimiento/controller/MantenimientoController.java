package t_prueba_springcloud.prueba_service_mantenimiento.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import t_prueba_springcloud.prueba_service_mantenimiento.remoteservice.ServiceInventarioClient;

@RequiredArgsConstructor
@RestController

public class MantenimientoController {
    private final ServiceInventarioClient serviceInventarioClient;

    @GetMapping("/orden")
    public String consultarOrden() {
        return "Respuesta del Servicio Mantenimiento- Orden";

    }

    @GetMapping("/equipo")
    public String consultarEquipo() {
        return "Respuesta del Servicio Mantenimiento - Equipo";
    }

    @GetMapping("/equipo-inventario")
    public String consultarMontoOrden() {
        return serviceInventarioClient.consultarInventario();
    }
}
