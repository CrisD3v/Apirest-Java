package com.prueba.notas.business;

import com.prueba.notas.domain.AsignaturaDto;
import com.prueba.notas.mapper.AsignaturaMapper;
import com.prueba.notas.model.Asignatura;
import com.prueba.notas.repository.AsignaturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class AsignaturaBussinesImpl implements AsignaturaBussines {

    @Autowired
    AsignaturaMapper mapper;

    @Autowired
    AsignaturaRepository repository;


    @Override
    public List<AsignaturaDto> obtenerAsignaturas() {

        List<AsignaturaDto> listaDto = mapper.listadoAsignaturaDto(repository.findAll());
        return listaDto;

    }

    @Override
    public Boolean crearAsignatura(AsignaturaDto dto) {

        Asignatura asignatura = mapper.fromDtoToEntity(dto);
        repository.save(asignatura);

        return true;
    }

    @Override
    public Boolean actualizarAsignatura(AsignaturaDto dto) {

        Asignatura asignatura = mapper.fromDtoToEntity(dto);
        repository.save(asignatura);

        return true;

    }

    @Override
    public Boolean eliminarAsignatura(AsignaturaDto dto) {

        Asignatura asignatura = mapper.fromDtoToEntity(dto);
        repository.delete(asignatura);

        return true;

    }
}
