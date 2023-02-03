package org.example.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class P01_LoginPage {

    public P01_LoginPage(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    // TODO: Define Page elements

    @AndroidFindBy(xpath = "//android.widget.Button[@index='4']")
    private WebElement createAccountButton;

    @AndroidFindBy(xpath = "//android.widget.EditText[@index='1']")
    private WebElement email;

    @AndroidFindBy(xpath = "//android.widget.EditText[@index='2']")
    private WebElement password;

    @AndroidFindBy(xpath = "//android.widget.Button[@index='3']")
    private WebElement loginButton;

    public void clickCreateAccountButton(){
        createAccountButton.click();
    }

    public void login(String email,String password){
        this.email.sendKeys(email);
        this.password.sendKeys(password);
        loginButton.click();
    }
}
