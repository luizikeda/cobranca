package com.algaworks.repository;

import com.algaworks.model.Titulo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface Titulos extends JpaRepository<Titulo, Long> {
}
