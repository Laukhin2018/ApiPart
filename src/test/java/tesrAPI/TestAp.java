package tesrAPI;

import com.jayway.restassured.http.ContentType;
import org.junit.Test;
import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.ValidatableResponse;
import com.jayway.restassured.specification.Argument;
import org.hamcrest.*;



import static com.jayway.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.equalTo;

public class TestAp {

    @Test
    public void part1Test2(){



        given().baseUri("https://www.wiley.com")
                .basePath("/en-us/search/autocomplete/comp_00001H9J")
                .queryParam("term" , "Java")
                .contentType(ContentType.JSON)
                .when()
                .get()
                .then()
                .body(containsString("<span class=\\\"search-highlight\\"));
//                .statusCode(200)
//                .extract().response().prettyPrint();

    }

    @Test
    public void part1Test3(){

        String baseUri = "https://www.wiley.com";
        String basePath = "/en-us/search/autocomplete/comp_00001H9J";


        given().baseUri(baseUri)
                .basePath(basePath)
                .queryParam("term" , "Java")
                .contentType(ContentType.JSON)
                .when()

                .get()
                .then()
                .body("code",equalTo("9781119235583"));
    }

}
