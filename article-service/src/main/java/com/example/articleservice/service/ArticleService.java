package com.example.articleservice.service;

import com.example.articleservice.dto.ArticleDto;
import com.example.articleservice.entity.Article;

public interface ArticleService {
    ArticleDto createArticle(Article article);
}
