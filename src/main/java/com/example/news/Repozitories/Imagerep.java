package com.example.news.Repozitories;


import com.example.news.Models.ImageModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Imagerep extends JpaRepository<ImageModel, Long> {
}
