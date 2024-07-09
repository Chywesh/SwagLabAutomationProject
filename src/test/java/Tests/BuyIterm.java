package Tests;

import Utils.ReadFromExcel;
import org.testng.annotations.Test;

public class BuyIterm extends Base{
    @Test
    public void enterUsernameTests() {
        loginPage.enterUsername(ReadFromExcel.username);
    }

    @Test
    public void enterPasswordTests() {
        loginPage.enterPassword(ReadFromExcel.password);
    }

    @Test(dependsOnMethods = {"enterPasswordTests", "enterUsernameTests"})
    public void clickLoginButtonTests() {
        takeScreenShots.takesSnapShot(driver, "Login Page");
        loginPage.clickLoginButton();
    }
    @Test(dependsOnMethods = "clickLoginButtonTests")
    public void verifyLoginSuccessTests() {
        homePage.verifyUserIsOnHomepage();
        takeScreenShots.takesSnapShot(driver, "Home Page");


}
}

