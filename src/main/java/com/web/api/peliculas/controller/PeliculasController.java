package com.web.api.peliculas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
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
	
	@GetMapping("/pelicula")
	public List<Pelicula> getAll(){
		return peliculaImplement.getAll();
	}
	
}
