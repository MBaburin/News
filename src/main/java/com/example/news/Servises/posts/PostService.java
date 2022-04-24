package com.example.news.Servises.posts;

import com.example.news.Models.NewsModel;
import com.example.news.Repozitories.Newsrep;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class PostService {

    final
    Newsrep newsrep;

    public PostService(Newsrep newsrep) {
        this.newsrep = newsrep;
    }

    public NewsModel getnewsbyid(@PathVariable(value = "id") Long id){
        return newsrep.findById(id).orElse(null);
    }
}
