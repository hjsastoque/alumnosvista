package com.alumnosvista.app.service;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


import com.alumnosvista.app.model.AlumnosVista;

public interface IAlumnoVistaService2 {
public Iterable<AlumnosVista> findAll();
	
	public Page<AlumnosVista> findAll(Pageable pageable);
	
	public Optional<AlumnosVista> findById(Long id);
	
	public AlumnosVista save1(AlumnosVista alumnos);
	
	public void deleteById(Long id);
	
	public int save(AlumnosVista alumnos);

}
