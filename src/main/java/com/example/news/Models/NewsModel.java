package com.example.news.Models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class NewsModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    @Lob
    private String text;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "newsModel")
    private List<ImageModel> imageModels = new ArrayList<>();

    public void setImageModels(List<ImageModel> imageModels) {
        this.imageModels = imageModels;
    }

    public List<ImageModel> getImageModels() {
        return imageModels;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getText() {
        return text;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Object addImage(ImageModel imageModel){
        imageModel.setNewsModel(this);
        imageModels.add(imageModel);
        return null;
    }


    public NewsModel(String name, String text){
        this.name = name;
        this.text = text;
    }

    public NewsModel() {
    }

}
