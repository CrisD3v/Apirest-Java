package com.prueba.notas.business;

import com.prueba.notas.domain.AsignaturaDto;

import java.util.List;

public interface AsignaturaBussines {

    public List<AsignaturaDto> obtenerAsignaturas();

    public  Boolean crearAsignatura(AsignaturaDto dto);

    public Boolean actualizarAsignatura(AsignaturaDto dto);

    public Boolean eliminarAsignatura(AsignaturaDto dto);


}
