
package com.mycompany.atividadearraylist.Pojo;
import java.util.ArrayList;

public class CategoriaPojo extends CamposComuns
{
    private int categoriaID;
    
    private ArrayList<SubCategoriaPojo> subCategorias;

    public CategoriaPojo(){
        this.subCategorias = new ArrayList();
    }
    
    public int getCategoriaID() {
        return categoriaID;
    }

    public void setCategoriaID(int categoriaID) {
        this.categoriaID = categoriaID;
    }
    public ArrayList<SubCategoriaPojo> getSubCategoria() {
        return this.subCategorias;
    }


}
