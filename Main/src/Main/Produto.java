package Main;
import java.util.Date;

public class Produto extends CamposComuns
{
	
private int categoriaID;
private int subCategoriaID;
private int produtoID;
private Categoria categoria;
private SubCategoria subCategoria;

//Metodo Construtor
public Produto(SubCategoria subCategoria) 
{
	this.subCategoria = subCategoria;
}

//GETTERS e SETTERS
public int getCategoriaID() 
{
	return categoriaID;
}
public void setCategoriaID(int categoriaID) 
{
	this.categoriaID = categoriaID;
}
public int getSubCategoriaID() 
{
	return subCategoriaID;
}
public void setSubCategoriaID(int subCategoriaID) 
{
	this.subCategoriaID = subCategoriaID;
}





}
