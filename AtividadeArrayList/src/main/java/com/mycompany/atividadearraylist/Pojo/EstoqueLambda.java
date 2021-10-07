
package com.mycompany.atividadearraylist.Pojo;

import java.util.ArrayList;
import java.util.stream.*;
import FakeDB.*;

public class EstoqueLambda {
    
 
    public void imprimeCat(){

        System.out.println("Exibindo Categorias");

        EstoqueFakeDB.getCategorias()
            .stream()
            .filter(cat ->(cat.getCategoriaID() > 0) && (cat.getCategoriaID() <= 3))
            .forEach(c -> {
            System.out.println();
            System.out.println("Categoria ID   : " +c.getCategoriaID());
            System.out.println("Descricao      : " +c.getDescricao());
            System.out.println("Data de Insert : " +c.getDataInsert());
            System.out.println("- - - - - - - - ");    
            }
            );   
        }

    public void imprimeSubCat(int catID){

        System.out.println("Exibindo SubCategorias");

        EstoqueFakeDB.getSubCategorias()
            .stream()
            .filter(subcat ->(subcat.getCategoriaID() == catID))
            .forEach(c -> {
            System.out.println();
            System.out.println("Categoria ID   : " +c.getCategoriaID());
            System.out.println("SubCategoria ID: " +c.getSubCategoriaID());
            System.out.println("Descricao      : " +c.getDescricao());
            System.out.println("Data de Insert : " +c.getDataInsert());
            System.out.println("- - - - - - - - ");    
            }
        );  


}
       
        public void imprimeProd(int subcatID){
        
            System.out.println("Exibindo Produtos");

            EstoqueFakeDB.getProdutos()
                .stream()
                .filter(pro ->(pro.getSubCategoriaID() == subcatID))
                .forEach(c -> {
                System.out.println();
                System.out.println("Categoria ID   : " +c.getCategoriaID());
                System.out.println("SubCategoria ID: " +c.getSubCategoriaID());
                System.out.println("Produto ID     : " +c.getSubCategoriaID());
                System.out.println("Descricao      : " +c.getDescricao());
                System.out.println("Data de Insert : " +c.getDataInsert());
                System.out.println("- - - - - - - - ");    
                }
            );  
        
        
    }
        
    
}