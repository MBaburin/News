package com.example.news.Servises;

import com.example.news.Models.NewsModel;
import com.example.news.Repozitories.Newsrep;
import org.springframework.stereotype.Service;

@Service
public class HomeService {

    private final Newsrep newsrep;


    public HomeService(Newsrep newsrep) {
        this.newsrep = newsrep;
    }

    public Iterable<NewsModel> Home(){
        Iterable<NewsModel> news = newsrep.findAll();
        return news;
    }
}
