package com.surl.urlshortener.models;

import lombok.Data;
import lombok.NonNull;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@NonNull
@ToString
@Document("URLs")
public class Url {
    @Id
    private String id;
    private String url;
    private String surl;
    private LocalDateTime createdAt = LocalDateTime.now();
}
