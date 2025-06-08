package Pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage{
    private final By usernameField = By.id("txtAccountNo");
    private final By passwordField = By.id("txtPassword");
    private final By loginButton = By.id("btnSubmit");
    private final String actuallUrl = "http://uat.eztrade.fpts.com.vn/MarketWatch?s=";

    public void setUsername(String username)
    {
        setSendkey(usernameField, username);
    }
    public void setPassword(String password)
    {
        setSendkey(passwordField, password);
    }
    public void clickLogin()
    {
        click(loginButton);
    }
    public boolean checkLoginSuccess()
    {
        return findUrl().contains(actuallUrl);
    }


}
