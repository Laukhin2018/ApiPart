package tesrAPI;

import com.jayway.restassured.builder.RequestSpecBuilder;
import com.jayway.restassured.http.ContentType;
import org.junit.Test;
import com.jayway.restassured.RestAssured;
import org.hamcrest.*;
import pojoModel.SuggestionsItem;


import static com.jayway.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.Matchers.hasSize;

public class TestAp {



    @Test
    public void part2CheckTermCountAndConrain(){

        SuggestionsItem items = new SuggestionsItem();

        given().baseUri("https://www.wiley.com")
                .basePath("/en-us/search/autocomplete/comp_00001H9J")
                .queryParam("term" , "Java")
                .contentType(ContentType.JSON)
                .when()
                .get()
                .then()
                .body(containsString("<span class=\\\"search-highlight\\\">java</span>"))
                .body("suggestions.term", hasSize(4))
                .statusCode(200);
//               .extract().response().prettyPrint();

    }


    @Test
    public void part1Test3(){

        String baseUri = "https://www.wiley.com";
        String basePath = "/en-us/search/autocomplete/comp_00001H9J";
        SuggestionsItem tetms = new SuggestionsItem();

        String term;

        RestAssured.requestSpecification = new RequestSpecBuilder()
                .setBaseUri("https://www.wiley.com")
                .setBasePath("/en-us/search/autocomplete/comp_00001H9J")
                .setContentType(ContentType.JSON)
                .addQueryParameter("term" , "Java")
                .build();



        given()
                .when()
                .get()
                .then();

        term =  tetms.getTerm();
        System.out.println(term);
    }

    @Test
    public void part1Test4(){

        String baseUri = "https://www.wiley.com";
        String basePath = "/en-us/search/autocomplete/comp_00001H9J";


        given().baseUri(baseUri)
                .basePath(basePath)
                .formParam("term" , "Java")
                .contentType(ContentType.JSON)
                .when()
                .get()
                .then();
    }

}
