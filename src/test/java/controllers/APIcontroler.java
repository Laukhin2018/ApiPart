package controllers;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.builder.RequestSpecBuilder;
import com.jayway.restassured.http.ContentType;
import pojoModel.SuggestionsItem;
import static io.restassured.RestAssured.given;




public class APIcontroler {

    public APIcontroler(){
        RestAssured.requestSpecification = new RequestSpecBuilder()
                .setBaseUri("https://www.wiley.com")
                .setBasePath("/en-us/search/autocomplete/comp_00001H9J")
                .setContentType(ContentType.JSON)
                .addQueryParameter("term" , "Java")
                .build();
    }

    public SuggestionsItem getJsons(SuggestionsItem tetms){
        return given()
                .when()
                .get()
                .as(SuggestionsItem.class);
    }
}
