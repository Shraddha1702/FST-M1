package RestAPI;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class Activity9 {
	// Set base URL
	final static String ROOT_URI = "https://petstore.swagger.io/v2/pet";

	@Test
	public void addNewPet() throws FileNotFoundException {
	    // Import JSON file
	    FileInputStream inputJSON = new FileInputStream("src/RESTAPI/input.json");
	    // Read JSON file as String
	    String reqBody = inputJSON.toString();

	    Response response = 
	        given().contentType(ContentType.JSON) // Set headers
	        .body(reqBody) // Pass request body from file
	        .when().post(ROOT_URI); // Send POST request

	    // Print response
	    String body = response.getBody().asPrettyString();
	    System.out.println(body);
	}
}
