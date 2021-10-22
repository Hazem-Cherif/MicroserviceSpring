package com.esprit.microservice;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Microskills {
    /**
    *
    */
   private static final long serialVersionUID = 1L;


   @Id
   @GeneratedValue
   int id;
   int idUser;
   String Name;
   public Microskills() {
		super();
		// TODO Auto-generated constructor stub
	}
   
public Microskills(int idUser, String name) {
	super();
	this.idUser = idUser;
	Name = name;
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
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public static long getSerialversionuid() {
	return serialVersionUID;
}
public Microskills(int id, int idUser, String name) {
	super();
	this.id = id;
	this.idUser = idUser;
	Name = name;
}
@Override
public String toString() {
	return "Microskills [id=" + id + ", idUser=" + idUser + ", Name=" + Name + "]";
}
   

}
