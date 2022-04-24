package com.example.news.Controlers.posts;

import com.example.news.Repozitories.Newsrep;
import com.example.news.Servises.posts.EditService;
import com.example.news.Servises.posts.PostService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class EditControler {

    final
    PostService postService;

    private final Newsrep newsrep;

    public EditControler(Newsrep newsrep, EditService editService, PostService postService) {
        this.newsrep = newsrep;
        this.editService = editService;
        this.postService = postService;
    }

    final
    EditService editService;

    @GetMapping("/{id}/edit" )
    public String PostUp(@PathVariable(value = "id") long id, Model model){
        model.addAttribute("news", postService.getnewsbyid(id));
        return "editpost";
    }

    @PostMapping("/{id}/edit" )
    public String PostUp(@PathVariable(value = "id") long id, @RequestParam String name, @RequestParam String text, Model model){
        editService.editpost(id, name, text);
        return"redirect:/{id}";
    }


}
