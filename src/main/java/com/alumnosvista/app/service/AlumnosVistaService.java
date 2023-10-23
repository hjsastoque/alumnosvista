package com.alumnosvista.app.service;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alumnosvista.app.model.AlumnosVista;
import com.alumnosvista.app.repository.IAlumnosVista;

@Service
public class AlumnosVistaService implements IAlumnoVistaService2{
	
	@Autowired
	private IAlumnosVista alumnosRepository;

	@Override
	@Transactional(readOnly=true)
	public Iterable<AlumnosVista> findAll() {
		return alumnosRepository.findAll();
	}

	@Override
	@Transactional(readOnly=true)
	public Page<AlumnosVista> findAll(Pageable pageable) {
		return alumnosRepository.findAll(pageable);
	}

	@Override
	@Transactional
	public Optional<AlumnosVista> findById(Long id) {
		return alumnosRepository.findById(id);
	}

	@Override
	@Transactional
	public AlumnosVista save1(AlumnosVista alumnos) {
		return alumnosRepository.save(alumnos);
	}
	
	@Override
	@Transactional
	public int save(AlumnosVista alumnos) {
		int res=0;
		AlumnosVista a = alumnosRepository.save(alumnos);
		if(!a.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	@Transactional
	public void deleteById(Long id) {
		alumnosRepository.deleteById(id);
		
	}

		

}
