package restassuredtest;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Userprofile {
    @Test
    public void  getCurrentUserProfileApiExecution_ReturnSuccess(){
        given().accept("application/json")
                .contentType("application/json")
                .header("Authorization","Bearer BQBSo4L4zNu7Qj5T37VshExs4qZKGGHsZOK-9Wqpz4DQpjZcNAoJsEPj30XIKpZzU4a0Pwq2v37OdR_PVATRRJOzAxDcva9XcXGv8tvy9Ilp5AI_yCd8ICbVP7RS278K_A8A5ONclVuTchmRaMsAI_qE13VMnM5_lzPJIxxFQW3mXVZErMc-jwbJVZ89f5-TlIwQ825iv_JJGOKs8AHLzXylk337qTkKpjvl0pcPghmE7o6Uo3eA5eTiNixNqQA")
                .get("https://api.spotify.com/v1/users/zoxc2xf8fryo03o80iijr2m8r")
                .then()
                .log()
                .all()
                .statusCode(200);
    }

    @Test
    public void getCurrentUser_Id(){
        Response response = given().contentType("application/json")
                .accept("application/json")
                .header("Authorization","Bearer BQBSo4L4zNu7Qj5T37VshExs4qZKGGHsZOK-9Wqpz4DQpjZcNAoJsEPj30XIKpZzU4a0Pwq2v37OdR_PVATRRJOzAxDcva9XcXGv8tvy9Ilp5AI_yCd8ICbVP7RS278K_A8A5ONclVuTchmRaMsAI_qE13VMnM5_lzPJIxxFQW3mXVZErMc-jwbJVZ89f5-TlIwQ825iv_JJGOKs8AHLzXylk337qTkKpjvl0pcPghmE7o6Uo3eA5eTiNixNqQA")
                .get("https://api.spotify.com/v1/users/zoxc2xf8fryo03o80iijr2m8r");
        response.prettyPrint();
        String userId =response.path("id");
        System.out.println("userId :"+userId);

        String displayName = response.path("display_name");
        System.out.println("display name : "+displayName);
        //response.then().assertThat().statusCode(200);
        Assert.assertEquals(response.getStatusCode(),200);
    }

}
