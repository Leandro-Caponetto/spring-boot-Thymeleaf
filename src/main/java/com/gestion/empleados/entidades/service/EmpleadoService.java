package com.gestion.empleados.entidades.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.gestion.empleados.entidades.Empleados;

public interface EmpleadoService {
	
	public List<Empleados> findAll();
	
	public Page<Empleados> findAll(Pageable pageable);
	
	public void save(Empleados empleado);
	
	public Empleados findOne(Long id);
	
	public void delete(Long id);

}
