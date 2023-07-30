package com.api.pruebaBasedeDatos.repository;

import com.api.pruebaBasedeDatos.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface IPersonaRepository extends JpaRepository<Persona, Long> {
}
