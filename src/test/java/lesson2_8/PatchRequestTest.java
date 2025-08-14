package lesson2_8;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;
import java.util.Collections;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PatchRequestTest extends BasePostmanEchoTest{

    @Test
    public void testPatchRequest() {
        String requestBody = "{\"hello\":\"postman\",\"method\":\"patch\"}";

        Response response = given()
                .contentType(ContentType.JSON)
                .body(requestBody)
                .when()
                .patch("/patch")
                .then()
                .statusCode(200)
                .contentType(ContentType.JSON)
                .extract()
                .response();

        assertEquals(200, response.getStatusCode());
        String data = response.jsonPath().getString("data");
        assertTrue(data.contains("hello") && data.contains("postman") && data.contains("method") && data.contains("patch"));
        assertEquals("postman", response.jsonPath().getString("json.hello"));
        assertEquals("patch", response.jsonPath().getString("json.method"));
        assertEquals("https://postman-echo.com/patch", response.jsonPath().getString("url"));
        assertTrue(response.jsonPath().getMap("args").isEmpty());
        assertTrue(response.jsonPath().getMap("files").isEmpty());
        assertTrue(response.jsonPath().getMap("form").isEmpty());
        assertEquals("postman-echo.com", response.jsonPath().getString("headers.host"));

        response.then()
                .body("args", equalTo(Collections.emptyMap()))
                .body("files", equalTo(Collections.emptyMap()))
                .body("form", equalTo(Collections.emptyMap()))
                .body("headers.host", equalTo("postman-echo.com"))
                .body("json.hello", equalTo("postman"))
                .body("json.method", equalTo("patch"))
                .body("url", equalTo("https://postman-echo.com/patch"));
    }
}
