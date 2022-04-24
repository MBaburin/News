package com.example.news.Servises.posts;

import com.example.news.Models.NewsModel;
import com.example.news.Repozitories.Newsrep;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class EditService {

    final
    Newsrep newsrep;

    public EditService(Newsrep newsrep) {
        this.newsrep = newsrep;
    }

    public void editpost(@PathVariable(value = "id") long id, @RequestParam String name, @RequestParam String text){
        NewsModel news = newsrep.findById(id).orElseThrow();
        news.setName(name);
        news.setText(text);
        newsrep.save(news);
    }


}
