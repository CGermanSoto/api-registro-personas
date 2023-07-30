package com.api.pruebaBasedeDatos.service;

import com.api.pruebaBasedeDatos.model.Mascota;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface IMascotaService {

    public String crearMascota(Mascota nuevaMascota);

    public List<Mascota> traerMascotas();

    public Mascota traerMascota(Long id);
}
