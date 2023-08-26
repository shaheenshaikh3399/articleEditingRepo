package com.example.versioncontrolservice.service;

import com.example.versioncontrolservice.Dto.ArticleDto;
import com.example.versioncontrolservice.Dto.VersionTrackingDto;
import com.example.versioncontrolservice.Dto.VersionTrackingResponse;
import com.example.versioncontrolservice.entity.VersionTracking;

import java.util.List;

public interface VersionTrackingService {


    VersionTrackingDto trackVersionByArticleId(String arcticleId);


    List<ArticleDto> compareArticle(String oldArticleId, String newArticleId);
}
