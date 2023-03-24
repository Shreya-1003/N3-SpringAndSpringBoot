package org.tnsif.placementmanagement.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="college")
public class College {

@Id
private int id;
private String collegeName;
private String location;

public College() {

super();

}

public College(int id, String collegeName, String location) {

super();

this.id = id;

this.collegeName = collegeName;

this.location = location;

}

public Integer getId() {

return id;

}

public void setId(int id) {

this.id = id;

}

public String getCollegeName() {

return collegeName;

}

public void setCollegeName(String collegeName) {

this.collegeName = collegeName;

}

public String getLocation() {

return location;

}

public void setLocation(String location) {

this.location = location;

}

}

