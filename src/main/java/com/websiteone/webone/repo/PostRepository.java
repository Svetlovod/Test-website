package com.websiteone.webone.repo;

import com.websiteone.webone.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {

}
