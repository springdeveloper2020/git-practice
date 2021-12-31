package com.manikit.git.entities;

import javax.persistence.Entity;

@Entity
public class User {

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

}
