package lesson2_8;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;

public class BasePostmanEchoTest {
    @BeforeAll
    public static void setup() {
        RestAssured.baseURI = "https://postman-echo.com";
    }
}
