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
	this.subCategoriaID = subCategoria.getSubCategoriaID();
	this.categoriaID = subCategoria.getCategoria().getCategoriaID();
	this.categoria = subCategoria.getCategoria();
}



//GETTERS e SETTERS
public int getCategoriaID() 
{
	return categoriaID;
}
public int getSubCategoriaID() 
{
	return subCategoriaID;
}
public void setSubCategoria(SubCategoria subCategoria) 
{
	this.subCategoria = subCategoria;
	this.subCategoriaID = subCategoria.getSubCategoriaID();
	this.categoriaID = subCategoria.getCategoria().getCategoriaID();
}

public int getProdutoID() {
	return produtoID;
}

public void setProdutoID(int produtoID) {
	this.produtoID = produtoID;
}



}
