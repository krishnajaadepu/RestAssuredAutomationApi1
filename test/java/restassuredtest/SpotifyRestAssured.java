package restassuredtest;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class SpotifyRestAssured {

    @Test
public void  getCurrentUserProfileApiExecution_ReturnSuccess(){
    given().accept("application/json")
            .contentType("application/json")
            .header("Authorization","Bearer BQCIKDBrLuctO3Dq_CxoWE7_3icEN4AyP_tRiOikpVs1ZlHaNyXjdlUYH2waOs_71OHd0yaEDnES2OFuJg-kzrUB566kL2g-L4Bdfj2P5CIolG4_iI__jM8UQD-d_dz8APbP885PHRpdULXpKeyJEJf4QM0fyypYEzOrlWRkNQ63Q9WX9xwJhTOknR93WIVLuwvUtlKuuk07uJHz-ps4Zvm1crjYSdd7NIBsMwkxKGNeko5HeRxEUhYRprXfs3JHIEHbvPj4quIjlEfD-W14aJTS3b4rOiiEcOFVOP9Sg3Izr_tve19v")
            .get("https://api.spotify.com/v1/me")
            .then()
            .log()
            .all()
            .statusCode(200);
}
    String userId = "3cEYpjA9oz9GiPac4AsH4n";
    String playlistId;

  @Test
    public void getCurrentUser_Id(){
        Response response = given().contentType("application/json")
                .accept("application/json")
                .header("Authorization","Bearer BQCIKDBrLuctO3Dq_CxoWE7_3icEN4AyP_tRiOikpVs1ZlHaNyXjdlUYH2waOs_71OHd0yaEDnES2OFuJg-kzrUB566kL2g-L4Bdfj2P5CIolG4_iI__jM8UQD-d_dz8APbP885PHRpdULXpKeyJEJf4QM0fyypYEzOrlWRkNQ63Q9WX9xwJhTOknR93WIVLuwvUtlKuuk07uJHz-ps4Zvm1crjYSdd7NIBsMwkxKGNeko5HeRxEUhYRprXfs3JHIEHbvPj4quIjlEfD-W14aJTS3b4rOiiEcOFVOP9Sg3Izr_tve19v")
                .get("https://api.spotify.com/v1/me");
        response.prettyPrint();
        String userId =response.path("id");
        System.out.println("userId :"+userId);

        String displayName = response.path("display_name");
        System.out.println("display name : "+displayName);
        //response.then().assertThat().statusCode(200);
        Assert.assertEquals(response.getStatusCode(),200);

  }
  @Test
    public void createPlayList_ApiExecution_ThenReturn_OkStatus(){
        Response apiResult = given().contentType("application/json")
                .accept("application/json")
                .header("Authorization","Bearer BQCIKDBrLuctO3Dq_CxoWE7_3icEN4AyP_tRiOikpVs1ZlHaNyXjdlUYH2waOs_71OHd0yaEDnES2OFuJg-kzrUB566kL2g-L4Bdfj2P5CIolG4_iI__jM8UQD-d_dz8APbP885PHRpdULXpKeyJEJf4QM0fyypYEzOrlWRkNQ63Q9WX9xwJhTOknR93WIVLuwvUtlKuuk07uJHz-ps4Zvm1crjYSdd7NIBsMwkxKGNeko5HeRxEUhYRprXfs3JHIEHbvPj4quIjlEfD-W14aJTS3b4rOiiEcOFVOP9Sg3Izr_tve19v")
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
    public void removePlaylistItemsApiExecution_ReturnOkStatus(){
        given().accept("application/json")
                .contentType("application/json")
                .header("Authorization","Bearer BQAcfiEr_5rbcsOIVs6X_T-btNCZZF5z_l4bZNduLXs_jiktKjWf3i2A2sXvqpjqavxE46tdEeVaglvSH_OILSn6yRIXFRjz1pLNchkX5qSbcL19JPXEptAAZ7AAOQFXnXkHC-KqmssgWJ65Pgjnl8hBoBMq8EPgngzZwjWgpHOo7GYTwuL5n1jkqNIqMGNOX-hCwU9lOiQ4UxSRKCTn5_Jsc-8UaNb0H2W2uvVBceJ4T7yAo8vzlj2BsAfl7IzpkG5Vdz1VgE4ZeOL5iDYxTxL9PUeXYGNRVIAYedpQnnSo236gE_-N")
                .pathParam("playlist_id","6jMC2VGZdlpixZyrX9NP13")
                .body("{ \"tracks\": [{ \"uri\": \"spotify:track:4iV5W9uYEdYUVa79Axb7Rh\" },{ \"uri\": \"spotify:track:1301WleyT98MSxVHPZCA6M\" }] }")
                .when()
                .delete("https://api.spotify.com/v1/playlists/6jMC2VGZdlpixZyrX9NP13/tracks")
                .then()
                .log()
                .ifStatusCodeIsEqualTo(200);
    }
}
