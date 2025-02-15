package com.codewithshubham.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codewithshubham.blog.entities.Comment;

public interface CommentRepo  extends JpaRepository<Comment	, Integer> {

}
