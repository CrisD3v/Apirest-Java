package com.prueba.notas.mapper;

import com.prueba.notas.domain.AsignaturaDto;
import com.prueba.notas.model.Asignatura;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component

public class AsignaturaMapper {

    public Asignatura fromDtoToEntity (AsignaturaDto dto) {

        Asignatura entity = new Asignatura();
        entity.setId(dto.getId());
        entity.setName(dto.getName());

        return entity;

    }

    public AsignaturaDto fromEntityToDto(Asignatura entity) {

        AsignaturaDto dto = new AsignaturaDto();
        dto.setId(entity.getId());
        dto.setName(entity.getName());

        return  dto;

    }

    public List <Asignatura> listadoAsignatura(List<AsignaturaDto> listaDto){

        List<Asignatura> listaEntity = new ArrayList<>();
        listaDto.forEach(x -> listaEntity.add(fromDtoToEntity(x)));

        return  listaEntity;
    }

    public List <AsignaturaDto> listadoAsignaturaDto(List<Asignatura> listaAsignatura){

        List<AsignaturaDto> listaDto = new ArrayList<>();
        listaAsignatura.forEach(x -> listaDto.add((fromEntityToDto(x))));

        return  listaDto;

    }

}
