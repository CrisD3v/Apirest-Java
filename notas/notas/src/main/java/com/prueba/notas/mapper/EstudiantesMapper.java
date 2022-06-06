package com.prueba.notas.mapper;

import com.prueba.notas.domain.EstudiantesDto;
import com.prueba.notas.model.Estudiantes;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component

public class EstudiantesMapper {

    public Estudiantes fromDtoToEntity (EstudiantesDto dto){

        Estudiantes entity = new Estudiantes();
        entity.setId(dto.getId());
        entity.setName(dto.getName());
        entity.setLastName(dto.getLastName());
        entity.setAge(dto.getAge());

        return entity;
    }

    public EstudiantesDto fromEntityToDto (Estudiantes entity){

        EstudiantesDto dto = new EstudiantesDto();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setLastName(entity.getLastName());
        dto.setAge(entity.getAge());


        return dto;
    }

    public List<Estudiantes> listadoEstudiantes(List<EstudiantesDto>listaDto){

        List<Estudiantes>listaEntity = new ArrayList<>();
        listaDto.forEach(x -> listaEntity.add(fromDtoToEntity(x)));

        return  listaEntity;

    }

    public  List<EstudiantesDto> listaDto(List<Estudiantes> listadoEstudiantes){

        List<EstudiantesDto>listaDto = new ArrayList<>();
        listadoEstudiantes.forEach(x -> listaDto.add(fromEntityToDto(x)));

        return  listaDto;
    }
}
