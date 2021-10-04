package Main;

public class Main {

	public static void main(String[] args) {
		

		Categoria cat = new Categoria();
		cat.setCategoriaID(1);
		SubCategoria subCat = new SubCategoria(cat); 
		subCat.setSubCategoriaID(1);
		Produto prod = new Produto(subCat);
		prod.setProdutoID(1);


	}

}
