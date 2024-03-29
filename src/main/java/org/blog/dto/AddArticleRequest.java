package org.blog.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.blog.domain.Article;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class AddArticleRequest {
    private String title;
    private String content;

    public Article toEntity(String author) { // DTO to Entity
        return Article.builder()
                .title(title)
                .content(content)
                .author(author)
                .build();
    }
}
