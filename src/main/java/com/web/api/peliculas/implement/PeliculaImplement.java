package com.web.api.peliculas.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.api.peliculas.entity.Pelicula;
import com.web.api.peliculas.repository.PeliculaRepository;
import com.web.api.peliculas.service.PeliculaService;

@Service
public class PeliculaImplement implements PeliculaService{
	@Autowired
	private PeliculaRepository peliculaRepository;
	@Override
	public List<Pelicula> getAll() {
		return peliculaRepository.findAll();
	}
}
