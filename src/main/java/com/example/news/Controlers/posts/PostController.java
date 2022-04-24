package com.example.news.Controlers.posts;


import com.example.news.Models.NewsModel;
import com.example.news.Servises.posts.PostService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@Controller
public class PostController {

    final
    PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }



    @GetMapping("/{id}" )
    public String Post(@PathVariable long id,Model model){
        NewsModel newsModel = postService.getnewsbyid(id);
        model.addAttribute("news", newsModel);
        model.addAttribute("image",newsModel.getImageModels());
        return "allpost";
    }
}
