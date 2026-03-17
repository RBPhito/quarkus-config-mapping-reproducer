package com.example.repro;

import io.quarkus.test.common.WithTestResource;
import io.quarkus.test.junit.QuarkusTest;
import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

@QuarkusTest
@WithTestResource(DummyTestResource.class)
class AWithDummyResourceTest {

    @Test
    void helloWorksWithDummyResource() {
        RestAssured.when()
            .get("/hello")
            .then()
            .statusCode(200);
    }
}
