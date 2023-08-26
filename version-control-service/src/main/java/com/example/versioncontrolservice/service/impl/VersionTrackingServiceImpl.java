package com.example.versioncontrolservice.service.impl;

import com.example.versioncontrolservice.Dto.ArticleDto;
import com.example.versioncontrolservice.Dto.VersionTrackingDto;
import com.example.versioncontrolservice.exception.GlobalExceptionHandler;
import com.example.versioncontrolservice.openFeign.ArticleFeignClient;
import com.example.versioncontrolservice.repository.VersionTrackingRepo;
import com.example.versioncontrolservice.service.VersionTrackingService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
@Slf4j
public class VersionTrackingServiceImpl implements VersionTrackingService {
    private final VersionTrackingRepo versionTrackingRepo;

    private final ArticleFeignClient articleFeignClient;

    @Override
    //@CircuitBreaker(name="${spring.application.name}", fallbackMethod = "getDefaultArticle")

    public VersionTrackingDto trackVersionByArticleId(String arcticleId) {

        ArticleDto articleDto = articleFeignClient.trackArticleById(arcticleId).getBody();
        if(articleDto.getUserDetails().getRole().equals("Author") || articleDto.getUserDetails().getRole().equals("Editor")) {
            return VersionTrackingDto.builder()
                    .versionId(articleDto.getCurrentVersionId())
                    .articleId(articleDto)
                    .build();
        }
        else {
            throw new GlobalExceptionHandler(String.format("Your role doest not have a permission to track the details!!"));
        }

    }

    @Override
    public List<ArticleDto> compareArticle(String oldArticleId, String newArticleId) {
        List<ArticleDto> response =  articleFeignClient.compareArticleById(oldArticleId,newArticleId).getBody();
        return response;
    }


}
