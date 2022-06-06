package com.prueba.notas.mapper;

import com.prueba.notas.domain.NotasDto;
import com.prueba.notas.model.Notas;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component

public class NotasMapper {

    public Notas FromDtoToEntity (NotasDto dto){

        Notas entity = new Notas();
        entity.setId(dto.getId());
        entity.setNotas(dto.getNotas());

        return  entity;

    }

    public  NotasDto FromEntityToDto (Notas entity){

        NotasDto dto = new NotasDto();

        dto.setId(entity.getId());
        dto.setNotas(entity.getNotas());

        return dto;

    }

    public List<Notas> listaNotas(List<NotasDto>listaDto){

        List<Notas> listEntity = new ArrayList<>();
        listaDto.forEach(x -> listEntity.add(FromDtoToEntity(x)));

        return  listEntity;

    }

    public  List<NotasDto> listaNotasDto(List<Notas>listaEntity){

        List<NotasDto> listDto = new ArrayList<>();
        listaEntity.forEach(x -> listDto.add(FromEntityToDto(x)));

        return listDto;

    }
}
