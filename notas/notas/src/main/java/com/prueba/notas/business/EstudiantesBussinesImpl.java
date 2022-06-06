package com.prueba.notas.business;

import com.prueba.notas.domain.EstudiantesDto;
import com.prueba.notas.mapper.EstudiantesMapper;
import com.prueba.notas.model.Estudiantes;
import com.prueba.notas.repository.EstudiantesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class EstudiantesBussinesImpl implements EstudiantesBussines {
    @Autowired
    EstudiantesMapper mapper;

    @Autowired
    EstudiantesRepository repository;


    @Override
    public List<EstudiantesDto> obtenerEstudiantes() {

        List<EstudiantesDto> listaDto = mapper.listaDto(repository.findAll());
        return listaDto;

    }

    @Override
    public Boolean agregarEstudiantes(EstudiantesDto dto) {

        Estudiantes estudiantes = mapper.fromDtoToEntity(dto);
        repository.save(estudiantes);

        return true;
    }

    @Override
    public Boolean actualizarEstudiantes(EstudiantesDto dto) {

        Estudiantes estudiantes = mapper.fromDtoToEntity(dto);
        repository.save(estudiantes);

        return true;

    }

    @Override
    public Boolean eliminarEstudiantes(EstudiantesDto dto) {

        Estudiantes estudiantes = mapper.fromDtoToEntity(dto);
        repository.delete(estudiantes);

        return true;

    }
}
