package com.surl.urlshortener.controller;

import com.surl.urlshortener.dtos.Url.requests.ShortenUrlRequestDto;
import com.surl.urlshortener.dtos.Url.responses.ApiResponse;
import com.surl.urlshortener.repository.SUrlRepository;
import com.surl.urlshortener.services.SUrlService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/surl/")
@AllArgsConstructor
public class SUrlController {
    @Autowired
    private SUrlService sUrlService;

    @GetMapping("/shortenedurls")
    public SUrlRepository fetchRepository() {
        return sUrlService.fetchRepository();
    }

    @PostMapping("/shortenurl")
        public ResponseEntity<?> shortenedUrlResponse(@RequestBody ShortenUrlRequestDto shortenUrlRequest){
        try{
            return new ResponseEntity<String>(SUrlService.shortenedUrlResponse(shortenUrlRequest), HttpStatus.CREATED);
        } catch (RuntimeException e) {
            return new ResponseEntity<String>(new ApiResponse<>());
        }
        return ;
    }
}
