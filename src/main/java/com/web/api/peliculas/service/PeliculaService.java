package com.web.api.peliculas.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.web.api.peliculas.entity.Pelicula;

@Service
public interface PeliculaService {
	public List<Pelicula> getAll();
}
