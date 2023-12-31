package com.example.articleservice.repository;

import com.example.articleservice.entity.Article;
import com.example.articleservice.entity.ArticleHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, String> {
}
