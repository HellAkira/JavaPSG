package Main;
import java.util.Date;
import java.util.Scanner;
public class Estoque
{
	private Scanner sc;
  	private Categoria categorias[];
	
	public Estoque(){
		categorias = new Categoria[3];
		sc = new Scanner(System.in);
	}
	
	public void inicializarVetorCategorias() {
		Date dataDeInsercao = new Date(System.currentTimeMillis());
		
		for(int x = 0; x < 3; x++) {
        	int j = x + 1;
        	categorias[x] = criarCategoria(j,"Teste "+j, dataDeInsercao);
        }
	}
	
	
	//modelo simples
    public void testar()
{
    Categoria cat = new Categoria();
    cat.setCategoriaID(1);
    SubCategoria subCat = new SubCategoria(cat); 
    subCat.setSubCategoriaID(1);
    Produto prod = new Produto(subCat);
    prod.setProdutoID(1);
}
   
    public void testarComVetores(){
    	
    	this.inicializarVetorCategorias();
    	this.imprimirTudo(categorias);
        sc.nextLine();
        
    }

    public void testarComSelecao() {
    	this.inicializarVetorCategorias();
    	this.selecionaCategoria();
    	
    }
    
    
    private void imprimirRecursivo()
	{
		System.out.println("Imprimindo Categorias:");
		System.out.println();
		for(int x = 0; x < 3; x++){
			this.categorias[x].imprimirRecursivo();
		}

	}

     
    private void selecionaCategoria() {
      	
    	boolean enc = false;
    	int id;
    	
    	System.out.println("Qual Categoria deseja exibir os detalhes? (Selecione 0 para imprimir TUDO)");
    	
    	id = sc.nextInt();
    	
    	if(id == 0) {
    		this.imprimirRecursivo();
    		return;
    	}
    	
    	for(int i = 0; i < 3; i++) {
    		if (id == this.categorias[i].getCategoriaID()) {
    			categorias[i].imprimir();
    			categorias[i].selecionaSubCategoria();
    			enc = true;
    		}
    	}
    	
    	if(enc == false) {
    		System.out.println("ID não encontrado");
    	}
    	
    }
    
    private void imprimirTudo(Categoria categorias[]) {

    	 for(int x = 0; x < 3; x++) {
	         System.out.println(categorias[x].getCategoriaID());
	         System.out.println(categorias[x].getDescricao());
	         System.out.println(categorias[x].getDataInsert());
         }
    	
    	 
    }
    
    private Categoria criarCategoria(int id, String descricao, Date dataDeInsert) {
    	Categoria cat = new Categoria();
    	cat.setCategoriaID(id);
    	cat.setDescricao(descricao);
    	cat.setDataInsert(dataDeInsert);

     	for (int i = 0; i < 3; i++) {	
     		int j = i+1;
        	SubCategoria subCat= criarSubCategoria(cat,j,"Teste SubCategoria "+j, dataDeInsert);
        	cat.adicionarSubCategoria(subCat);
        	
		}
    	return cat;
    }
    
    private SubCategoria criarSubCategoria(Categoria cat, int id, String descricao, Date dataDeInsert) {
    	SubCategoria subCat = new SubCategoria(cat);
    	subCat.setSubCategoriaID(id);
    	subCat.setDescricao(descricao);
    	subCat.setDataInsert(dataDeInsert);
    	
    	for (int i = 0; i < 3; i++) {	
     		int j = i+1;
        	Produto prod = criarProduto(subCat,j,"Teste Produto "+j, dataDeInsert);
        	subCat.adicionarProduto(prod);
		}
    	
    	return subCat;
    }
    
    private Produto criarProduto(SubCategoria subCat, int id, String descricao, Date dataDeInsert) {
    	Produto prod = new Produto(subCat);
    	prod.setProdutoID(id);
    	prod.setDescricao(descricao);
    	prod.setDataInsert(dataDeInsert);
    	return prod;
    }
    
    
    



}