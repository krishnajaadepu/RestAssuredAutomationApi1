package Jsonserverapis;

import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class JsonServerApi {

    @Test
    public void getPosts_returnOkStatus(){
        Response getResult = given().contentType("application/json")
                .accept("application/json")
                .when()
                .get("http://localhost:3000/posts");
                getResult.prettyPrint();
                getResult.then().assertThat().statusCode(200);
    }
    @Test
    public void getSpecificPost_returnOkStatus(){
        Response getResult = given().contentType("application/json")
                .accept("application/json")
                .when()
                .get("http://localhost:3000/posts");
        getResult.prettyPrint();
        getResult.then().assertThat().statusCode(200);
    }
    @Test
    public void createPost_ResultOkStatus(){
        given().contentType("application/json")
                .accept("application/json")
                .body("{" +
                        "      \"title\": \"json-server\",\n" +
                        "      \"author\": \"krishnaja\",\n" +
                        "      \"id\": 5\n" +
                        "    }")
                .when()
                .post("http://localhost:3000/posts");

    }
    @Test
    public void updatePost_ResultOkStatus(){
        given()
                .contentType("application/json")
                .accept("application/json")
                .when()
                .put("http://localhost:3000/posts/")
                .then()
                .log().ifStatusCodeIsEqualTo(200);
    }


    @Test
    public void getComment_returnOkStatus(){
        Response getResult = given().contentType("application/json")
                .accept("application/json")
                .when()
                .get("http://localhost:3000/comments");
        getResult.prettyPrint();
        getResult.then().assertThat().statusCode(200);
    }


    @Test
    public void createComment_returnOkStatus(){
        Response getResult = given().contentType("application/json")
                .accept("application/json")
                .when()
                .post("http://localhost:3000/comments");
    }

    @Test
    public void updateComment_ResultOkStatus(){
        given()
                .contentType("application/json")
                .accept("application/json")
                .when()
                .put("http://localhost:3000/comments")
                .then()
                .log().ifStatusCodeIsEqualTo(200);
    }

    @Test
    public void deleteComment_ReturnOkStatus(){
        given().accept("application/json")
                .contentType("application/json")
                .when()
                .delete("http://localhost:3000/comments")
                .then()
                .log()
                .ifStatusCodeIsEqualTo(200);
    }
    @Test
    public void getProfile_returnOkStatus(){
        Response getResult = given().contentType("application/json")
                .accept("application/json")
                .when()
                .get("http://localhost:3000/profile");
        getResult.prettyPrint();
        getResult.then().assertThat().statusCode(200);
    }

    @Test
    public void createProfile_returnOkStatus(){
        Response getResult = given().contentType("application/json")
                .accept("application/json")
                .body("{\n" +
                        "    \"name\": \"postman\"\n" +
                        "  }")
                .when()
                .post("http://localhost:3000/profile");
    }

    @Test
    public void updateProfile_ResultOkStatus(){
        given()
                .contentType("application/json")
                .accept("application/json")
                .body("{\n" +
                        "    \"name\": \"postman\"\n" +
                        "}")
                .when()
                .put("http://localhost:3000/profile")
                .then()
                .log().ifStatusCodeIsEqualTo(200);
    }

    @Test
    public void deleteProfile_ReturnOkStatus(){
        given().accept("application/json")
                .contentType("application/json")
                .when()
                .delete("http://localhost:3000/profile")
                .then()
                .log()
                .ifStatusCodeIsEqualTo(200);
    }
}
