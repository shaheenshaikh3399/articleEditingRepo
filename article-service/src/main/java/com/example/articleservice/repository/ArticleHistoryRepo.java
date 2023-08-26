package com.example.articleservice.repository;

import com.example.articleservice.entity.Article;
import com.example.articleservice.entity.ArticleHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleHistoryRepo extends JpaRepository<Article, String> {
}
