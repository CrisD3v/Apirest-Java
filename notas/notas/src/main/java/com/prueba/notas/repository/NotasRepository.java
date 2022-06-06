package com.prueba.notas.repository;

import com.prueba.notas.model.Notas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotasRepository extends JpaRepository <Notas, Long> {
}
