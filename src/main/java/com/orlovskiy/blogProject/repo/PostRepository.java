package com.orlovskiy.blogProject.repo;

import com.orlovskiy.blogProject.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository <Post, Long> {

}
