package org.tnsif.placementmanagement.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Student")
public class Student {

	
	@Id
	private Integer id;
	private String name;
	private Integer rollno;
	private String qualification;
	private String course;
	private Integer year;
	private Integer hallticket;
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}


	

	public Student(Integer id, String name, Integer rollno, String qualification, String course, Integer year,
			Integer hallticketno) {
		super();
		this.id = id;
		this.name = name;
		this.rollno = rollno;
		this.qualification = qualification;
		this.course = course;
		this.year = year;
		this.hallticket = hallticket;
	}




	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", rollno=" + rollno + ", qualification=" + qualification
				+ ", course=" + course + ", year=" + year + ", hallticketno=" + hallticket + "]";
	}




	public Integer getId() {
		return id;
	}




	public void setId(Integer id) {
		this.id = id;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public Integer getRollno() {
		return rollno;
	}




	public void setRollno(Integer rollno) {
		this.rollno = rollno;
	}




	public String getQualification() {
		return qualification;
	}




	public void setQualification(String qualification) {
		this.qualification = qualification;
	}




	public String getCourse() {
		return course;
	}




	public void setCourse(String course) {
		this.course = course;
	}




	public Integer getYear() {
		return year;
	}




	public void setYear(Integer year) {
		this.year = year;
	}




	public Integer getHallticket() {
		return hallticket;
	}




	public void setHallticketno(Integer hallticketno) {
		this.hallticket = hallticket;
	}

	
	
}
