package com.mycompany.encontro20.Service;
import com.mycompany.encontro20.DAO.CategoriaDao;
import com.mycompany.encontro20.Pojo.CategoriaPojo;
import java.util.Scanner;


public class CategoriaService {
    
    private Scanner sc;
    private CategoriaDao dao;
    
    public CategoriaService(){
       sc = new Scanner(System.in); 
       dao = new CategoriaDao();
    }
    
    public void exibirMenu(){
        boolean sair = false;
        do{
            
           int op = this.printMenu();
           
           switch(op){
               case 1:
                   this.printMenuInserir();
                       break;
               case 2:
                   this.printMenuListar();
                       break;
               case 3:
                   this.printMenuDetalhar();
                       break;
               case 4:
                   this.printMenuAlterar();
                       break;
               case 5:
                   this.printMenuExcluir();
                       break;
               case 0:
                   sair = true;
                       break;
               default:
                   System.out.println("Opção selecionada não disponível. Tente novamente.");
                  
         
           }
        
        }
        while(sair != true);
    }
    
    private int printMenu(){
        
                System.out.println("##                -- Menu Categoria --##\n");
                System.out.println("\n                  =========================");
		System.out.println("                  |     1 - Inserir       |");
		System.out.println("                  |     2 - Listar        |");
		System.out.println("                  |     3 - Detalhes      |");
		System.out.println("                  |     4 - Alterar       |");
		System.out.println("                  |     5 - Excluir       |");
		System.out.println("                  |     0 - Sair          |");
		System.out.println("                  =========================\n");
                
                return this.sc.nextInt();
    }
    
    private void printMenuInserir(){
       
        
        System.out.println("Digite qual o ID da Categoria");
        int id = this.sc.nextInt();
        
        System.out.println("Digite qual a descricao");
        String desc = this.sc.nextLine();
        
        CategoriaPojo pojo = new CategoriaPojo();
        pojo.setCategoriaID(id);
        pojo.setDescricao(desc);
        this.dao.create(pojo);
                
        CategoriaPojo item = this.dao.read(id);
        
        if(this.dao.read(id) != null){
            System.out.println("\nCategoria Adicionada com sucesso");
        }else
        {
            System.out.println("\nErro ao adicionar a categoria");
        }
               
    
        
        
                
        
    }
    private void printMenuListar(){
            

        for (CategoriaPojo item : this.dao.readAll()) {
                System.out.println("                 # Menu Categoria - Listar #\n");
                System.out.println("\n                  =========================");
		System.out.printf ("                  |     Categoria ID: %d\n",item.getCategoriaID());
		System.out.printf ("                  |     Descricao: %s\n", item.getDescricao());
		System.out.println("                  =========================\n");
        }
        
        
        
        
        
    }
    
    
    private void printMenuDetalhar(){
                System.out.println("Digite Qual Categoria");
                int op = this.sc.nextInt();
                
                CategoriaPojo item = this.dao.read(op);
                if(item == null){
                System.out.println("Opção selecionada não disponível. Tente novamente.");
                }
                
                System.out.println("                 # Menu Categoria - Listar #\n");
                System.out.println("\n                  =========================");
		System.out.printf ("                  |     Categoria ID: %d\n",item.getCategoriaID());
		System.out.printf ("                  |     Descricao: %s\n", item.getDescricao());
		System.out.println("                  =========================\n");
        
    }
  
    
    private void printMenuAlterar(){
            
   
                System.out.println("Digite Qual Categoria");
                int op = this.sc.nextInt();
                CategoriaPojo item = this.dao.read(op);
                if(item == null){
                    System.out.println("Opção selecionada não disponível. Tente novamente.");
                }
                
                System.out.println("                 # Menu Categoria - Listar #\n");
                System.out.println("\n                  =========================");
		System.out.printf ("                  |     Categoria ID: %d\n",item.getCategoriaID());
		System.out.printf ("                  |     Descricao: %s\n", item.getDescricao());
		System.out.println("                  =========================\n");
                
                
                System.out.println("Digite qual a descricao\n");

                String desc = this.sc.next();
                item.setDescricao(desc);
                
               
           
        
    }
    private void printMenuExcluir(){
        
            System.out.println("Digite Qual Categoria");
                int op = this.sc.nextInt();
                CategoriaPojo item = this.dao.read(op);
                if(item == null){
                    System.out.println("Opção selecionada não disponível. Tente novamente.");
                }
                
                System.out.println("                 # Menu Categoria - Listar #\n");
                System.out.println("\n                  =========================");
		System.out.printf ("                  |     Categoria ID: %d\n",item.getCategoriaID());
		System.out.printf ("                  |     Descricao: %s\n", item.getDescricao());
		System.out.println("                  =========================\n");
                
                this.dao.delete(item.getCategoriaID());
                
                CategoriaPojo itemDeletado = this.dao.read(op);
                
                if(itemDeletado == null){
                    
                System.out.println("Item Deletado");
                }
                
               
        
    }
    
    
    
    
}
