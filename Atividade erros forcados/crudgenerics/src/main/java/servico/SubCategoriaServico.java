package servico;

import java.util.List;

import ancestral.BaseGenericService;
import ancestral.IGerenericService;
import dominio.SubCategoria;
import repositorio.SubCategoriaRepositorio;

public class SubCategoriaServico 
extends BaseGenericService<SubCategoriaRepositorio>
implements IGerenericService<SubCategoria> {

	public SubCategoriaServico(String nomeUnidade) {
		super(nomeUnidade);
		this.getRepositorio();
		this.repositorio = new SubCategoriaRepositorio(this.nomeUnidade);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void inserir(SubCategoria instance) {
	
		repositorio.create(instance);
		
	}
	

	@Override
	public void alterar(SubCategoria instance) {
		repositorio.update(instance);
		
	}

	@Override
	public void excluir(SubCategoria instance) {
		repositorio.delete(instance);
		
	}

	@Override
	public void excluir(int id) {
		repositorio.delete(id);
		
	}

	@Override
	public List<SubCategoria> listar() {
		//teste de implementacao da prevencao de falhas no local errado, para utilizar forcar 
		//um erro dentro de SubcategoriaRepositorio
		try {
			
			return repositorio.readAll();
			
		}catch(Exception e){
			
			e.printStackTrace();
			System.out.println();
			return null;
			
		}
	}

	@Override
	public SubCategoria obter(int id) {
		return repositorio.read(id);
	}
	
	public void dispose() {
		repositorio.dispose();
	}

}
