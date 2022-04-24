package com.example.news.Models;

import javax.persistence.*;

@Entity
public class ImageModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String filename;
    private Long size;
    private String contenttype;
    @Lob
    private byte[] bytes;

    public void setNewsModel(NewsModel newsModel) {
        this.newsModel = newsModel;
    }

    public NewsModel getNewsModel() {
        return newsModel;
    }

    @ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.EAGER)
    private NewsModel newsModel;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getFilename() {
        return filename;
    }

    public Long getSize() {
        return size;
    }

    public String getContenttype() {
        return contenttype;
    }

    public byte[] getBytes() {
        return bytes;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public void setContenttype(String contenttype) {
        this.contenttype = contenttype;
    }

    public void setBytes(byte[] bytes) {
        this.bytes = bytes;
    }

    public ImageModel(Long id, String name, String filename, Long size, String contenttype, byte[] bytes) {
        this.id = id;
        this.name = name;
        this.filename = filename;
        this.size = size;
        this.contenttype = contenttype;
        this.bytes = bytes;
    }

    public ImageModel() {
    }
}
