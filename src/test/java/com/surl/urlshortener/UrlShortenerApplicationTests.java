package com.surl.urlshortener;

import com.surl.urlshortener.services.SUrlService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UrlShortenerApplicationTests {

    @Autowired
    private SUrlService sUrlService;

    @Test
    void contextLoads() {
    }

}
