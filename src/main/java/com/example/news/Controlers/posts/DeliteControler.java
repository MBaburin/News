package com.example.news.Controlers.posts;

import com.example.news.Servises.posts.DeleteService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class DeliteControler {

    private final DeleteService deleteservice;

    public DeliteControler(DeleteService deleteservice) {
        this.deleteservice = deleteservice;
    }

    @PostMapping("/{id}/delete" )
    public String PostUp(@PathVariable long id){
        deleteservice.delete(id);
        return"redirect:/";
    }
}