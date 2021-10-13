package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {

		inserir();
		
	}
		private static void inserir() {
			Pessoa p1 = new Pessoa(null,"Jao","jao@gmail.com");
			Pessoa p2 = new Pessoa(null,"Maria","Maria@gmail.com");
			Pessoa p3 = new Pessoa(null,"Marcos","Marcos@gmail.com");
			
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
			EntityManager em = emf.createEntityManager();
			
			em.getTransaction().begin();
			em.persist(p1);
			em.persist(p2);
			em.persist(p3);
			em.getTransaction().commit();
			em.close();
			emf.close();
			
			
			System.out.println(p1);
			System.out.println(p2);
			System.out.println(p3);
			System.out.println("Finalizado");

		}
}
