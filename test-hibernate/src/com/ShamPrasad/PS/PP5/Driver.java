package com.ShamPrasad.PS.PP5;


import org.hibernate.*;

public class Driver {
	public static void main( String args[]){
		 SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		 Session session = sessionFactory.getCurrentSession();
		 
	 	 Transaction t = session.beginTransaction();
     
		 Book book = new Book("Dare to go Solo","Elizabeth Boese");
		 session.save(book); 		 
		 book = new Book("Intro to Programming with Java Applets","James Bond");
		 session.save(book); 
		 book = new Book("game of throne","George");
		 session.save(book); 
		 book = new Book("book thief","someone");
		 session.save(book); 
		 book = new Book("book thief","someone123");
		 session.save(book);
		 
		 DVD dvd = new DVD("Dare to go Solo", 2000);
		 session.save(dvd);
		 dvd = new DVD("Intro to Programming", 2011);
		 session.save(dvd);
		 dvd = new DVD("Intro to Programming", 2015);
		 session.save(dvd);
		 dvd = new DVD("Dare to go Solo", 2006);
		 session.save(dvd);
		 dvd = new DVD("lord of rings",2003);
		 session.save(dvd);
		 
	    
		 
	     t.commit();
	     session.close();
	    
		}
}
