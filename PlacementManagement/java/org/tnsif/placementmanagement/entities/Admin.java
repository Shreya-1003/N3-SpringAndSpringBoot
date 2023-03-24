package org.tnsif.placementmanagement.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="admin")
public class Admin {

@Id
private long id;

private String name;

private String password;

//default constructor

public Admin() {

super();

// TODO Auto-generated constructor stub

}

//parameterized constructor

public Admin(long id, String name, String password) {

super();

this.id = id;

this.name = name;

this.password = password;

}

//getters and setters

public long getId() {

return id;

}

public void setId(long id) {

this.id = id;

}

public String getName() {

return name;

}

public void setName(String name) {

this.name = name;

}

public String getPassword() {

return password;

}

public void setPassword(String password) {

this.password = password;

}

}
