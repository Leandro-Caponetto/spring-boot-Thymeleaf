package com.gestion.empleados.repository;


import org.springframework.data.jpa.repository.JpaRepository;


import com.gestion.empleados.entidades.Empleados;



public interface EmpleadoRepository extends JpaRepository<Empleados, Long>{


	
	
}
