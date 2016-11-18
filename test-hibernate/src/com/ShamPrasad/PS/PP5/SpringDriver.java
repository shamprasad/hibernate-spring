package com.ShamPrasad.PS.PP5;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDriver {
	public static void main( String args[]){
		ApplicationContext context = new ClassPathXmlApplicationContext("PS_spring.xml");
	     
		 Book book_spring = (Book) context.getBean("Book");
		 System.out.println(book_spring.getAuthor());
	}
}
