package com.prabha.jpaDemo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class updateTable {
	
	public static void main(String args[]) {
		
	family Fa = new family();
	
	//EntityManager is an impl. EntityManagerFactory is the class
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
	EntityManager em = emf.createEntityManager();
	
	//Setting the row in family entity
	Fa.setMid(5);
	Fa.setMgender("female");
	Fa.setMname("chellamaal");
	
	// To update & commit in the database
	em.getTransaction().begin();
	em.persist(Fa);
	em.getTransaction().commit();
	System.out.println(Fa);
}
}
