package com.surl.urlshortener.repository;

import com.surl.urlshortener.models.Url;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SUrlRepository extends MongoRepository<Url, String> {

}
