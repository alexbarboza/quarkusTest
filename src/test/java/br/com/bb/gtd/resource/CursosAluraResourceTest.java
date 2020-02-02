package br.com.bb.gtd.resource;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;

@QuarkusTest
public class CursosAluraResourceTest {

    @Test
    public void testCursoAluraEndpoint() {
        given()
          .when().get("/alura/cursos")
          .then()
             .statusCode(200)
             .body("$.size()", is(greaterThanOrEqualTo(1)),
                     "[0].id", is(not(0))
             );
    }

    @Test
    public void testCursoAluraAsyncEndpoint() {
        given()
        .when().get("/alura/cursos-async")
        .then()
            .statusCode(200)
            .body("$.size()", is(greaterThanOrEqualTo(1)),
                     "[0].id", is(not(0))
            );
        }
}