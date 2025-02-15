package com.codewithshubham.blog.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.*;

@Entity
@Data
public class Role {

	@Id	
	private int id;
	
	private String name;
}
