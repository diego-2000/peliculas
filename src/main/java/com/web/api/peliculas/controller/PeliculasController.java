package com.web.api.peliculas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web.api.peliculas.entity.Pelicula;
import com.web.api.peliculas.implement.PeliculaImplement;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/api")
public class PeliculasController {

	@Autowired
	private PeliculaImplement peliculaImplement;
	
	@GetMapping("/peliculas")
	public List<Pelicula> getAll(){
		return peliculaImplement.getAll();
	}
	
	@GetMapping("/peliculas/{id}")
	public Pelicula getId(@PathVariable Long id){
		return peliculaImplement.getId(id);
	}
	
	@PostMapping("/peliculas")
	public void add(@RequestBody Pelicula pelicula) {
		peliculaImplement.add(pelicula);
	}
	
	@PutMapping("/peliculas/{id}")
	public void update(@PathVariable Long id,@RequestBody Pelicula pelicula){
		Pelicula peli=peliculaImplement.getId(id);
				 peli.setDescripcion(pelicula.getDescripcion());
				 peli.setNombre(pelicula.getNombre());
		peliculaImplement.add(peli);
	}
	
	@DeleteMapping("/peliculas/{id}")
	public void delete(@PathVariable Long id) {
		peliculaImplement.delete(id);
	}
}
