package com.esprit.microservice;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Cours implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;


    @Id
    @GeneratedValue
    int id;
    int idUser;
    
    String title;
    String description;
    String categorie;
    String author;

	public Cours() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Cours(int idUser, String title, String description, String categorie, String author) {
		super();
		this.idUser = idUser;
		this.title = title;
		this.description = description;
		this.categorie = categorie;
		this.author = author;
	}



	public Cours(int id, int idUser, String title, String description, String categorie, String author) {
		super();
		this.id = id;
		this.idUser = idUser;
		this.title = title;
		this.description = description;
		this.categorie = categorie;
		this.author = author;
	}



	@Override
	public String toString() {
		return "Cours [id=" + id + ", idUser=" + idUser + ", title=" + title + ", description=" + description
				+ ", categorie=" + categorie + ", author=" + author + "]";
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public int getIdUser() {
		return idUser;
	}



	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public String getCategorie() {
		return categorie;
	}



	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}



	public String getAuthor() {
		return author;
	}



	public void setAuthor(String author) {
		this.author = author;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}

   
}

