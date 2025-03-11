package PageObjects;

import Actions.WaitActions;
import Actions.WebElementActions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import static Actions.BaseActions.driver;

public class LoginPage {

    @FindBy(xpath = "//a[contains(.,'Sign In')]")
    public WebElement signInLink;

    @FindBy(xpath = "//input[contains(@placeholder,'Email Address')]")
    public WebElement emailTextBox;

    @FindBy(xpath = "//input[contains(@type,'password')]")
    public WebElement passwordTextBox;

    @FindBy(id = "login")
    public WebElement loginButton;

    @FindBy(xpath = "//span[contains(.,'The email must be a valid email address.')]")
    public WebElement validationMessage;


    public void clickSignInLink(){
        PageFactory.initElements(driver, this);
        WebElementActions.getActions().clickElement(signInLink);
    }

    public void enterEmailAddress(String emailValue){
        WebElementActions.getActions().inputText(emailTextBox,emailValue);
    }

    public void enterPassword(String passwordValue){
        WebElementActions.getActions().inputText(passwordTextBox,passwordValue);
    }

    public void clickLoginButton(){
        WebElementActions.getActions().clickElement(loginButton);
    }

    public Boolean verifyValidationVisible() throws InterruptedException {
        Thread.sleep(3000);
       Boolean result = validationMessage.isDisplayed();
       return result;
    }
}
