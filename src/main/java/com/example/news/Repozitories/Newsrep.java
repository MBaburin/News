package com.example.news.Repozitories;

import com.example.news.Models.NewsModel;
import org.springframework.data.repository.CrudRepository;


public interface Newsrep extends CrudRepository<NewsModel, Long>{

}
