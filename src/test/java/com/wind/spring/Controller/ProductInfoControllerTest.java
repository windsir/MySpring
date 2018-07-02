package com.wind.spring.Controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.reactive.server.WebTestClient;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles("integTest")
public class ProductInfoControllerTest {

    @Autowired
    private WebTestClient api;

    @Test
    public void getAllProductInfo() {
        api.get()
                .uri("/product/getAllProductInfo")
                .exchange()
                .expectStatus().isOk()
                .expectBody()
                .jsonPath("$[0].productId").isEqualTo("7eecfe14-6e3c-4b3c-bc94-33663941416e")
                .jsonPath("$[1].productId").isEqualTo("f11e7e0c-f6f9-403c-80d2-49ad343fc8da")
                .jsonPath("$[2].productId")
                .isEqualTo("f1fdc57e-b72b-4b2b-9301-11a85cacef54");
    }
}