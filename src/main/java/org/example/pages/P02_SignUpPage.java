package org.example.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class P02_SignUpPage {

    public P02_SignUpPage(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    // TODO: Define Page elements

    @AndroidFindBy(id = "input_fullName")
    private WebElement firstName;

    @AndroidFindBy(xpath = "(//android.widget.Spinner[@index='1'])[1]")
    private WebElement gender;

    @AndroidFindBy(xpath = "(//android.widget.Spinner[@index='1'])[2]")
    private WebElement bloodGroup;

    @AndroidFindBy(id = "inputMobile")
    private WebElement mobile;

    @AndroidFindBy(id = "inputAddress")
    private WebElement address;

    @AndroidFindBy(xpath = "(//android.widget.Spinner[@index='1'])[3]")
    private WebElement division;

    @AndroidFindBy(id = "input_userEmail")
    private WebElement email;

    @AndroidFindBy(id = "input_password")
    private WebElement password;

    @AndroidFindBy(id = "input_password_confirm")
    private WebElement confirmPassword;

    @AndroidFindBy(xpath = "//android.widget.CheckBox[@index['10']]")
    private WebElement makeDonor;

    @AndroidFindBy(xpath = "//android.widget.Button[@index='11']")
    private WebElement registerButton;

    public void fillUserData(AndroidDriver<AndroidElement> driver,String firstName , String mobile , String address , String email , String password, String confirmPassword) throws InterruptedException {
        this.firstName.sendKeys(firstName);
        setGender(driver);
        setBloodGroup(driver);
        this.mobile.sendKeys(mobile);
        this.address.sendKeys(address);
        setDivision(driver);
        this.email.sendKeys(email);
        this.password.sendKeys(password);
        this.confirmPassword.sendKeys(confirmPassword);
        PageBase.scrollToViewText(driver,"Register");
//        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"" +
//                "Register\"));").click();
        this.makeDonor.click();
        this.registerButton.click();
    }

    private void setGender(AndroidDriver<AndroidElement> driver) throws InterruptedException {
        gender.click();
        PageBase.scrollToViewText(driver,"Male");
    }

    private void setBloodGroup(AndroidDriver<AndroidElement> driver){
        bloodGroup.click();
        PageBase.scrollToViewText(driver,"O-");
//        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"" +
//                "O-\"));").click();
    }

    private void setDivision(AndroidDriver<AndroidElement> driver){
        division.click();
        PageBase.scrollToViewText(driver,"Mymensingh");
//        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"" +
//                "Mymensingh\"));").click();
    }
}
