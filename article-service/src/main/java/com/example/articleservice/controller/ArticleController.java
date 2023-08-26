package com.example.articleservice.controller;

import com.example.articleservice.dto.ArticleDto;
import com.example.articleservice.entity.Article;
import com.example.articleservice.service.ArticleService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api")
public class ArticleController {
    private final ArticleService articleService;

    @PostMapping("/article")
    public ResponseEntity<ArticleDto> createArticle(@RequestBody  Article article ){
        return new ResponseEntity<>(articleService.createArticle(article), HttpStatus.CREATED);
    }

    @GetMapping("/article/{articleId}")
    public ResponseEntity<ArticleDto> trackVersionByArticleId(@PathVariable String articleId){
        //your logic
        return null;
    }

    @GetMapping("/oldArticleId/{oldArticleId}/newArticleId/{newArticleId}")
    public ResponseEntity<List<ArticleDto>> compareArticle(@PathVariable String oldArticleId, @PathVariable String  newArticleId ){
        //your logic

        return null;
    }



}
