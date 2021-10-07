
package com.mycompany.atividadearraylist.Pojo;
import FakeDB.EstoqueFakeDB;
import java.util.ArrayList;

public class ControleDeEstoque {
 
    public void imprimeCat(ArrayList<CategoriaPojo> categorias){
        
        System.out.println("Exibindo Categorias");
        
        for (CategoriaPojo categoria : categorias) {
            if(categoria.getCategoriaID() <= 3){
                System.out.println();
                System.out.println("Categoria ID   : " +categoria.getCategoriaID());
                System.out.println("Descricao      : " +categoria.getDescricao());
                System.out.println("Data de Insert : " +categoria.getDataInsert());
                System.out.println("- - - - - - - - ");
                
            }
        }
        
 
    }
    public void imprimeSubCat(ArrayList<SubCategoriaPojo> subCategorias, int id){
        
        System.out.println("Exibindo SubCategorias");
        
        for (SubCategoriaPojo subCategoria : subCategorias) {
            
            if(id == subCategoria.getCategoriaID()){
                System.out.println();
                System.out.println("Categoria ID   : " + subCategoria.getCategoriaID());
                System.out.println("SubCategoria ID: " +subCategoria.getSubCategoriaID());
                System.out.println("Descricao      : " +subCategoria.getDescricao());
                System.out.println("Data de Insert : " +subCategoria.getDataInsert());
                System.out.println("- - - - - - - - -");
                
            }
            
        }
        
    }
    public void imprimeProd(ArrayList<ProdutoPojo> produtos, int id){
        
    System.out.println("Exibindo Produtos");
    
        for (ProdutoPojo produto : produtos) {  
            
            if(id == produto.getSubCategoriaID()){
                
                System.out.println();
                System.out.println("Categoria ID   : " +produto.getCategoriaID());
                System.out.println("SubCategoria ID: " +produto.getSubCategoriaID());
                System.out.println("Produto ID     : " +produto.getProdutoID());
                System.out.println("Descricao      : " +produto.getDescricao());
                System.out.println("Data de Insert : " +produto.getDataInsert());
                System.out.println("- - - - - - - - ");

             }
        
        }

    
}

}