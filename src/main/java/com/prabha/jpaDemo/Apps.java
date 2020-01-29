package com.prabha.jpaDemo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class Apps 
{
    public static void main( String[] args )
    {
    
    	//EntityManager is an impl. EntityManagerFactory is the class
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
    	EntityManager em = emf.createEntityManager();
       
    	// Fetching the data from the database
    	family F = em.find(family.class, 2);
    	System.out.println(F);
}
}