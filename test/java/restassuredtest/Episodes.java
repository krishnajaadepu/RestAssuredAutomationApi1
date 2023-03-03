package restassuredtest;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Episodes {
    @Test
    public void getEpisode_Id(){
        Response response = given().contentType("application/json")
                .accept("application/json")
                .header("Authorization","Bearer BQC6sUKsmCOVi9ScLtOqYfO89oYp92FU680TlnLAZ3GWBSlt4TH-qbK1xBrfNn83ROb71MwUqaw5k6wOct5zBbwEjdiMUhUI77GjJ1P04NjDWNylp9ElsN0n7TZ8t5p21Xn4NVjvlExRvHqheS9x8ixCioacXWX9zASNejYfQDxlMVPdWSn-1v0AWvSZ5xvLF7Vvt-GTcXOFO6hsVppccQVR2s5vy3jtpd_lbslNtEXUqDo454ZVUk-wiQbr4VD0d7_oAuzypoWnRUYJ-9Uo3YmOMp3XlY06t7ZV6_CBA8vZEI_gmf9U6m8PsVZCIcNwFOqFGyU1TQ")
                .get("https://api.spotify.com/v1/episodes/512ojhOuo1ktJprKbVcKyQ");
        response.prettyPrint();
        String userId =response.path("id");
        System.out.println("userId :"+userId);

        String displayName = response.path("display_name");
        System.out.println("display name : "+displayName);
    }


    @Test
    public void getSeveralEpisode_Id(){
        Response response = given().contentType("application/json")
                .accept("application/json")
                .header("Authorization","Bearer BQC6sUKsmCOVi9ScLtOqYfO89oYp92FU680TlnLAZ3GWBSlt4TH-qbK1xBrfNn83ROb71MwUqaw5k6wOct5zBbwEjdiMUhUI77GjJ1P04NjDWNylp9ElsN0n7TZ8t5p21Xn4NVjvlExRvHqheS9x8ixCioacXWX9zASNejYfQDxlMVPdWSn-1v0AWvSZ5xvLF7Vvt-GTcXOFO6hsVppccQVR2s5vy3jtpd_lbslNtEXUqDo454ZVUk-wiQbr4VD0d7_oAuzypoWnRUYJ-9Uo3YmOMp3XlY06t7ZV6_CBA8vZEI_gmf9U6m8PsVZCIcNwFOqFGyU1TQ")
                .get("https://api.spotify.com/v1/episodes");
        response.prettyPrint();
        String userId =response.path("id");
        System.out.println("userId :"+userId);

        String displayName = response.path("display_name");
        System.out.println("display name : "+displayName);

    }

}
