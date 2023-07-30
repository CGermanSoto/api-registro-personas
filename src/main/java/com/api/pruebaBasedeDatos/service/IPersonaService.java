package com.api.pruebaBasedeDatos.service;

import com.api.pruebaBasedeDatos.model.Persona;

import java.util.List;

public interface IPersonaService {

    public List<Persona> traerPersonas();

    public void guardarPersona(Persona persona);

    public void eliminarPersona(Long id);

    public Persona traerUnaPersona(Long id);

    public void editarPersona(Long id, String nombre, String apellido, int edad);

    void editarPersona(Persona editarPersona);
}
