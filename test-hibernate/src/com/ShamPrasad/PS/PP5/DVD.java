package com.ShamPrasad.PS.PP5;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.IdClass;
import java.io.Serializable;
@Entity
@Table(name="PS_DVD", catalog="PS_PP5")

@IdClass(DVD.class)
public class DVD implements Serializable{

	@Id
	private String title;
	@Id
	private int year ;
	
	public DVD(){
		
	}
	public DVD(String title,int year){
		this.title = title;
		this.year = year;
	}
	@Column(name = "title", length = 50)
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Column(name = "year", length = 50)
	public int getYear() {
		return this.year;
	}

	public void setYear(int year) {
		this.year = year;
	}



	
}
