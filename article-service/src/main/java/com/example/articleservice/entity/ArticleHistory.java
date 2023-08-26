package com.example.articleservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class ArticleHistory {
    @Id
    private String articleId;
    private String userId;
    private String title;
    private String content;
    private Status status;
    private Date creationDate;
    private Date lastModificationDate;
    private String currentVersionId;
}
