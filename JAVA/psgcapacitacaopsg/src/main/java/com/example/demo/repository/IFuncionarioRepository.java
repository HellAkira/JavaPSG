package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Funcionario;

public interface IFuncionarioRepository extends JpaRepository<Funcionario, Integer>{
	
	Funcionario findByChave(Long id);



}
