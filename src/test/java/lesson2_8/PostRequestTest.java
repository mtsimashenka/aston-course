package lesson2_8;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;
import java.util.Collections;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.*;

public class PostRequestTest extends BasePostmanEchoTest{

    @Test
    public void testPostRequest() {
        String requestBody = "{\"hello\":\"postman\"}";

        Response response = given()
                .contentType(ContentType.JSON)
                .body(requestBody)
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .contentType(ContentType.JSON)
                .extract()
                .response();

        response.then()
                .body("args", equalTo(Collections.emptyMap()))
                .body("files", equalTo(Collections.emptyMap()))
                .body("form", equalTo(Collections.emptyMap()))
                .body("headers.host", equalTo("postman-echo.com"))
                .body("json.hello", equalTo("postman"))
                .body("url", equalTo("https://postman-echo.com/post"));

        assertEquals(200, response.getStatusCode());
        assertEquals("postman", response.jsonPath().getString("json.hello"));
        assertEquals("https://postman-echo.com/post", response.jsonPath().getString("url"));
        assertEquals("postman-echo.com", response.jsonPath().getString("headers.host"));

        assertTrue(response.jsonPath().getMap("args").isEmpty());
        assertTrue(response.jsonPath().getMap("files").isEmpty());
        assertTrue(response.jsonPath().getMap("form").isEmpty());
    }
}
