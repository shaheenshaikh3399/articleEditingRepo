package com.example.articleservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class Article {
    @Id
    private String articleId;
    private String title;
    private String content;
    private String Author;
    private Status status;
    private String creationDate;
    private String lastModificationDate;
}
