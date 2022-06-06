package com.prueba.notas.business;

import com.prueba.notas.domain.GeneroDto;
import com.prueba.notas.mapper.GeneroMapper;
import com.prueba.notas.model.Genero;
import com.prueba.notas.repository.GeneroRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class GeneroBussinesImpl implements GeneroBussines{

    @Autowired
    GeneroMapper mapper;

    @Autowired
    GeneroRepository repository;

    @Override
    public List<GeneroDto> obtenerGenero() {

        List<GeneroDto> listDto = mapper.listadoGeneroDto(repository.findAll());
        return listDto;
    }

    @Override
    public Boolean guardarGenero(GeneroDto dto) {

        Genero genero = mapper.FromDtoToEntity(dto);
        repository.save(genero);
        return true;

    }

    @Override
    public Boolean actualizarGenero(GeneroDto dto) {

        Genero genero = mapper.FromDtoToEntity(dto);
        repository.save(genero);

        return true;

    }

    @Override
    public Boolean eliminarGenero(GeneroDto dto) {

        Genero genero = mapper.FromDtoToEntity(dto);
        repository.delete(genero);

        return true;

    }
}
