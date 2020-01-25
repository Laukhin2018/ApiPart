package tesrAPI;

import com.jayway.restassured.builder.RequestSpecBuilder;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.path.json.JsonPath;
import org.junit.Test;
import com.jayway.restassured.RestAssured;
import org.hamcrest.*;
import pojoModel.SuggestionsItem;


import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import static com.jayway.restassured.RestAssured.given;
import static com.jayway.restassured.RestAssured.requestSpecification;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.startsWith;
import static org.junit.Assert.assertThat;

public class TestAp {



    @Test
    public void part2CheckTermCountAndConrain(){

        SuggestionsItem items = new SuggestionsItem();


        String termFilds = "suggestions.term";

        ArrayList chekedString = new ArrayList();
        for (int x = 0; x < 4; x++){
            chekedString.add("<span class=\\\"search-highlight\\\">java</span>");
        }

        given().baseUri("https://www.wiley.com")
                .basePath("/en-us/search/autocomplete/comp_00001H9J")
                .queryParam("term" , "Java")
                .contentType(ContentType.JSON)
                .when()
                .get()
                .then()
                .body(containsString("<span class=\\\"search-highlight\\\">java</span>"))
                .body("suggestions.term", hasSize(4))
                .body("suggestions.term", allOf(containsString("<span class=")))
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
    public void part1TestA(){

        RestAssured.requestSpecification = new RequestSpecBuilder()
                .setBaseUri("https://www.wiley.com")
                .setBasePath("/en-us/search/autocomplete/comp_00001H9J")
                .setContentType(ContentType.JSON)
                .addQueryParameter("term" , "Java")
                .build();

        String responseString = given()
                .when()
                .get()
                .asString();

        JsonPath responseSuggestions = new JsonPath(responseString).setRoot("suggestions");
        List tern = responseSuggestions.get("term");

        // point 1
        System.out.println("Check count fields \"tern\"");
        checkCountObject(tern);

        String checkedStringTern = "<span class=\"search-highlight\">java</span>";
        System.out.println("Check fields \"tern\" on start " + checkedStringTern);
        checkStartWith(checkedStringTern, tern);
        System.out.println("");


        // point 2
        JsonPath responseProduct = new JsonPath(responseString).setRoot("products");
        List name = responseProduct.get("name");

        System.out.println("Check count fields \"name\"");
        checkCountObject(name);

        String checkedStringName = "<span class='search-highlight'>Java</span>";
        System.out.println("Check fields \"name\" contain " + checkedStringName);
        checkContainsString(checkedStringName, name);
        System.out.println("");


        // point 3
        JsonPath responsePages = new JsonPath(responseString).setRoot("pages");
        List title = responsePages.get("title");

        System.out.println("Check count fields \"title\"");
        checkCountObject(title);

        String checkedStringTitle = "Wiley";
        System.out.println("Check fields \"title\" contain " + checkedStringTitle);
        checkContainsString(checkedStringTitle, title);
        System.out.println("");

    }

    public static void checkCountObject(List item){
        int countItem = item.size();
        if(countItem == 4){
            System.out.println("Success! Count Name fields " + countItem);
        }
        else{
            System.out.println("Fail! Count Name fields " + countItem);
        }
    }

    public static void checkStartWith(String inputString, List checkObject){
        try{

            for(Object item : checkObject){
                String i = item.toString();
                assertThat(i, startsWith(inputString));
            }
            System.out.println("Success!! All fields start with string " + inputString);
        }
        catch (AssertionError error){
            System.out.println("Fail! String not start with " + inputString);
        }
    }

    public static void checkContainsString(String inputString, List checkObject){
        try{

            for(Object item : checkObject){
                String i = item.toString();
                assertThat(i, containsString(inputString));
            }
            System.out.println("Success!! All String contains with " + inputString);
        }
        catch (AssertionError error){
            System.out.println("Fail! fields not start with " + inputString);
        }
    }

}
