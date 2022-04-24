package com.example.news.Servises.posts;

import com.example.news.Repozitories.Newsrep;
import org.springframework.stereotype.Service;

@Service
public class DeleteService {
    public final Newsrep newsrep;

    public DeleteService(Newsrep newsrep) {
        this.newsrep = newsrep;
    }

    public void delete(Long id){
        newsrep.deleteById(id);
    }

}
