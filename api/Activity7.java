package RestAPI;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class Activity7 {
	// Set base URL
	String ROOT_URI = "https://petstore.swagger.io/v2/pet/{petId}/uploadImage";

	@Test
	public void addPetImage() {
	    // Get file to upload
	    File petImage = new File("src/test/resources/pet_cat.jpg");
	    Response response = given().multiPart(petImage) // Add image to upload
	        .pathParam("petId", "77232") // Set petId parameter
	        .when().post(ROOT_URI); // Send POST request

	    // Print response
	    System.out.println(response.asPrettyString());

	    // Assertion
	    response.then().body("code", equalTo(200));
	}

	private ResponseAwareMatcher<Response> equalTo(int i) {
		// TODO Auto-generated method stub
		return null;
	}
}
