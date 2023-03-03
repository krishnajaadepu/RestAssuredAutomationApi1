package restassuredtest;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class market {
    @Test
    public void  getAvailableMarketsApiExecution_ReturnSuccess(){
        given().accept("application/json")
                .contentType("application/json")
                .header("Authorization","Bearer BQD1eNk7RnBv1H3uaDXhXKswXGceaZcpPXgU8S-pytntQd0d47jpPByVWvSF5OSUJoZEeLNm834mXKQzLXyiHONYfex4aLe52X1XtFo9Q3TEoieOmCnh1zqgMVt-Vvie2ssOjCPP25Wdt29ymhz7twvbYgPsjMHZqgyNGpsRwWe_FKLvCZSSIBw_d7fLA-j2iu4ELgbYe8W2EK5YhgqFXIyETOvObsDiDtCMBMcIzEiMtzwUihjZcL2DWBXBfc4")
                .get("https://api.spotify.com/v1/markets")
                .then()
                .log()
                .all()
                .statusCode(200);
    }
}
