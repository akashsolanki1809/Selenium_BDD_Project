package StepDefinitions;

import PageObjects.DemoFormPage;
import PageObjects.LoginPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.util.List;

public class LoginSteps {

    LoginPage loginPage;
    List<List<String>> data;

    @Given("User is on Practice page")
    public void userOnPracticePage(){
        loginPage= new LoginPage();
    }

    @When("User click on sign in link")
    public void userClickSignInLink(){
        loginPage.clickSignInLink();
    }
    @And("User enter email address")
    public void enterEmailAddress(DataTable tableValue){
        data=tableValue.asLists();
        loginPage.enterEmailAddress(data.get(1).get(0));
    }

    @And("User enter password")
    public void enterPasswordValue(DataTable tableValue){
        data=tableValue.asLists();
        loginPage.enterPassword(data.get(1).get(0));
    }

    @And("User click on login button")
    public void clickLoginButton(){
        loginPage.clickLoginButton();
    }
    @Then("User verified validation message visible")
    public void verifyValidation() throws InterruptedException {
        Assert.assertTrue(loginPage.verifyValidationVisible());
    }




}
