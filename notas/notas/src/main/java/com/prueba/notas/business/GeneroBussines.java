package com.prueba.notas.business;

import com.prueba.notas.domain.GeneroDto;

import java.util.List;

public interface GeneroBussines {

    public List<GeneroDto> obtenerGenero();

    public  Boolean guardarGenero (GeneroDto dto);

    public Boolean actualizarGenero (GeneroDto dto);

    public Boolean eliminarGenero (GeneroDto dto);

}
