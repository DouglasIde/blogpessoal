package com.generation.blogpessoal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.blogpessoal.model.Post;

public interface IPostRepository extends JpaRepository<Post, Long> {

}
