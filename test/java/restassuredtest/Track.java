package restassuredtest;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Track {
    @Test
    public void  getTrackApiExecution_ReturnSuccess(){
        given().accept("application/json")
                .contentType("application/json")
                .header("Authorization","Bearer BQD1eNk7RnBv1H3uaDXhXKswXGceaZcpPXgU8S-pytntQd0d47jpPByVWvSF5OSUJoZEeLNm834mXKQzLXyiHONYfex4aLe52X1XtFo9Q3TEoieOmCnh1zqgMVt-Vvie2ssOjCPP25Wdt29ymhz7twvbYgPsjMHZqgyNGpsRwWe_FKLvCZSSIBw_d7fLA-j2iu4ELgbYe8W2EK5YhgqFXIyETOvObsDiDtCMBMcIzEiMtzwUihjZcL2DWBXBfc4")
                .get("https://api.spotify.com/v1/tracks/11dFghVXANMlKmJXsNCbNl")
                .then()
                .log()
                .all()
                .statusCode(200);
    }


    @Test
    public void  getTrackAudioFeaturesApiExecution_ReturnSuccess(){
        given().accept("application/json")
                .contentType("application/json")
                .header("Authorization","Bearer BQD1eNk7RnBv1H3uaDXhXKswXGceaZcpPXgU8S-pytntQd0d47jpPByVWvSF5OSUJoZEeLNm834mXKQzLXyiHONYfex4aLe52X1XtFo9Q3TEoieOmCnh1zqgMVt-Vvie2ssOjCPP25Wdt29ymhz7twvbYgPsjMHZqgyNGpsRwWe_FKLvCZSSIBw_d7fLA-j2iu4ELgbYe8W2EK5YhgqFXIyETOvObsDiDtCMBMcIzEiMtzwUihjZcL2DWBXBfc4")
                .get("https://api.spotify.com/v1/audio-features/11dFghVXANMlKmJXsNCbNl")
                .then()
                .log()
                .all()
                .statusCode(200);
    }


    @Test
    public void  getSeveralTracksApiExecution_ReturnSuccess(){
        given().accept("application/json")
                .contentType("application/json")
                .header("Authorization","Bearer BQD1eNk7RnBv1H3uaDXhXKswXGceaZcpPXgU8S-pytntQd0d47jpPByVWvSF5OSUJoZEeLNm834mXKQzLXyiHONYfex4aLe52X1XtFo9Q3TEoieOmCnh1zqgMVt-Vvie2ssOjCPP25Wdt29ymhz7twvbYgPsjMHZqgyNGpsRwWe_FKLvCZSSIBw_d7fLA-j2iu4ELgbYe8W2EK5YhgqFXIyETOvObsDiDtCMBMcIzEiMtzwUihjZcL2DWBXBfc4")
                .get("https://api.spotify.com/v1/tracks?ids=74ASZWbe4lXaubB36ztrGX%2C08td7MxkoHQkXnWAYD8d6Q")
                .then()
                .log()
                .all()
                .statusCode(200);
    }
}
