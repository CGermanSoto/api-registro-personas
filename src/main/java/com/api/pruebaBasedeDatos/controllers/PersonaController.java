package com.api.pruebaBasedeDatos.controllers;

import com.api.pruebaBasedeDatos.model.Persona;
import com.api.pruebaBasedeDatos.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonaController {

    @Autowired
    private IPersonaService personaService;

    @GetMapping("/persona/traerTodas")
    public List<Persona> traerTodasLasPersonas(){
        return personaService.traerPersonas();
    }

    @PostMapping("/persona/guardar")
    public String guardarPersona(@RequestBody Persona nuevaPersona){
        personaService.guardarPersona(nuevaPersona);
        return "Persona creada correctamente.";
    }

    @DeleteMapping("/persona/eliminar/{id}")
    public String eliminarPersona(@PathVariable Long id){
        personaService.eliminarPersona(id);
        return "Persona Eliminada";
    }
    @GetMapping("/persona/traerUna/{id}")
    public Persona traerUnaPersona(@PathVariable Long id){
        Persona unaPersona = personaService.traerUnaPersona(id);
        return unaPersona;
    }
    @PutMapping("/persona/editar/{id}")
    public Persona editarPersona(@PathVariable Long id,
                                @RequestParam(required = false, name = "nombre") String nombre,
                                @RequestParam(required = false, name = "apellido") String apellido,
                                @RequestParam(required = false, name = "edad") int edad){
        personaService.editarPersona(id, nombre, apellido, edad);
        Persona personaEditada = personaService.traerUnaPersona(id);
        return personaEditada;
    }

    @PutMapping("/persona/editar")
    public Persona editarPersona(@RequestBody Persona editarPersona){
        personaService.editarPersona(editarPersona);
        return personaService.traerUnaPersona(editarPersona.getId());
    }





}
