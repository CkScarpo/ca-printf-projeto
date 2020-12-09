package br.com.caprintf.sitecaprintf.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.caprintf.sitecaprintf.model.Post;
import br.com.caprintf.sitecaprintf.service.CAPrinftService;

@Controller
public class CAPrintfController {
    
    @Autowired
    CAPrinftService caPrinftService;

    @RequestMapping(value = "/posts", method = RequestMethod.GET)
    public ModelAndView getPosts() {
        
        ModelAndView mv = new ModelAndView("posts");
        List<Post> posts = caPrinftService.findAll();
        mv.addObject("posts", posts);
        return mv; 
    }

}
