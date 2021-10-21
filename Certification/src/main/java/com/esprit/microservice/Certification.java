package com.esprit.microservice;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Certification implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;


    @Id
    @GeneratedValue
    int id;

    String instituteName;

    String courseName;
    
    String address;
    
    String duration;
    
    String instructorName;
    
    Date date ;
    
    String studentName;

	public Certification() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getInstituteName() {
		return instituteName;
	}

	public void setInstituteName(String instituteName) {
		this.instituteName = instituteName;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getInstructorName() {
		return instructorName;
	}

	public void setInstructorName(String instructorName) {
		this.instructorName = instructorName;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Certification(String instituteName, String courseName, String address, String duration,
			String instructorName, Date date, String studentName) {
		super();
		this.instituteName = instituteName;
		this.courseName = courseName;
		this.address = address;
		this.duration = duration;
		this.instructorName = instructorName;
		this.date = date;
		this.studentName = studentName;
	}


	

   
}

