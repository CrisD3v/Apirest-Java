package com.prueba.notas.domain;

import com.prueba.notas.model.Asignatura;
import com.prueba.notas.model.Genero;
import com.prueba.notas.model.Notas;

import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

public class EstudiantesDto {
    Long id;
    String name;
    String lastName;
    Integer Age;

    @OneToOne(mappedBy = "estudiantesDto")
    GeneroDto generoDto;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return Age;
    }

    public void setAge(Integer age) {
        Age = age;
    }

    public GeneroDto getGeneroDto() {
        return generoDto;
    }

    public void setGeneroDto(GeneroDto generoDto) {
        this.generoDto = generoDto;
    }
}
