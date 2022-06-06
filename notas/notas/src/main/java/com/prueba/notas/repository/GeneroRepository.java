package com.prueba.notas.repository;

import com.prueba.notas.model.Genero;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GeneroRepository  extends JpaRepository<Genero, Long> {
}
