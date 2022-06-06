package com.prueba.notas.rest;

import com.prueba.notas.business.EstudiantesBussines;
import com.prueba.notas.domain.EstudiantesDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estudiantes/api/v1")

public class EstudiantesRest {

    @Autowired
    EstudiantesBussines estudiantesBussines;

    @GetMapping("/obtenerEstudiantes")
    public List<EstudiantesDto> obtenerEstudiantes(){

        return estudiantesBussines.obtenerEstudiantes();

    }

    @PostMapping("/agregarEstudiantes")
    public Boolean agregarEstudiantes (@RequestBody EstudiantesDto dto){

        return  estudiantesBussines.agregarEstudiantes(dto);

    }

    @PutMapping("/actualizarEstudiantes")
    public  Boolean actualizarEstudiantes (@RequestBody EstudiantesDto dto){

        return  estudiantesBussines.actualizarEstudiantes(dto);

    }

    @DeleteMapping("/eliminarEstudiantes")
    public  Boolean eliminarEstudiantes (@RequestBody EstudiantesDto dto){

        return estudiantesBussines.eliminarEstudiantes(dto);

    }
}
