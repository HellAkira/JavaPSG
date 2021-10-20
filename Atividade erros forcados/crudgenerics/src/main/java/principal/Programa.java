package principal;

import java.util.Date;

import dominio.Categoria;
import dominio.Produto;
import dominio.SubCategoria;
import servico.CategoriaServico;
import servico.ProdutoServico;
import servico.SubCategoriaServico;

public class Programa {

	public static void main(String[] args) {


		//Nome da coluna errado em Categoria.java na linha 20
		testaCat();

		//Erro: Em SubcategoriaRepositorio comentada a linha 50 que comeca a transaction
		testaSub();
		
		//Erro: Em programa linha 78 mandando nulo quando e esperado um numero inteiro.
		testaPro();		
	}

	private static void testaCat() {
		
		try {
			
		CategoriaServico serv = new CategoriaServico("exemplo-jpa");
		
		Categoria teste = new Categoria(null, "teste", new Date());

		serv.inserir(teste);
		
		for (Categoria teste2 : serv.listar()) {

			System.out.println(teste2);

		}
		
		serv.dispose();
		
		}catch(Exception e) {
			System.out.println("Erro na Aplicacao Cat. Erro: " + e.getMessage());
			}
		}
		

	

	private static void testaSub() {
		try {

		SubCategoriaServico serv = new SubCategoriaServico("exemplo-jpa");
		SubCategoria teste = new SubCategoria(98, 1, "teste subuy", new Date());
		
		//ERRO FORCADO NA LINHA 50 DE SubCategoria
		serv.alterar(teste);

		for (SubCategoria teste2 : serv.listar()) {

			System.out.println(teste2);

		}
		serv.dispose();
		}catch(Exception e) {
			System.out.println("Erro na Aplicacao SubCat. Erro: " + e.getMessage());
			}
		}

	private static void testaPro() {
		try {
		ProdutoServico serv = new ProdutoServico("exemplo-jpa");
		Produto teste = new Produto(null, 1, 1, "teste pro", new Date());

		serv.excluir(null);

		for (Produto teste2 : serv.listar()) {

			System.out.println(teste2);

		}
		
		serv.dispose();
	}catch(Exception e) {
		System.out.println("Erro na Aplicacao Prod. Erro: " + e.getMessage());
		}
	}

}
