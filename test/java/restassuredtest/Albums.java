package restassuredtest;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Albums {

    @Test
    public void  getAlbumApiExecution_ReturnSuccess(){
        given().accept("application/json")
                .contentType("application/json")
                .header("Authorization","Bearer BQC9PztK9BHkQILQiGIHb25YUulIaQ98CZAKh3q9rL-OIuBuuqCu0pA7Zl8sBreP3T1roHRbRWDisJS4eX3pu-o4jLc-wQCFUQXYcmyspYk2nlZFwtMJP3hK2WSQEg6Yp-IgsuBZ2jm9A2y0OiYlqkJSmD6xvmWVAZwa5PWCZKoiGZfztSy5JuTFrRyiivi_ZUM741qOIF-78gaSilGLdSxLcOmGB8ml_ihjnyGeFoLJunWDJG5q6G04ylUM7LThkYvdZDVBbOBc")
                .get("https://api.spotify.com/v1/albums/4aawyAB9vmqN3uQ7FjRGTy")
                .then()
                .log()
                .all()
                .statusCode(200);
    }

    @Test
    public void  getSeveralAlbumsApiExecution_ReturnSuccess(){
        given().accept("application/json")
                .contentType("application/json")
                .header("Authorization","Bearer BQDR-ndXI2IFtKdz6zU9B5-NQr-EJk4bqq2UlHIuhqt2p2vAsH_h73bM7V10JAr4-JtzfaiQp0HFNrHGrQIrrsNCHyo7kGwuNrnDihYuJbb6HBMppNQgIVxHBXJ2jUphUra7t_DQOzvVrtW3ACyurS3NlVmGi9HUVt8sEjDoP5ir-vszukNeoFYiwANkt2xrgCTLtwBSVqxR4jvP3n89acV2KH0d2E-MmfarSg7njt3UjK8D8jABLWXsrLCogYw")
                .get("https://api.spotify.com/v1/albums?ids=382ObEPsp2rxGrnsizN5TX%2C1A2GTWGtFfWp7KSQTwWOyo%2C2noRn2Aes5aoNVsU6iWThc")
                .then()
                .log()
                .all()
                .statusCode(200);
    }

    @Test
    public void  getAlbumTracksApiExecution_ReturnSuccess(){
        given().accept("application/json")
                .contentType("application/json")
                .header("Authorization","Bearer BQDR-ndXI2IFtKdz6zU9B5-NQr-EJk4bqq2UlHIuhqt2p2vAsH_h73bM7V10JAr4-JtzfaiQp0HFNrHGrQIrrsNCHyo7kGwuNrnDihYuJbb6HBMppNQgIVxHBXJ2jUphUra7t_DQOzvVrtW3ACyurS3NlVmGi9HUVt8sEjDoP5ir-vszukNeoFYiwANkt2xrgCTLtwBSVqxR4jvP3n89acV2KH0d2E-MmfarSg7njt3UjK8D8jABLWXsrLCogYw")
                .get("https://api.spotify.com/v1/albums/4aawyAB9vmqN3uQ7FjRGTy/tracks")
                .then()
                .log()
                .all()
                .statusCode(200);
    }


}
