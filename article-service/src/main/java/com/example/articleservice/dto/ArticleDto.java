package com.example.articleservice.dto;

import com.example.articleservice.entity.Status;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class ArticleDto {
    private String articleId;
    private String  userId;
    private String title;
    private String content;
    private Status status;
    private Date creationDate;
    private Date lastModificationDate;
    private String currentVersionId;

}
