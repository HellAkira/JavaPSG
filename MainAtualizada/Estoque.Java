package Main;

public class Estoque{

    public void testar()
{
    Categoria cat = new Categoria();
    cat.setCategoriaID(1);
    SubCategoria subCat = new SubCategoria(cat); 
    subCat.setSubCategoriaID(1);
    Produto prod = new Produto(subCat);
    prod.setProdutoID(1);
}
    public void testeComVetor {

        Categoria categorias[] = new Categoria[3];
        SubCategoria subCategorias[][] = new SubCategoria[3][3];
        Produto produto[][][] = new Produto[3][3][3];


        for(int x = 0; x = 3; x++){
            categoria[x] = new Categoria();
            categoria[x].setDescricao("Categoria " + x);

           }



      


    }



}