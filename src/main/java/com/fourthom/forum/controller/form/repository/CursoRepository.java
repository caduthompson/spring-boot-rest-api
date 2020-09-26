package com.fourthom.forum.controller.form.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fourthom.forum.model.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long>{

	Curso findByNome(String nome);

}
