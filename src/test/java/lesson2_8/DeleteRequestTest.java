package lesson2_8;

import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;
import java.util.Collections;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.nullValue;

public class DeleteRequestTest extends BasePostmanEchoTest{

    @Test
    public void testDeleteRequest() {
        given()
                .when()
                .delete("/delete")
                .then()
                .statusCode(200)
                .contentType(ContentType.JSON)
                .body("args", equalTo(Collections.emptyMap()))
                .body("files", equalTo(Collections.emptyMap()))
                .body("form", equalTo(Collections.emptyMap()))
                .body("headers.host", equalTo("postman-echo.com"))
                .body("json", nullValue())
                .body("url", equalTo("https://postman-echo.com/delete"));
    }
}
