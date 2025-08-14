package lesson2_8;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;
import java.util.Collections;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PutRequestTest extends BasePostmanEchoTest{

    @Test
    public void testPutRequest() {
        String requestBody = "{\"hello\":\"postman\",\"method\":\"put\"}";

        Response response = given()
                .contentType(ContentType.JSON)
                .body(requestBody)
                .when()
                .put("/put")
                .then()
                .statusCode(200)
                .contentType(ContentType.JSON)
                .extract()
                .response();

        assertEquals(200, response.getStatusCode());

        String data = response.jsonPath().getString("data");
        assertTrue(data.contains("hello") && data.contains("postman") && data.contains("method") && data.contains("put"));
        assertEquals("postman", response.jsonPath().getString("json.hello"));
        assertEquals("put", response.jsonPath().getString("json.method"));
        assertEquals("https://postman-echo.com/put", response.jsonPath().getString("url"));
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
                .body("json.method", equalTo("put"))
                .body("url", equalTo("https://postman-echo.com/put"));
    }
}
