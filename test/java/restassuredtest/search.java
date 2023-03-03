package restassuredtest;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class search {
    @Test
    public void  getCurrentUserProfileApiExecution_ReturnSuccess()
     {
        given().accept("application/json")
                .contentType("application/json")
                .header("Authorization", "Bearer BQAkG99JDyX0Ww5EdFVuCsKAOn2OZc-jU0GxpQZFXvDiDsQBf8uMTRMQkeAJ01JhMAlE8z3pyDYHYFZWbH1e8g0RzNP8R9tao4pAOwCarBZZXIDtVy_HKSf15cOxVA0K4uFcf9Dh4an9rdkxEEkBRzZmJMdthLKcGzALqBTxtXv_DpCLpZEgIwyDuvCjwfQr-Nnmogqpq66jcI9YW1QgXnmX56AHLz4N2jP52TYBHkodXH4K5YrExrqerCLcg64")
                .get("https://api.spotify.com/v1/search")
                .then()
                .log()
                .all()
                .statusCode(200);
    }
}