package com.prueba.notas.domain;

import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

public class GeneroDto {
    Long id;
    String genero;

    @OneToOne
    @JoinColumn(name = "estudiantesDto_Id")
    EstudiantesDto estudiantesDto;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public EstudiantesDto getEstudiantesDto() {
        return estudiantesDto;
    }

    public void setEstudiantesDto(EstudiantesDto estudiantesDto) {
        this.estudiantesDto = estudiantesDto;
    }
}
