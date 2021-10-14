package principal;

import java.util.Iterator;

import Dominio.Categoria;
import repositorio.CategoriaRepositorio;

public class Programa {

	public static void main(String[] args) {
		
		CategoriaRepositorio reco = new CategoriaRepositorio("exemplo-jpa");
		reco.readAll();
		
		for (Categoria cat : reco.readAll()) {
			System.out.println(cat);
		}
	}

}
