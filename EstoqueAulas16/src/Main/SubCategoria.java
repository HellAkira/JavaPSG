package Main;
import java.util.Date;
import java.util.Scanner;
public class SubCategoria extends CamposComuns implements IProjecaoDeDados{
	
	private Scanner sc = new Scanner(System.in);
	private int categoriaID;
	private int subCategoriaID;
	private Categoria categoria;
	private Produto produtos[];
	
	//Metodo Construtor
	public SubCategoria(Categoria categoria) {
		this.categoria = categoria;
		this.categoriaID = categoria.getCategoriaID();
		 produtos = new Produto[3];
	}
	
	
	public void selecionaProduto() {
	  	
		boolean enc = false;
		int id;

    	System.out.println();
    	System.out.println("Qual Produto deseja exibir os detalhes? (Selecione 0 para imprimir TUDO)");
    	
    	id = sc.nextInt();
    	
    	if(id == 0) {
    		this.imprimirRecursivo();
    		return;
    	}
    	
		for(int i = 0; i < 3; i++) {
			if (id == this.produtos[i].getProdutoID()) {
				produtos[i].imprimir();
			
				enc = true;
			}
		}
		
		if(enc == false) {
			System.out.println("ID não encontrado");
		}
		
	}
	
	
	//GETTERS AND SETTERS
	public int getCategoriaID() 
	{
		return categoriaID;
	}
	public int getSubCategoriaID() 
	{
		return subCategoriaID;
	}
	public void setSubCategoriaID(int subCategoriaID) 
	{
		this.subCategoriaID = subCategoriaID;
	}
	public Categoria getCategoria(){
		return categoria;
	}
	public void setCategoria(Categoria categoria){
		this.categoria = categoria;
		this.categoriaID = categoria.getCategoriaID();
	}
	public boolean adicionarProduto(Produto produto){
		for(int x = 0; x < 3; x++){
			if (produtos[x] == null){
				produtos[x] = produto;
			return true;
			}
		}
		return false;
	}
	
	public void imprimirRecursivo()
	{
		System.out.println("Subcategoria ID:" + this.subCategoriaID);
		System.out.println("Categoria ID:" + this.categoriaID);
		System.out.println("Descrição:" + this.descricao);
		System.out.println("Data de inclusão" + this.dataInsert);
		System.out.println();
		System.out.println("Imprimindo Produtos:");
		for(int x = 0; x < 3; x++){
			
			this.produtos[x].imprimir();
			}
	}
	

	public void imprimir()
	{
		System.out.println("Subcategoria ID:" + this.subCategoriaID);
		System.out.println("Categoria ID:" + this.categoriaID);
		System.out.println("Descrição:" + this.descricao);
		System.out.println("Data de inclusão" + this.dataInsert);
		System.out.println();
	}
}