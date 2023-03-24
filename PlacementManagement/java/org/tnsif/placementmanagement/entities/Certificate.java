package org.tnsif.placementmanagement.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="certificate")
public class Certificate extends College{

@Id
private Integer id;

private Integer year;

//default constructor

public Certificate() {

super();

}

//parameterized constructor

public Certificate(Integer id, Integer year) {

super();

this.id = id;

this.year = year;

}

public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}

public Integer getYear() {
	return year;
}

public void setYear(Integer year) {
	this.year = year;
}




}