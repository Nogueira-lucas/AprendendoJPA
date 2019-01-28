package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa p1 = new Pessoa(null, "Lucas", "lucas@gmail.com", "123543323");
		Pessoa p2 = new Pessoa(null, "Maria", "maria@gmail.com", "434232343");
		Pessoa p3 = new Pessoa(null, "João", "jão@gmail.com", "543323443");
	
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("aprendendo-jpa");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.getTransaction().commit();
		System.out.println("Pronto!");
	}

}
