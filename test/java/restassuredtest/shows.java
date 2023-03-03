package restassuredtest;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class shows {
    @Test
    public void  getShowApiExecution_ReturnSuccess(){
        given().accept("application/json")
                .contentType("application/json")
                .header("Authorization","Bearer BQCGiMyo_OgnTMQLMkMK27mwE471uqwdcHengdkEXMj_jR28wwL7yL0i58rhms_OhMxlrsJfr7bLboHWjr1cizu8XvIKNLhZs9avFdfK4YSiXC6nbMjvdrp9Eie5g8TEC9XJXa0jZMZX38gST28cM8T6vtXVP30mn38RKmF7WGEz2-r3dEFS2pkvasIPYaP_1L7n3VuuuPI4Li7HI0d1_WdAK2_NF8wL7EmT7KQDWfHrJQoQi5poNjxuGUtnWOZiW6HfvfLfqH8KkZWanARxoJo")
                .get("https://api.spotify.com/v1/shows/38bS44xjbVVZ3No3ByF1dJ")
                .then()
                .log()
                .all()
                .statusCode(200);
    }

    @Test
    public void  getShowEpisodesApiExecution_ReturnSuccess(){
        given().accept("application/json")
                .contentType("application/json")
                .header("Authorization","Bearer BQCGiMyo_OgnTMQLMkMK27mwE471uqwdcHengdkEXMj_jR28wwL7yL0i58rhms_OhMxlrsJfr7bLboHWjr1cizu8XvIKNLhZs9avFdfK4YSiXC6nbMjvdrp9Eie5g8TEC9XJXa0jZMZX38gST28cM8T6vtXVP30mn38RKmF7WGEz2-r3dEFS2pkvasIPYaP_1L7n3VuuuPI4Li7HI0d1_WdAK2_NF8wL7EmT7KQDWfHrJQoQi5poNjxuGUtnWOZiW6HfvfLfqH8KkZWanARxoJo")
                .get("https://api.spotify.com/v1/shows/38bS44xjbVVZ3No3ByF1dJ/episodes")
                .then()
                .log()
                .all()
                .statusCode(200);
    }

    @Test
    public void  getSeveralShowApiExecution_ReturnSuccess(){
        given().accept("application/json")
                .contentType("application/json")
                .header("Authorization","Bearer BQCGiMyo_OgnTMQLMkMK27mwE471uqwdcHengdkEXMj_jR28wwL7yL0i58rhms_OhMxlrsJfr7bLboHWjr1cizu8XvIKNLhZs9avFdfK4YSiXC6nbMjvdrp9Eie5g8TEC9XJXa0jZMZX38gST28cM8T6vtXVP30mn38RKmF7WGEz2-r3dEFS2pkvasIPYaP_1L7n3VuuuPI4Li7HI0d1_WdAK2_NF8wL7EmT7KQDWfHrJQoQi5poNjxuGUtnWOZiW6HfvfLfqH8KkZWanARxoJo")
                .get("https://api.spotify.com/v1/shows")
                .then()
                .log()
                .all()
                .statusCode(200);
    }
}
