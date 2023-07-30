package com.api.pruebaBasedeDatos.repository;

import com.api.pruebaBasedeDatos.model.Mascota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMascotaRepository extends JpaRepository<Mascota, Long> {
}
