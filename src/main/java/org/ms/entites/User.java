package org.ms.entites;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName="user",type="default")
public class User {

	@Id
	private int id; 
	String name;
	
	public User(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public User() {
		super();
	}
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
