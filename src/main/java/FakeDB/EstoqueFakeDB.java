package FakeDB;

import com.mycompany.atividadearraylist.Pojo.*;
import java.util.ArrayList;
import java.util.Date;

public final class EstoqueFakeDB {
    
        private static ArrayList<CategoriaPojo> categorias;
    
        private static ArrayList<CategoriaPojo> getCategorias(){
            if(categorias == null){
                categorias = new ArrayList();
                return categorias;
            }
            return categorias;

        }
        
        private static void iniciarlizarCategoria(){
            Date dataDeInsert = new Date(System.currentTimeMillis());
           
        }
        private static void inicializarSubCategoria(CategoriaPojo c){
            
            
        }
        
        private static void adicionarCategoria(int id, String Descricao, Date dataInsert) {
	
                CategoriaPojo c = new CategoriaPojo();
                c.setCategoriaID(id);
                c.setDescricao(Descricao);
                c.setDataInsert(dataInsert);
		
        }
        
         private static void adicionarSubCategoria(CategoriaPojo c, int id, String Descricao, Date dataInsert) {
		
                SubCategoriaPojo sc = new SubCategoriaPojo();
                sc.setCategoriaID(c.getCategoriaID());
                sc.setSubCategoriaID(id);
                sc.setDescricao(Descricao);
                sc.setDataInsert(dataInsert);
                c.getSubCategoria().add(sc);
                
        }
         
         private static void adicionarProduto(SubCategoriaPojo sc, int id, String Descricao, Date dataInsert) {
		
                ProdutoPojo pr = new ProdutoPojo();
                pr.setDescricao(Descricao);
                pr.setProdutoID(id);
                pr.setSubCategoriaID(sc.getSubCategoriaID());
                pr.setCategoriaID(sc.getCategoriaID());
                pr.setDataInsert(dataInsert);
                sc.getProdutos().add(pr);
		
        }
}
    
    
    

