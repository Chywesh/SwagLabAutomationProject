package Tests;


import Pages.LoginPage;
import Utils.BrowserFactory;
import Utils.ReadFromExcel;
import Utils.Snapshoots;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class Base {
    BrowserFactory browserFactory = new BrowserFactory();

    final WebDriver driver=browserFactory.startBrowser("chrome","https://www.saucedemo.com/");

    LoginPage loginPage = PageFactory.initElements(driver,LoginPage.class);

    Snapshoots takeScreenShots = new Snapshoots();

    ReadFromExcel readFromExcel;

    {
        try {
            readFromExcel = new ReadFromExcel();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

