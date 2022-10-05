package test_cases;

import org.example.pages.P01_LoginPage;
import org.example.pages.P02_SignUpPage;
import org.example.pages.PageBase;
import org.testng.annotations.Test;

public class TC02_CheckSignUp extends TestBase{

    P01_LoginPage loginPage;
    P02_SignUpPage signUpPage;

    // TODO : create test case to click 'create account button' and fill all data to register new account
    @Test(priority = 1, groups = "smoke", description = "Register New user in the application")
    public void signUpNewUser() throws InterruptedException {
        loginPage=new P01_LoginPage(driver);
        signUpPage=new P02_SignUpPage(driver);
        Thread.sleep(3000);
        driver.hideKeyboard();
        Thread.sleep(3000);
        loginPage.clickCreateAccountButton();
        Thread.sleep(3000);
        driver.hideKeyboard();
        Thread.sleep(3000);
        signUpPage.fillUserData(driver,"Shady Ahmed","+20120319"+PageBase.generateInteger(9999),"Abu Kabir- El Sharkia - Egypt","shady"+PageBase.generateInteger(9999)+"@gmail.com","P@ssw0rd","P@ssw0rd");
        // take screenshot for the registration page
        PageBase.captureScreenshot(driver,"RegistrationPage");
        Thread.sleep(10000);
    }
}
