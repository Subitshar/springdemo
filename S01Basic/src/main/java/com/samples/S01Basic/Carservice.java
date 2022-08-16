package com.samples.S01Basic;

import java.util.Set;

public class Carservice {
private int id;
private Set <String> name;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public Set<String> getName() {
	return name;
}
public void setName(Set<String> name) {
	this.name = name;
}
@Override
public String toString() {
	return "Carservice [id=" + id + ", name=" + name + "]";
}


}
