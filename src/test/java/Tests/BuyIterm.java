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

}
