package com.prueba.notas.business;

import com.prueba.notas.domain.EstudiantesDto;

import java.util.List;

public interface EstudiantesBussines {

    public List<EstudiantesDto> obtenerEstudiantes();

    public  Boolean agregarEstudiantes(EstudiantesDto dto);

    public Boolean actualizarEstudiantes(EstudiantesDto dto);

    public Boolean eliminarEstudiantes(EstudiantesDto dto);

}
