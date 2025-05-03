package org.QAFITAutomationClass2025.testSauceDemo;

import com.github.fge.jsonschema.cfg.ValidationConfiguration;
import com.github.fge.jsonschema.main.JsonSchemaFactory;
import io.restassured.RestAssured;
import org.QAFITAutomationClass2025.SauceDemoProject.Pages.SauceDemoPage;
import org.QAFITAutomationClass2025.TestBase;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import static com.github.fge.jsonschema.SchemaVersion.DRAFTV4;
import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static io.restassured.module.jsv.JsonSchemaValidatorSettings.settings;
import static org.hamcrest.Matchers.*;

public class SauceDemoLoginTest extends TestBase {

   WebDriver driver;

    @Test
   public void testSauceDemoStandardLogin(){ //Standard user Login Test
        //TestSteps

        TestBase testBase = new TestBase();
        testBase.setUp("firefox");
         //TestSteps
       SauceDemoPage sauceDemoPage = new SauceDemoPage();
       sauceDemoPage.inputUserName("standard_user");
       sauceDemoPage.inputPassword("secret_sauce");
       sauceDemoPage.clickLoginButton();
       sauceDemoPage.getConfirmLoginText();

   }
   @Test
    public void testSauceDemoLockedOutUserLogin(){ //Locked out user Login Test
        //TestSteps
       TestBase testBase = new TestBase();
       testBase.setUp("firefox");

        SauceDemoPage sauceDemoPage = new SauceDemoPage();
        sauceDemoPage.inputUserName("locked_out_user");
        sauceDemoPage.inputPassword("secret_sauce");
        sauceDemoPage.clickLoginButton();
        sauceDemoPage.getLockedOutUserText();


   }

   //RestAssured API Test
   @Test
    public void testGETSchool(){
       RestAssured.baseURI = "https://qatest.qafit.at";
         given()
                .get("/api/v1") //get end point
                .then()
                .statusCode(200)
                .body("message", equalTo("Welcome to the School API."))
                .log().all();
   }

   @Test
    public void testRegisterAUser(){
        RestAssured.baseURI = "https://qatest.qafit.at";
       //post end point
       //assertion
       given()
               .header("Content-Type", "application/json")
               .body("{\n" +
                       "    \"username\": \"fgsdgsdg\",\n" +
                       "    \"password\": \"myPassword\"\n" +
                       "}")
               .post("api/v1/auth/register") //post end point
               .then()
               .statusCode(201)
               .body("message", equalTo("You have successfully signed up"    //assertion
               ), "token", notNullValue())
                .log().all();
    }

    //test for schema Validation


    @Test
    public void testSchemaValidation() {
        JsonSchemaFactory jsonSchemaFactory = JsonSchemaFactory.newBuilder().setValidationConfiguration(ValidationConfiguration.newBuilder().setDefaultVersion(DRAFTV4).freeze()).freeze();
        jsonSchemaFactory.getValidator();
        given()
                .baseUri("https://qatest.qafit.at")
                .header("Content-Type", "application/json")
                .body("{\n" +
                        "    \"username\": \"folowcat\",\n" +
                        "    \"password\": \"passweeplate\"\n" +
                        "}")
                .when()
                .post("/api/v1/auth/register")
                .then()
                .statusCode(201)
                .body("message", equalTo("You have successfully signed up"))
                .body("token", notNullValue())
                .log().all()
                .body(matchesJsonSchemaInClasspath("schema.json") //validate schema against response
                        .using(settings().with().checkedValidation(false)));
    }

}


    //Test for problem_user
    //performance_glitch_user



