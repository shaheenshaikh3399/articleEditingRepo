package com.example.versioncontrolservice.controller;

import com.example.versioncontrolservice.Dto.ArticleDto;
import com.example.versioncontrolservice.Dto.VersionTrackingDto;
import com.example.versioncontrolservice.service.VersionTrackingService;
import jakarta.ws.rs.Path;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class VersionTrackingController {
    private final VersionTrackingService versionTrackingService;



    @GetMapping("/article/{articleId}")
    public ResponseEntity<VersionTrackingDto> trackVersionByArticleId(@PathVariable String articleId){
        return ResponseEntity.ok(versionTrackingService.trackVersionByArticleId(articleId));
    }
    @GetMapping("/oldArticleId/{oldArticleId}/newArticleId/{newArticleId}")
    public ResponseEntity<List<ArticleDto>> compareArticle(@PathVariable String oldArticleId, @PathVariable String  newArticleId ){
        return ResponseEntity.ok(versionTrackingService.compareArticle(oldArticleId, newArticleId));
    }

}
