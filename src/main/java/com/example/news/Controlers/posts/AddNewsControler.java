package com.example.news.Controlers.posts;


import com.example.news.Models.NewsModel;
import com.example.news.Servises.posts.AddService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;


@Controller
public class AddNewsControler {

    private final AddService addService;

    public AddNewsControler(AddService addService) {
        this.addService = addService;
    }

    @GetMapping("/add")
    public String addnews(){
        return "addpage";

    }

    @PostMapping("/add")
    public String postaddnews(
            @RequestParam("file") MultipartFile file, NewsModel newsModel)throws IOException {
        addService.addnews(newsModel, file);
        return "redirect:/";
    }


}
