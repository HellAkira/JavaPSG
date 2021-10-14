package repositorio;

import java.util.List;

import javax.persistence.Query;

import Dominio.Categoria;

public class CategoriaRepositorio extends BaseRepositorio{

	public CategoriaRepositorio(String nomeUnidade) {
		super(nomeUnidade);
		this.em = this.emf.createEntityManager();;
	}
	public void create() {
		
	}

	public void read(int id) {
		
	}
	
	public List<Categoria> readAll() {
		Query qry = this.em.createQuery("From Categoria");
		List<Categoria> lista = qry.getResultList();
		this.em.close();
		this.emf.close();
		return lista;

	}

	public void update() {
		
	}
	
	public void delete() {
		
	}
	

}
