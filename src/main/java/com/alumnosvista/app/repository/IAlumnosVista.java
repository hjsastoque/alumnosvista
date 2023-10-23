package com.alumnosvista.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.alumnosvista.app.model.AlumnosVista;

@Repository
public interface IAlumnosVista extends JpaRepository<AlumnosVista, Long>{
	
	
	

}
