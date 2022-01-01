package com.manikit.git.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {

	@Id
	private Long id;
	private String name;
	private String desc;
	
	public User() {
		System.out.println("No-arg constructor..");
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", desc=" + desc + "]";
	}
	
	

}
