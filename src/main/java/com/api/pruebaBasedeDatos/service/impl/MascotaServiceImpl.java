package com.api.pruebaBasedeDatos.service.impl;

import com.api.pruebaBasedeDatos.model.Mascota;
import com.api.pruebaBasedeDatos.repository.IMascotaRepository;
import com.api.pruebaBasedeDatos.service.IMascotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MascotaServiceImpl implements IMascotaService {
    @Autowired
    private IMascotaRepository mascota;
    @Override
    public String crearMascota(Mascota nuevaMascota) {
        mascota.save(nuevaMascota);
        return "Se ha creado una nueva mascota de forma exitosa";
    }

    @Override
    public List<Mascota> traerMascotas() {
        return mascota.findAll();
    }

    @Override
    public Mascota traerMascota(Long id) {
        return mascota.findById(id).orElse(null);
    }
}
