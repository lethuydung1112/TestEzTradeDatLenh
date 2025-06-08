package Pages;

import org.json.JSONObject;
import org.openqa.selenium.By;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OtpPage extends BasePage{
    public final String urlOtp = "http://10.26.7.58:8080/ui/login";
    public final By usernameOtpField = By.xpath("//input[@placeholder='Username']");
    public final By passwordOtpField = By.xpath("//input[@placeholder='Password']");
    public final By loginOtpButton = By.xpath("//input[@value='Login']");
    public final By searchTypeField = By.id("search");
 //   public final By rowUatSmsOtp = By.xpath("//td[text()='Utility.Sms.Otp.UAT']");
    public String urlNavigateStk = "http://10.26.7.58:8080/ui/kafka-dev/topic/Utility.Sms.Otp.UAT/data?sort=NEWEST&partition=All&searchByKey={clientcode}_C";
    public By jsonOtp = By.id("UNIQUE_ID_OF_DIV");
    public By clickOtp = By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/pre");//public By otpText = By.id("//pre[@class=\"mb-0 khq-data-highlight\"]pre/code");
public void loginOtp( String username, String password)
    {
        waitToElementVisible(find(usernameOtpField));
        waitToElementVisible( find(passwordOtpField));
        setSendkey(usernameOtpField, username);
        setSendkey(passwordOtpField, password);
        click(loginOtpButton);
    }

public void openTabOtp()
    {
        openNewTabWithURL(urlOtp);
    }

    public void navagateOtp(String stk)
    {
        dieuHuongToiURl(urlNavigateStk.replace("{clientcode}", stk));
    }
    public void getJsonOtp()
    {
        find(jsonOtp).getText();
    }
    public void clickGetOtp()
    {
        click(clickOtp);
    }
    public String getOtp() {
        waitToElementVisible(find(clickOtp));
        String text = find(clickOtp).getText();

        JSONObject jsonObject = new JSONObject(text);

        String otpText = jsonObject.getString("SmsOtp");
        String regex = "\\d{6}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(otpText);

        String otp = null;
        if (matcher.find()) {
            otp = matcher.group();
            System.out.println("Otp lấy được là: " + otp);
        }
        else {
            System.out.println("Không tìm thấy otp hợp lệ");
        }
        return otp;
    }



}
