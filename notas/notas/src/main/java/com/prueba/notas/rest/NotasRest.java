package com.prueba.notas.rest;

import com.prueba.notas.business.NotasBussines;
import com.prueba.notas.domain.NotasDto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/notas/api/v1")

public class NotasRest {

    @Autowired
    NotasBussines notasBussines;

    @GetMapping("/obtenerNotas")
    public List<NotasDto> obtenerNotas(){

     return notasBussines.obtenerNotas();

    }

    @PostMapping("/guardarNotas")
    public Boolean agregarNotas(NotasDto dto){

        return notasBussines.guardarNotas(dto);

    }

    @PutMapping("/actualizarNotas")
    public Boolean actualizarNotas (NotasDto dto){

        return notasBussines.actualizarNotas(dto);

    }

    @DeleteMapping("/eleminarNotas")
    public Boolean eliminarNotas (NotasDto dto){

        return  notasBussines.eliminarNotas(dto);

    }
}
