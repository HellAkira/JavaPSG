package Main;
import java.util.Date;
public class SubCategoria extends CamposComuns
{
	
private int categoriaID;
private int subCategoriaID;
private Categoria categoria;

//Metodo Construtor
public SubCategoria(Categoria categoria) {
	this.categoria = categoria;
	this.categoriaID = categoria.getCategoriaID();
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


}