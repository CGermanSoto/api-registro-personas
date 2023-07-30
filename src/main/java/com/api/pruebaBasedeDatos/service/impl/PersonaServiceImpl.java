package com.api.pruebaBasedeDatos.service.impl;

import com.api.pruebaBasedeDatos.model.Persona;
import com.api.pruebaBasedeDatos.repository.IPersonaRepository;
import com.api.pruebaBasedeDatos.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServiceImpl implements IPersonaService {
    @Autowired
    private IPersonaRepository persona;

    @Override
    public List<Persona> traerPersonas() {
        List<Persona> listaPersonas = persona.findAll();
        return listaPersonas;
    }

    @Override
    public void guardarPersona(Persona pers) {
        persona.save(pers);
    }

    @Override
    public void eliminarPersona(Long id) {
        persona.deleteById(id);
    }

    @Override
    public Persona traerUnaPersona(Long id) {
        Persona traerPersona = persona.findById(id).orElse(null);
        return traerPersona;
    }

    @Override
    public void editarPersona(Long id, String nombre, String apellido, int edad) {
        Persona editarPersonaExistente = this.traerUnaPersona(id);
        if(editarPersonaExistente != null)
            editarPersonaExistente.setNombre(nombre);
            editarPersonaExistente.setApellido(apellido);
            editarPersonaExistente.setEdad(edad);
            this.guardarPersona(editarPersonaExistente);
    }

    @Override
    public void editarPersona(Persona editarPersona) {
        this.guardarPersona(editarPersona);
    }


}
