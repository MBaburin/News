package com.example.news.Servises.posts;
import com.example.news.Models.ImageModel;
import com.example.news.Models.NewsModel;
import com.example.news.Repozitories.Newsrep;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;


@Service
public class AddService {
    public final Newsrep newsrep;

    public AddService(Newsrep newsrep) {
        this.newsrep = newsrep;
    }

    public void addnews(NewsModel newsModel, MultipartFile file) throws IOException {
        ImageModel image;
        if(file.getSize() !=0){
            image = toImageEntity(file);
            newsModel.addImage(image);
        }
        newsrep.save(newsModel);
    }

    private ImageModel toImageEntity(MultipartFile file) throws IOException {
        ImageModel imageModel = new ImageModel();
        imageModel.setName(file.getName());
        imageModel.setFilename(file.getOriginalFilename());
        imageModel.setSize(file.getSize());
        imageModel.setBytes(file.getBytes());
        return imageModel;
    }


}


