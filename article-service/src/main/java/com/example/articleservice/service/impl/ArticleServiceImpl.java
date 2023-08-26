package com.example.articleservice.service.impl;

import com.example.articleservice.dto.ArticleDto;
import com.example.articleservice.entity.Article;
import com.example.articleservice.repository.ArticleHistoryRepo;
import com.example.articleservice.repository.ArticleRepository;
import com.example.articleservice.service.ArticleService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@AllArgsConstructor
@Slf4j
public class ArticleServiceImpl implements ArticleService {
    private final ArticleRepository articleRepository;
    private final ArticleHistoryRepo articleHistoryRepo;
    @Override
    public ArticleDto createArticle(Article article) {
        log.info("Inside CreateArticle ");
        article.setArticleId(UUID.randomUUID().toString());
        Article article1= articleRepository.save(article);
        articleHistoryRepo.save(article);

        return mapToDto(article1);
    }
    public ArticleDto mapToDto(Article article){
        return ArticleDto.builder()
                .articleId(article.getArticleId())
                .title(article.getTitle())
                .status(article.getStatus())
                .userId(article.getUserId())
                .content(article.getContent())
                .creationDate(article.getCreationDate())
                .currentVersionId(article.getCurrentVersionId())
                .lastModificationDate(article.getLastModificationDate())
                .build();
    }
}
