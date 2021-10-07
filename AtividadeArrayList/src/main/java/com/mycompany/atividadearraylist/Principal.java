package com.mycompany.atividadearraylist;

import java.util.Scanner;
import com.mycompany.atividadearraylist.Pojo.*;
import FakeDB.EstoqueFakeDB;

public class Principal {
    
    public static void main(String[] args) {
        
//        
        Scanner sc = new Scanner(System.in);
        
        EstoqueLambda estoque = new EstoqueLambda();
        
        
//        ControleDeEstoque ctrlEstoque = new ControleDeEstoque();
//        EstoqueFakeDB estoque;
//        
//        estoque = new EstoqueFakeDB();
//        estoque.getCategorias();
//        estoque.getSubCategorias();
//        estoque.getProdutos();2

//        
        System.out.println("Inicio");
        System.out.println();
        System.out.println("Categorias: ");
        System.out.println();
        estoque.imprimeCat();
        System.out.println("De Qual Categoria deseja exibir as subCategorias?");
        estoque.imprimeSubCat(sc.nextInt());
        System.out.println("De Qual SubCategoria deseja exibir as produtos?");
        estoque.imprimeProd(sc.nextInt());



        
        
    }
            
    
}
