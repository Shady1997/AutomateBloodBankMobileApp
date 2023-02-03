package org.example.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class P03_HomePage {

    public P03_HomePage(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    // TODO: Define Page elements

    @AndroidFindBy(xpath = "//android.widget.ImageButton[@index='0']")
    private WebElement sideImage;

    @AndroidFindBy(xpath = "//android.widget.CheckedTextView[@index='0']")
    private WebElement logout;

    public void signout(AndroidDriver<AndroidElement> driver){
        sideImage.click();
        logout.click();
    }
}
