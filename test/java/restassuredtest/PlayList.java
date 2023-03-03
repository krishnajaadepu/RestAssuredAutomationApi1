package restassuredtest;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class PlayList {

    @Test
    public void GetUserPlaylists_Id(){
        Response response = given().contentType("application/json")
                .accept("application/json")
                .header("Authorization","Bearer BQAcfiEr_5rbcsOIVs6X_T-btNCZZF5z_l4bZNduLXs_jiktKjWf3i2A2sXvqpjqavxE46tdEeVaglvSH_OILSn6yRIXFRjz1pLNchkX5qSbcL19JPXEptAAZ7AAOQFXnXkHC-KqmssgWJ65Pgjnl8hBoBMq8EPgngzZwjWgpHOo7GYTwuL5n1jkqNIqMGNOX-hCwU9lOiQ4UxSRKCTn5_Jsc-8UaNb0H2W2uvVBceJ4T7yAo8vzlj2BsAfl7IzpkG5Vdz1VgE4ZeOL5iDYxTxL9PUeXYGNRVIAYedpQnnSo236gE_-N")
                .get("https://api.spotify.com/v1/users/zoxc2xf8fryo03o80iijr2m8r/playlists");
        response.prettyPrint();
        String userId =response.path("id");
        System.out.println("userId :"+userId);

        String displayName = response.path("display_name");
        System.out.println("display name : "+displayName);
        //response.then().assertThat().statusCode(200);
        Assert.assertEquals(response.getStatusCode(),200);

    }

    @Test
    public void GetPlaylists_Id(){
        Response response = given().contentType("application/json")
                .accept("application/json")
                .header("Authorization","Bearer BQAcfiEr_5rbcsOIVs6X_T-btNCZZF5z_l4bZNduLXs_jiktKjWf3i2A2sXvqpjqavxE46tdEeVaglvSH_OILSn6yRIXFRjz1pLNchkX5qSbcL19JPXEptAAZ7AAOQFXnXkHC-KqmssgWJ65Pgjnl8hBoBMq8EPgngzZwjWgpHOo7GYTwuL5n1jkqNIqMGNOX-hCwU9lOiQ4UxSRKCTn5_Jsc-8UaNb0H2W2uvVBceJ4T7yAo8vzlj2BsAfl7IzpkG5Vdz1VgE4ZeOL5iDYxTxL9PUeXYGNRVIAYedpQnnSo236gE_-N")
                .get("https://api.spotify.com/v1/playlists/62BrDrxSXpYdCwu0ABg4TX");
        response.prettyPrint();
        String playlistId =response.path("id");
        System.out.println("[playlistId :"+playlistId);

        String displayName = response.path("display_name");
        System.out.println("display name : "+displayName);
        //response.then().assertThat().statusCode(200);
        Assert.assertEquals(response.getStatusCode(),200);

    }

    @Test
    public void GetPlaylistsItems_Id(){
        Response response = given().contentType("application/json")
                .accept("application/json")
                .header("Authorization","Bearer BQAcfiEr_5rbcsOIVs6X_T-btNCZZF5z_l4bZNduLXs_jiktKjWf3i2A2sXvqpjqavxE46tdEeVaglvSH_OILSn6yRIXFRjz1pLNchkX5qSbcL19JPXEptAAZ7AAOQFXnXkHC-KqmssgWJ65Pgjnl8hBoBMq8EPgngzZwjWgpHOo7GYTwuL5n1jkqNIqMGNOX-hCwU9lOiQ4UxSRKCTn5_Jsc-8UaNb0H2W2uvVBceJ4T7yAo8vzlj2BsAfl7IzpkG5Vdz1VgE4ZeOL5iDYxTxL9PUeXYGNRVIAYedpQnnSo236gE_-N")
                .get("https://api.spotify.com/v1/playlists/62BrDrxSXpYdCwu0ABg4TX/tracks");
        response.prettyPrint();
        String playlistId =response.path("id");
        System.out.println("playlistId :"+playlistId);

        String displayName = response.path("display_name");
        System.out.println("display name : "+displayName);
        //response.then().assertThat().statusCode(200);
        Assert.assertEquals(response.getStatusCode(),200);

    }

    @Test
    public void  getCurrentUserProfile_Return_okStatus(){
        given().accept("application/json")
                .contentType("application/json")
                .header("Authorization","Bearer BQA_2mB1Z5QyeVa5lpZZrr3YRa5FN-J2P4BC_USnSVzc7rQHV4vsKYCssqiRuOVG8Y2dlvbS8tEm8m8yQ6e5w-29lEWCSjg8X9KJNLFsuoUljwNd54P0dlniyjuo0L_dPtsP-Gp0y3hriyZgKqIYgMjcLflvWW8QmkwN7pAaUxPDBA_UPTAcvSRykdhoBj-Uxzffl6xnlYgiI82kIihuIg3K0A3OOXlks2U9P6nr4nNwV85tmPC9jSclQLTZ7tu-C0N-8NDS8Lo_FyzRfFh3BzfJhA1E4RgNKr4KOzyuLA")
                .get("https://api.spotify.com/v1/me/playlists")
                .then()
                .log()
                .all()
                .statusCode(200);
    }

    @Test
    public void createPlayList_ApiExecution_ThenReturn_OkStatus(){
        Response apiResult = given().contentType("application/json")
                .accept("application/json")
                .header("Authorization","Bearer BQBXF9jYwa97DZP10FiRM3VuN6IhHdzGAMLwUY5cN9c5JBJZrVyO0vYivOFqxbfRnPwX3nkMFwzZ_rFbqQktHf1dzyCy7AJgkqE7vqE39WQmpoG-JG0RCYCbgBpPFhoiDqa-5D4OrGkcyt-wc-GHg1cvgf0Qc19AE1_AMbzMsXvEfTcK3e3Ij6My960nAct1fcbM6ncDZwSqEM5QT2oLULgYNVEmE3MZdMoTZWk5XZB_boo-XF444trLxc1w9yeS0BnnwY8RckXT2KyPDFMA1U43Qn6MIkqMVWKSWg-b2uV34A1tDdOhrSZsnqQo9Jc")
                .body("{\n" +
                        "  \"name\": \"New Playlist\",\n" +
                        "  \"description\": \"New playlist description\",\n" +
                        "  \"public\": false\n" +
                        "}")
                .when()
                .post("https://api.spotify.com/v1/users/zoxc2xf8fryo03o80iijr2m8r/playlists");
        apiResult.then().assertThat().statusCode(201);
    }
    @Test
    public void updatePlaylistItems_ApiExecutionReturnOkStatus(){
        given()
                .contentType("application/json")
                .accept("application/json")
                .header("Authorization","Bearer BQAcfiEr_5rbcsOIVs6X_T-btNCZZF5z_l4bZNduLXs_jiktKjWf3i2A2sXvqpjqavxE46tdEeVaglvSH_OILSn6yRIXFRjz1pLNchkX5qSbcL19JPXEptAAZ7AAOQFXnXkHC-KqmssgWJ65Pgjnl8hBoBMq8EPgngzZwjWgpHOo7GYTwuL5n1jkqNIqMGNOX-hCwU9lOiQ4UxSRKCTn5_Jsc-8UaNb0H2W2uvVBceJ4T7yAo8vzlj2BsAfl7IzpkG5Vdz1VgE4ZeOL5iDYxTxL9PUeXYGNRVIAYedpQnnSo236gE_-N")
                .pathParam("pId","3cEYpjA9oz9GiPac4AsH4n")
                .queryParam("uris","spotify:track:1HI6XHX1NeObXzAxtTuG8c")
                .body("{\n" +
                        "  \"range_start\": 1,\n" +
                        "  \"insert_before\": 3,\n" +
                        "  \"range_length\": 2\n" +
                        "}")
                .when()
                .put("https://api.spotify.com/v1/playlists/{pId}/tracks")
                .then()
                .log().ifStatusCodeIsEqualTo(201);
    }

    @Test
    public void changePlaylistItems_ApiExecutionReturnOkStatus(){
        given()
                .contentType("application/json")
                .accept("application/json")
                .header("Authorization","Bearer BQA_2mB1Z5QyeVa5lpZZrr3YRa5FN-J2P4BC_USnSVzc7rQHV4vsKYCssqiRuOVG8Y2dlvbS8tEm8m8yQ6e5w-29lEWCSjg8X9KJNLFsuoUljwNd54P0dlniyjuo0L_dPtsP-Gp0y3hriyZgKqIYgMjcLflvWW8QmkwN7pAaUxPDBA_UPTAcvSRykdhoBj-Uxzffl6xnlYgiI82kIihuIg3K0A3OOXlks2U9P6nr4nNwV85tmPC9jSclQLTZ7tu-C0N-8NDS8Lo_FyzRfFh3BzfJhA1E4RgNKr4KOzyuLA")
                .pathParam("pId","3cEYpjA9oz9GiPac4AsH4n")
                .body("{\n" +
                        "  \"name\": \"Updated Playlist Name\",\n" +
                        "  \"description\": \"Updated playlist description\",\n" +
                        "  \"public\": false\n" +
                        "}")
                .when()
                .put("https://api.spotify.com/v1/playlists/3cEYpjA9oz9GiPac4AsH4n")
                .then()
                .log().ifStatusCodeIsEqualTo(200);
    }

    @Test
    public void removePlaylistItemsApiExecution_ReturnOkStatus(){
        given().accept("application/json")
                .contentType("application/json")
                .header("Authorization","Bearer BQAcfiEr_5rbcsOIVs6X_T-btNCZZF5z_l4bZNduLXs_jiktKjWf3i2A2sXvqpjqavxE46tdEeVaglvSH_OILSn6yRIXFRjz1pLNchkX5qSbcL19JPXEptAAZ7AAOQFXnXkHC-KqmssgWJ65Pgjnl8hBoBMq8EPgngzZwjWgpHOo7GYTwuL5n1jkqNIqMGNOX-hCwU9lOiQ4UxSRKCTn5_Jsc-8UaNb0H2W2uvVBceJ4T7yAo8vzlj2BsAfl7IzpkG5Vdz1VgE4ZeOL5iDYxTxL9PUeXYGNRVIAYedpQnnSo236gE_-N")
                .pathParam("playlist_id","6jMC2VGZdlpixZyrX9NP13")
                .body("{ \"tracks\": [{ \"uri\": \"spotify:track:4iV5W9uYEdYUVa79Axb7Rh\" },{ \"uri\": \"spotify:track:1301WleyT98MSxVHPZCA6M\" }] }")
                .when()
                .delete("https://api.spotify.com/v1/playlists/{playlist_id}/tracks")
                .then()
                .log()
                .ifStatusCodeIsEqualTo(200);
    }

}
