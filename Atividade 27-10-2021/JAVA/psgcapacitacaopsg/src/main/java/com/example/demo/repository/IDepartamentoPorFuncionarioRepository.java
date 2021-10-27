package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.DepartamentoPorFuncionario;

public interface IDepartamentoPorFuncionarioRepository extends JpaRepository<DepartamentoPorFuncionario, Integer> {
	

	List<DepartamentoPorFuncionario>findByDepartamentoPorFuncionarioIDBetween(int inicio, int fim);
	List<DepartamentoPorFuncionario> findByDepartamentoID(Integer departamentoID);
	List<DepartamentoPorFuncionario> findByFuncionarioID(Integer funcionarioID);

	@Query (value = "SELECT * FROM DepartamentoPorFuncionario WHERE FuncionarioID IN(SELECT FuncionarioID FROM DepartamentoPorFuncionario GROUP BY FuncionarioID HAVING COUNT(*) > 1) ORDER BY FuncionarioID", nativeQuery = true)
	List<DepartamentoPorFuncionario> findByRepetidos();
	
	@Query(value ="SELECT [DepartamentoPorFuncionarioID],[FuncionarioID],[DepartamentoID],[DataInicio],[DataFim] FROM [CapacitacaoPSG2021H3].[dbo].[DepartamentoPorFuncionario] WHERE DepartamentoPorFuncionarioID >= :page AND DepartamentoPorFuncionarioID <= :size", nativeQuery = true)
	List<DepartamentoPorFuncionario> findByPagina( @Param("page") int inicial, @Param("size") int size);
	
	
}
