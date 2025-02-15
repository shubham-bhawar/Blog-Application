package com.codewithshubham.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codewithshubham.blog.entities.Role;

public interface RoleRepo  extends JpaRepository<Role, Integer>{

}
