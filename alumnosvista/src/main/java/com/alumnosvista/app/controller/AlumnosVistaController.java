<<<<<<< Updated upstream:alumnosvista/src/main/java/com/alumnosvista/app/controller/AlumnosVistaController.java
package com.alumnosvista.app.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;


import com.alumnosvista.app.model.AlumnosVista;
import com.alumnosvista.app.service.IAlumnoVistaService2;

@Controller
//@RequestMapping("api/alumnos")
public class AlumnosVistaController {
	
	@Autowired
	private IAlumnoVistaService2 alumnosService;
	
	@PostMapping
	public ResponseEntity<?> create(@RequestBody AlumnosVista alumnos){
		return ResponseEntity.status(HttpStatus.CREATED).body(alumnosService.save(alumnos));
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> read(@PathVariable(value="id") Long alumnosId){
		Optional<AlumnosVista> oAlumnos=alumnosService.findById(alumnosId);
		
		if(!oAlumnos.isPresent()) {
			return ResponseEntity.notFound().build();
		}
			
		return ResponseEntity.ok(oAlumnos);
	}
	
	@GetMapping("/listar")
	public String listar(Model model) {
		List<AlumnosVista>alumnos=(List<AlumnosVista>) alumnosService.findAll();
		model.addAttribute("alumnos", alumnos);
		return "index";
	}
	
	@GetMapping("/del/{id}")
	public String del(Model model, @PathVariable Long id) {
		alumnosService.deleteById(id);
		return "redirect:/listar";
	}
	
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable Long id, Model model){
		Optional<AlumnosVista> alumnos=alumnosService.findById(id);
		model.addAttribute("alumnos", alumnos.get());
		return "form";
	}
	
	@GetMapping("/new")
	public String add(Model model){
		model.addAttribute("alumnos",new AlumnosVista());
		return "form";
	}
	
	@PostMapping("/listar")
	public String save(@Validated AlumnosVista a, Model model){
		alumnosService.save(a);
		//List<AlumnosVista>alumnos=(List<AlumnosVista>) alumnosService.findAll();
		model.addAttribute("alumnos",new AlumnosVista());
		return "redirect:/listar";
	}	
}
=======
package com.alumnosvista.app.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;

import com.alumnosvista.app.model.AlumnosVista;
import com.alumnosvista.app.service.IAlumnoVistaService2;

@Controller
//@RequestMapping("api/alumnos")
public class AlumnosVistaController {
	
	@Autowired
	private IAlumnoVistaService2 alumnosService;
	
	@PostMapping
	public ResponseEntity<?> create(@RequestBody AlumnosVista alumnos){
		return ResponseEntity.status(HttpStatus.CREATED).body(alumnosService.save(alumnos));
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> read(@PathVariable(value="id") Long alumnosId){
		Optional<AlumnosVista> oAlumnos=alumnosService.findById(alumnosId);
		
		if(!oAlumnos.isPresent()) {
			return ResponseEntity.notFound().build();
		}
			
		return ResponseEntity.ok(oAlumnos);
	}
	
	@GetMapping("/alumnos")
	public ResponseEntity<List<AlumnosVista>> exampleList() {
	  List<AlumnosVista>alumnos=(List<AlumnosVista>) alumnosService.findAll();
	  return ResponseEntity.ok(alumnos);
	}
	
	@GetMapping("/listar")
	public String listar(Model model) {
		List<AlumnosVista>alumnos=(List<AlumnosVista>) alumnosService.findAll();
		model.addAttribute("alumnos", alumnos);
		return "index";
	}
	
	@GetMapping("/del/{id}")
	public String del(Model model, @PathVariable Long id) {
		alumnosService.deleteById(id);
		return "redirect:/listar";
	}
	
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable Long id, Model model){
		Optional<AlumnosVista> alumnos=alumnosService.findById(id);
		model.addAttribute("alumnos", alumnos.get());
		return "form";
	}
	
	@GetMapping("/new")
	public String add(Model model){
		List<AlumnosVista>listalumnos=(List<AlumnosVista>) alumnosService.findAll();
		model.addAttribute("listalumnos",listalumnos);
		model.addAttribute("alumnos",new AlumnosVista());
		return "form";
	}
	
	@PostMapping("/listar")
	public String save(@Validated AlumnosVista a, Model model){
		alumnosService.save(a);
		//List<AlumnosVista>alumnos=(List<AlumnosVista>) alumnosService.findAll();
		model.addAttribute("alumnos",new AlumnosVista());
		return "redirect:/listar";
	}	
}
>>>>>>> Stashed changes:src/main/java/com/alumnosvista/app/controller/AlumnosVistaController.java
