package br.com.caprintf.sitecaprintf.repository;

import br.com.caprintf.sitecaprintf.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CAPrintfRepository extends JpaRepository<Post, Long> {

    
    
}