package com.example.repro;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

@QuarkusTest
class BWithoutDummyResourceTest {

    @Test
    void helloWorksWithoutDummyResource() {
        RestAssured.when()
            .get("/hello")
            .then()
            .statusCode(200);
    }
}
