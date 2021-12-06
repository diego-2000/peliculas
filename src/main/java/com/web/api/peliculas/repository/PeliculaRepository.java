package com.web.api.peliculas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.web.api.peliculas.entity.Pelicula;
@Repository
public interface PeliculaRepository extends JpaRepository<Pelicula, Long> {

}
