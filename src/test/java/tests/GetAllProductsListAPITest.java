package tests;

import static org.hamcrest.Matchers.notNullValue;
import org.junit.jupiter.api.Test;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;

public class GetAllProductsListAPITest {

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
