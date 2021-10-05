package Main;
import java.util.Date;
import java.util.Scanner;
public class Categoria extends CamposComuns implements IProjecaoDeDados
{
	
	Scanner sc = new Scanner(System.in);
	
	private int categoriaID;

	private SubCategoria subCategorias[];

	public Categoria(){
		this.subCategorias = new SubCategoria[3];

}
	
	public int getCategoriaID() {
		return categoriaID;
	}

	public void setCategoriaID(int categoriaID) {
		this.categoriaID = categoriaID;
	}
	

	public SubCategoria getSubCategoria(int i) {
		return subCategorias[i];
	}

	public void setSubCategorias(SubCategoria[] subCategorias) {
		this.subCategorias = subCategorias;
	}

	
		
	public boolean adicionarSubCategoria(SubCategoria subCat){
			for(int x = 0; x < 3; x++){
				if (subCategorias[x] == null){
					subCategorias[x] = subCat;
				return true;
				}
			}
			return false;
		}
		
	public void imprimirRecursivo()
		{
			System.out.println("Imprimindo Subcategorias:");
			System.out.println();
			for(int x = 0; x < 3; x++){
				this.subCategorias[x].imprimirRecursivo();
			}

		}
	
	public void imprimir()
	{
		System.out.println("Categoria ID:" + this.categoriaID);
		System.out.println("Descrição:" + this.descricao);
		System.out.println("Data de inclusão" + this.dataInsert);
		System.out.println();
		
		
	}
		
	public void selecionaSubCategoria() {
      	
    	boolean enc = false;
    	int id;
    	System.out.println();
		System.out.println("Qual Subcategoria deseja exibir os detalhes? (Selecione 0 para imprimir TUDO)");
    	
    	id = sc.nextInt();
    	
    	if(id == 0) {
    		this.imprimirRecursivo();
    		return;
    	}
    	
    	for(int i = 0; i < 3; i++) {
    		if (id == this.subCategorias[i].getSubCategoriaID()) {
    			subCategorias[i].imprimir();
    			subCategorias[i].selecionaProduto();
    			enc = true;
    		}
    	}
    	
    	if(enc == false) {
    		System.out.println("ID não encontrado");
    	}

    }
	
	
	}

	
	
