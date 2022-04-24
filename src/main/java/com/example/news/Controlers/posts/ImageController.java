package com.example.news.Controlers.posts;

import com.example.news.Models.ImageModel;
import com.example.news.Repozitories.Imagerep;
import lombok.RequiredArgsConstructor;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.ByteArrayInputStream;

@RestController
@RequiredArgsConstructor
public class ImageController {
    private final Imagerep imagerep;

    @GetMapping("/images/{id}")
    private ResponseEntity<?> getImageById(@PathVariable Long id){
        ImageModel imageModel = imagerep.findById(id).orElse(null);
        assert imageModel != null;
        return ResponseEntity.ok()
                .header("fileName", imageModel.getFilename())
                .contentType(MediaType.valueOf(imageModel.getContenttype()))
                .contentLength(imageModel.getSize())
                .body(new InputStreamResource(new ByteArrayInputStream(imageModel.getBytes())));
    }
}
