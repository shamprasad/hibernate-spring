package com.ShamPrasad.PS.PP5;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
@Entity
@Table(name="PS_DVD", catalog="PS_PP5")

public class DVD {

	@Id
	private String title;
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
