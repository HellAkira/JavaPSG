package com.mycompany.encontro20.Pojo;

import java.util.ArrayList;


public class SubCategoriaPojo extends CamposComuns
{
    private int subCategoriaID;
    private int categoriaID;

    public int getSubCategoriaID() {
        return this.subCategoriaID;
    }

    public void setSubCategoriaID(int subCategoriaID) {
        this.subCategoriaID = subCategoriaID;
    }
    
    
    
    public void setCategoriaID(int categoriaID) {
        this.categoriaID = categoriaID;
    }

    /**
     * @return the categoriaID
     */
    public int getCategoriaID() {
        return categoriaID;
    }

    
    
    
}
