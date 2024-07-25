package com.gestion.empleados.entidades.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gestion.empleados.entidades.Empleados;
import com.gestion.empleados.repository.EmpleadoRepository;

@Service
public class EmpleadoServiceImpl implements EmpleadoService{
	
	@Autowired
	private EmpleadoRepository empleadoRepository;

	@Override
	@Transactional(readOnly = true)
	public List<Empleados> findAll() {
		return (List<Empleados>) empleadoRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Page<Empleados> findAll(Pageable pageable) {
		
		return empleadoRepository.findAll(pageable);
	}

	@Override
	@Transactional
	public void save(Empleados empleado) {
		empleadoRepository.save(empleado);
		
	}

	@Override
	@Transactional(readOnly = true)
	public Empleados findOne(Long id) {
		
		return empleadoRepository.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		empleadoRepository.deleteById(id);
		
	}

}
