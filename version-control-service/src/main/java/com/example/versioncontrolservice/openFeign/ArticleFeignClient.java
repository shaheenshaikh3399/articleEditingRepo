package com.example.versioncontrolservice.openFeign;

import com.example.versioncontrolservice.Dto.ArticleDto;
import jakarta.ws.rs.Path;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name="ARTICLE-SERVICE", path="/api")
public interface ArticleFeignClient {
    @GetMapping("/article/{articleId}")
    public ResponseEntity<ArticleDto> trackArticleById(@PathVariable String articleId);

    @GetMapping("/oldArticleId/{articleId1}/newArticleId/{articleId2}")
    public ResponseEntity<List<ArticleDto>> compareArticleById(@PathVariable String articleId1, @PathVariable String articleId2);

}
