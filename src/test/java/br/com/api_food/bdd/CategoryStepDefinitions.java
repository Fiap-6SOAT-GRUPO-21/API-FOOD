package br.com.api_food.bdd;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;

import java.util.UUID;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class CategoryStepDefinitions {


    private Response response;
    private final String ENDPOINT = "http://localhost:8088/category";
    private UUID categoryId;

    @Given("a category has already been created")
    public void a_category_has_already_been_created() {
        categoryId = UUID.fromString("d8897bbb-868c-4163-b4c8-2e6baf356683");
    }

    @When("the category identifier is received")
    public void the_category_identifier_is_received() {
        response = given()
                .contentType(MediaType.APPLICATION_JSON_VALUE)
                .when()
                .get(ENDPOINT + "/{id}", categoryId.toString());
    }

    @Then("the category details are returned")
    public void the_category_details_are_returned() {
        response.then()
                .statusCode(HttpStatus.OK.value())
                .body("id", equalTo(categoryId.toString()))
                .body("name", equalTo("Lanche"));
    }
}
