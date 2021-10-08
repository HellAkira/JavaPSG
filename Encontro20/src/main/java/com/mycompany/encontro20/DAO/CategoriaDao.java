
package com.mycompany.encontro20.DAO;
import com.mycompany.encontro20.Pojo.*;
import com.mycompany.encontro20.FakeDB.EstoqueFakeDB;
import java.util.*;

public class CategoriaDao {
    
    
    public CategoriaDao(){
        EstoqueFakeDB.getCategorias();
    }
  
    public void create(CategoriaPojo pojo){
        EstoqueFakeDB.getCategorias().add(pojo);
    }
    
    public CategoriaPojo read(int categoriaID){

        return this.search(categoriaID);
        
    }
    
    public ArrayList<CategoriaPojo> readAll(){
        
        return EstoqueFakeDB.getCategorias();
        
    }
    
    public void update(CategoriaPojo pojo){
                
        CategoriaPojo Busca = this.search(pojo.getCategoriaID());
        
        EstoqueFakeDB.getCategorias().remove(Busca);
        EstoqueFakeDB.getCategorias().add(pojo);
           
    }
    
    public void delete(int categoriaID){
        
        CategoriaPojo Busca = this.search(categoriaID);
        
        EstoqueFakeDB.getCategorias().remove(Busca);
    }
    
    private CategoriaPojo search(int id){
        
        return EstoqueFakeDB.getCategorias()
                .stream()
                .filter(c -> c.getCategoriaID() == id)
                .findFirst()
                .orElse(null);
        
    }
    
    
    
}
