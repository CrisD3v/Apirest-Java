package com.prueba.notas.business;

import com.prueba.notas.domain.NotasDto;
import com.prueba.notas.mapper.NotasMapper;
import com.prueba.notas.model.Notas;
import com.prueba.notas.repository.NotasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class NotasBussinesImpl implements NotasBussines{

    @Autowired
    NotasMapper mapper;

    @Autowired
    NotasRepository repository;


    @Override
    public List<NotasDto> obtenerNotas() {

        List<NotasDto> listaDto = mapper.listaNotasDto(repository.findAll());

        return listaDto;

    }

    @Override
    public Boolean guardarNotas(NotasDto dto) {

        Notas notas = new Notas();
        repository.save(notas);

        return true;
    }

    @Override
    public Boolean actualizarNotas(NotasDto dto) {

        Notas notas = new Notas();
        repository.save(notas);

        return true;

    }

    @Override
    public Boolean eliminarNotas(NotasDto dto) {

        Notas notas = new Notas();
        repository.delete(notas);

        return true;

    }
}
