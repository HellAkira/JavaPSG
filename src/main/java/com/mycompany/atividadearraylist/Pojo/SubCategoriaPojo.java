package com.mycompany.atividadearraylist.Pojo;

import java.util.ArrayList;


public class SubCategoriaPojo extends CamposComuns
{
    private int subCategoriaID;
    private int categoriaID;
    
    private ArrayList<ProdutoPojo> produtos;


    public int getSubCategoriaID() {
        return this.subCategoriaID;
    }

    public void setSubCategoriaID(int subCategoriaID) {
        this.subCategoriaID = subCategoriaID;
    }
    
    
    
    public void setCategoriaID(int categoriaID) {
        this.categoriaID = categoriaID;
    }

    public ArrayList<ProdutoPojo> getProdutos() {
        return this.produtos;
    }

    /**
     * @return the categoriaID
     */
    public int getCategoriaID() {
        return categoriaID;
    }

    
    
    
}
