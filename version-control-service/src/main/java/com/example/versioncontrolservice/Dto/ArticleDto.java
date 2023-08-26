package com.example.versioncontrolservice.Dto;

import com.example.versioncontrolservice.entity.Status;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ArticleDto {
    private String articleId;
    private String title;
    private String content;
    private String Author;
    private Status status;
    private String creationDate;
    private String lastModificationDate;
    private String currentVersionId;
    private UserDto userDetails;
}
