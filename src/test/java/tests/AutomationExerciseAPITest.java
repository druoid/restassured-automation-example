package tests;

import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class AutomationExerciseAPITest {

    @Test
    public void testGetAllProducts() {
        RestAssured.baseURI = "https://automationexercise.com";

        given().
        when().
            get("/api/productsList").
        then().
            statusCode(200).
            body("products", notNullValue()); // Validate response contains a "products" array
    }
}
