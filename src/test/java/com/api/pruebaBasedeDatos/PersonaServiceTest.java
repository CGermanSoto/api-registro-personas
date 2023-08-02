package com.api.pruebaBasedeDatos;

import com.api.pruebaBasedeDatos.model.Persona;
import com.api.pruebaBasedeDatos.repository.IPersonaRepository;
import com.api.pruebaBasedeDatos.service.IPersonaService;
import com.api.pruebaBasedeDatos.service.impl.PersonaServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
@SpringBootTest
public class PersonaServiceTest {
    @Autowired
    private IPersonaService personaService;
    @Autowired
    private IPersonaRepository persona;

    @Test
    public void traerListaPersonasTest(){

        Persona personaUno = new Persona() ;
        personaUno.setId(2L);
        personaUno.setNombre("Germán");
        personaUno.setApellido("Soto");
        personaUno.setEdad(31);
        persona.save(personaUno);

        System.out.println("Antes de guardar");

        int cantidadDePersonas = personaService.traerPersonas().size();
        List<Persona> listaPersonas = personaService.traerPersonas();
        for(Persona personaDeLaLista : listaPersonas){
            System.out.println(" ********** ");
            System.out.println("Id: " + personaDeLaLista.getId());
            System.out.println("Nombre: " + personaDeLaLista.getNombre());
            System.out.println("Apellido: " + personaDeLaLista.getApellido());
            System.out.println("Edad: " + personaDeLaLista.getEdad());
        }

        assertEquals(cantidadDePersonas, listaPersonas.size());

    }
}
