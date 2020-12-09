package br.com.caprintf.sitecaprintf.service;

import java.util.List;

import br.com.caprintf.sitecaprintf.model.Post;

public interface CAPrinftService {

    List<Post> findAll();
    Post findByID(long id);
    Post save(Post post);
    
}