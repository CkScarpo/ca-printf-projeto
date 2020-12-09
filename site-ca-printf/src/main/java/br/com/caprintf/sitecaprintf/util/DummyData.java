package br.com.caprintf.sitecaprintf.util;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

//import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.caprintf.sitecaprintf.model.Post;
import br.com.caprintf.sitecaprintf.repository.CAPrintfRepository;

@Component
public class DummyData {
    
    @Autowired
    CAPrintfRepository caPrintfRepository;

    //@PostConstruct
    public void savepost() {

        List<Post> postList = new ArrayList<>();
        Post post1 = new Post();
        post1.setTitle("Teste");
        post1.setData(LocalDate.now());
        post1.setText("Primeiro Post");

        Post post2 = new Post();
        post2.setTitle("Teste2");
        post2.setData(LocalDate.now());
        post2.setText("Segundo Post");

        postList.add(post1);
        postList.add(post2);

        for (Post post: postList) {
            Post postSaved = caPrintfRepository.save(post);
            System.out.println(postSaved.getId());
        }
    }

}
