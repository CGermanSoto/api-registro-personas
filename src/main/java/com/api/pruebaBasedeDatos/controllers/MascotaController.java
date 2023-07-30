package com.api.pruebaBasedeDatos.controllers;

import com.api.pruebaBasedeDatos.model.Mascota;
import com.api.pruebaBasedeDatos.repository.IMascotaRepository;
import com.api.pruebaBasedeDatos.service.IMascotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MascotaController {
    @Autowired
    private IMascotaService mascotaService;

    @PostMapping("/mascota/nueva")
    public String guardarMascotaNueva(@RequestBody Mascota mascota){
        mascotaService.crearMascota(mascota);
        return "Se creó correctamente una nueva mascota";
    }
}
