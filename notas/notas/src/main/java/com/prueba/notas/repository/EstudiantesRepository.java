package com.prueba.notas.repository;

import com.prueba.notas.model.Estudiantes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudiantesRepository extends JpaRepository <Estudiantes,Long> {
}
