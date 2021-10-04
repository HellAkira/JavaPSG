package Main;
import java.util.Date;
public class Categoria extends CamposComuns
{
	
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
	
	public boolean adicionarSubCategoria(SubCategoria subCat){
		for(int x = 0; x < 3; x++){
			if (subCategorias[x] == null){
				subCategorias[x] = subCat;
			return true;
			}
		}
		return false;
	}



	}
	
