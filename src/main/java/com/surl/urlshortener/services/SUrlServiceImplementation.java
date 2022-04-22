package com.surl.urlshortener.services;

import com.surl.urlshortener.dtos.Url.requests.ShortenUrlRequestDto;
import com.surl.urlshortener.dtos.Url.responses.ShortenUrlResponseDto;
import com.surl.urlshortener.models.Url;
import com.surl.urlshortener.repository.SUrlRepository;
import com.surl.urlshortener.utils.UrlModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SUrlServiceImplementation implements SUrlService{

    @Autowired
    private SUrlRepository repository;

    @Override
    public SUrlRepository fetchRepository() {
        return repository;
    }

    @Override
    public ShortenUrlResponseDto shortenedUrlResponse(ShortenUrlRequestDto shortenUrlRequest) {
        Url url = UrlModelMapper.map(shortenUrlRequest);
        Url shortenUrl = repository.save(url);
        return UrlModelMapper.map(shortenUrl);
    }
}
