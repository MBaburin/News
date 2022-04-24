package com.example.news.Controlers;

import com.example.news.Models.NewsModel;
import com.example.news.Servises.HomeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Homecontroller {

    private final HomeService homeService;

    public Homecontroller(HomeService homeService) {
        this.homeService = homeService;
    }

    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("news", homeService.Home());
        return "home";
    }
}
