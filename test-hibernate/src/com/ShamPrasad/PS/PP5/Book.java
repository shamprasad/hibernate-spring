package com.ShamPrasad.PS.PP5;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
@Entity
@Table(name="PS_Book", catalog="PS_PP5")

public class Book {

	@Id
	private String title;
	private String author ;
	
	public Book (){
		
	}
	
	public Book (String title, String author){
		this.title = title;
		this.author = author;
	}
	@Column(name = "title", length = 50)
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Column(name = "author", length = 50)
	public String getAuthor() {
		return this.author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}



	
}
