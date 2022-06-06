package com.prueba.notas.rest;

import com.prueba.notas.business.GeneroBussines;
import com.prueba.notas.domain.GeneroDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/genero/api/v1")

public class GeneroRest {

    @Autowired
    GeneroBussines generoBussines;

    @GetMapping("/obtenerGenero")
    public List<GeneroDto> obtenerGenero(){

       return generoBussines.obtenerGenero();

    }

    @PostMapping("/guardarGenero")
    public Boolean guardarGenero (@RequestBody GeneroDto dto){

        return generoBussines.guardarGenero(dto);

    }

    @PutMapping("/actualizarGenero")
    public Boolean actualizarGenero (@RequestBody GeneroDto dto){

        return  generoBussines.actualizarGenero(dto);

    }

    @DeleteMapping("/eliminarGenero")
    public  Boolean eliminarGenero (@RequestBody GeneroDto dto){

        return  generoBussines.eliminarGenero(dto);

    }

}
