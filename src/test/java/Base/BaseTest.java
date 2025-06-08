package Base;

import Pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest extends LoginPage {
    protected WebDriver driver;
    protected BasePage bP;
    protected LoginPage lP;
    protected DatLenhPage dL;
    protected OtpPage otp;

    @BeforeClass
    public void SetUp()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        String url = "http://uat.accounts.fpts.com.vn/Login?href=eztrade";
        driver.get(url);
        bP = new BasePage();
        bP.SetDriver(driver);
        lP = new LoginPage();
        dL = new DatLenhPage();
        otp = new OtpPage();
        layWindownHandle();
    }

    @AfterClass
    public void closeTest()
    {
        driver.quit();
    }

}
