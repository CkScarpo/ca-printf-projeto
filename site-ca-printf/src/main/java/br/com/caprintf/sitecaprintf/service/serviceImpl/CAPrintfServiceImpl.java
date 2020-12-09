package br.com.caprintf.sitecaprintf.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.caprintf.sitecaprintf.model.Post;
import br.com.caprintf.sitecaprintf.repository.CAPrintfRepository;
import br.com.caprintf.sitecaprintf.service.CAPrinftService;

//Service Bean Gerenciado pelo Spring
@Service
public class CAPrintfServiceImpl implements CAPrinftService {

    @Autowired
    CAPrintfRepository caPrintfRepository;

    @Override
    public List<Post> findAll() {

        return caPrintfRepository.findAll();
    }

    @Override
    public Post findByID(long id) {
       
        return caPrintfRepository.findById(id).get();
    }

    @Override
    public Post save(Post post) {
      
        return caPrintfRepository.save(post);
    }
    
}
