package com.prueba.notas.mapper;

import com.prueba.notas.domain.GeneroDto;
import com.prueba.notas.model.Genero;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component

public class GeneroMapper {

    public Genero FromDtoToEntity (GeneroDto dto){
        Genero entity = new Genero();
        entity.setId(dto.getId());
        entity.setGenero(dto.getGenero());

        return entity;

    }

    public GeneroDto FromEntityToDto (Genero entity){

        GeneroDto dto = new GeneroDto();
        dto.setId(entity.getId());
        dto.setGenero(entity.getGenero());

        return  dto;

    }

    public List<Genero> listadoGenero (List <GeneroDto> listaDto){

        List<Genero> listaEntity = new ArrayList<>();
        listaDto.forEach(x -> listaEntity.add(FromDtoToEntity(x)));

        return listaEntity;

    }

    public List<GeneroDto> listadoGeneroDto (List <Genero> listaEntity){

        List<GeneroDto> listaDto = new ArrayList<>();
        listaEntity.forEach(x -> listaDto.add(FromEntityToDto(x)));

        return listaDto;

    }

}
