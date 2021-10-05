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



//PROPIEDADES
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


//METODOS

public void imprimir()
{
	System.out.println("Produto ID:" + this.produtoID);
	System.out.println("Subcategoria ID:" + this.subCategoriaID);
	System.out.println("Categoria ID:" + this.categoriaID);
	System.out.println("Descrição:" + this.descricao);
	System.out.println("Data de inclusão" + this.dataInsert);
	System.out.println();
}



}
