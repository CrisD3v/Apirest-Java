package com.prueba.notas.business;

import com.prueba.notas.domain.NotasDto;

import java.util.List;

public interface NotasBussines {

    public List<NotasDto> obtenerNotas();

    public Boolean guardarNotas (NotasDto dto);

    public  Boolean actualizarNotas (NotasDto dto);

    public  Boolean eliminarNotas (NotasDto dto);
}
