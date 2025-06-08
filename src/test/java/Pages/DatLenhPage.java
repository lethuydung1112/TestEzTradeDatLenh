package Pages;

import org.openqa.selenium.By;

public class DatLenhPage extends BasePage{
 //   private final By trangThaiMuaButton = By.id("tabBuy");
    private final By trangthaiBanButton = By.id("tabSell");
    private final By maCkField = By.id("txtSymbol");
    private final By khoiLuongField = By.id("fixAutoFillChrome112332413");
    private final By giaField = By.id("txtPrice");
    private final By guiLenhBanButton = By.id("btnSellSend");
    private final By guiLenhMua1Button = By.id("btnBuySend");
    private final By guilenh2Button = By.xpath("//button[contains(text(),'Gửi lệnh')]");
    private final By guiLenh3Button = By.id("btnSendOF");
//    private final By lamLaiButton = By.id("btnReset");
    private final By ghiLenhToggleSwitch = By.xpath("//label[@id='switchLabelLCG']//span[@class='slider round']");
    private final By ghilenhToggleOn = By.xpath("//label[@id='switchLabelLCG']//span[@class='slider round']//span[@class='on']");
 //   private final By getGhilenhToggleOff = By.xpath("//label[@id='switchLabelLCG']//span[@class='slider round']//span[@class='off']");
    private final By ghiLenhMuaButton = By.id("btnBuySave");
 //   private final By xoaLenhGhiButton =;
   // private final By guiLenhGhiButton =;
    private final By autoTachKL = By.xpath("//span[@class='slider round sliderKL roundKL']");
    private final By guiTatCaLenhGhiButton = By.id("btnSendAllCookie");
    private final By quanLyDichVuButton = By.xpath("//a[contains(text(),'Quản lý dịch vụ')]");
    private final By lenhTiepNhanMess = By.xpath("//tbody[@id='tbdConfirmOrderForm']//td[@class='tdConfirmOrderFormMess']");
    //private By otpField = By.id("opt-popup-{i}");
    private final By dongLaiButton = By.id("btnBackHome");
    private final By ghiLenhTable = By.xpath("//tbody[@id='tbdLCG']//tr");
    private final By GuiLenhGhiFirst = By.xpath("//tbody[@id='tbdLCG']//tr[1]//td[@class='tbody__send']");
    private final By tiepNhanLenhGhiMess = By.xpath("//tbody[@id='tbdLCG']//tr[1]//span[@class='tbody__noti__s']");
    private final By tiepNhanLenhGhiImg = By.xpath("//img[@src='/images/imgSucceed.png']");
    private final By okSaiGiaButton = By.xpath("//div[@class='jconfirm-buttons']//button[@class='btn btn-blue']");
    private final By ghiLenhBanButton = By.id("btnSellSave");
    private final By kyQuyButton = By.id("tabDatLenhKyQuy");
    private final By autoTachKLOn = By.xpath("//span[@class='slider round sliderKL roundKL']//span[@class='on onKL']");
    public void setMaCk(String text)
    {
        waitToElementVisible(find(maCkField));
        setSendkey(maCkField, text);
    }
    public void setKhoiLuong(String text)
    {
        waitToElementVisible(find(khoiLuongField));
        setSendkey(khoiLuongField, text);
    }
    public void setGiaFields(String text)
    {
        waitToElementVisible(find(giaField));
        setSendkey(giaField, text);
    }
    public void clickGuiLenh1()
    {
        click(guiLenhMua1Button);
    }
    public void clickGuiLenhBan1()
    {
        click(guiLenhBanButton);
    }
    public void clickGuilenh2()
    {
        click(guilenh2Button);
    }

    public void clickGuilenh3()
    {
        click(guiLenh3Button);
    }
    public boolean kiemTraThongBao() {

        waitToElementVisible(find(lenhTiepNhanMess));
        String thongbao = find(lenhTiepNhanMess).getText();
        String actualMess = "Lệnh đã được tiếp nhận thành công";
        System.out.println(thongbao);
        return thongbao.equalsIgnoreCase(actualMess);
        //Assert.assertEquals(thongbao, actualMess, "Thông báo không khớp thông báo mong muốn: " + thongbao);
    }

    public void setOtpField(String text)
    {
        String id = "opt-popup-{i}";
        String[] listOTP = text.split("");
        for(int i = 0; i < 6; i++)
        {
            String idfind = id.replace("{i}", String.valueOf(i+1));
            By otpField = By.id(idfind);
            setSendkey(otpField, listOTP[i]);
        }
    }
    public void clickDongLaiButton()
    {
        click(dongLaiButton);
    }

    public void clickGhiLenhToggleSwitch()
    {
        click(ghiLenhToggleSwitch);
    }
    public void checkGhilenhBat()
    {
        boolean isOn = find(ghilenhToggleOn).isDisplayed();
        if (isOn)
        {
            System.out.println("Nút ghi lệnh đã được bật");
        }
        else
        {
            System.out.println("Nút ghi lệnh chờ gửi chưa được bật và sẽ được bật sau lệnh này");
            click(ghiLenhToggleSwitch);
        }
    }

    public void clickGhiLenhMua()
    {
        click(ghiLenhMuaButton);
    }
    public void clickGhiLenhBan()
    {
        click(ghiLenhBanButton);
    }
    public void clickGuiAll()
    {
        click(guiTatCaLenhGhiButton);
    }
    public void clickGuiTungLenhGhiFirst()
    {
        click(GuiLenhGhiFirst);
//        int rowLenhChoGui = findList(ghiLenhTable).size();
//        for(int i = 1; i < rowLenhChoGui; i++ )
//        {
//
//        }

    }
    public boolean checkMessGuiLenhGhi()
    {
        waitToElementVisible(find(tiepNhanLenhGhiMess));
        String thongbao = find(tiepNhanLenhGhiMess).getText();
        String actualMess = "Lệnh đã được tiếp nhận thành công";
        System.out.println(thongbao);
        return thongbao.equalsIgnoreCase(actualMess);
    }
    public void clickOkSaiGia()
    {
        click(okSaiGiaButton);
    }
    public void clickKyQuyButton()
    {
        click(kyQuyButton);
    }
    public boolean checkImgSuccess(){
        boolean checkImg = find(tiepNhanLenhGhiImg).isDisplayed();
        if(checkImg)
        {
            return  checkImg;
        }
        else {
            System.out.println("Đặt lệnh không thành công");
        }
        return checkImg;
    }
    public void clickTrangThaiBan()
    {
        click(trangthaiBanButton);
    }
    public void checkAutoTachKL()
    {
        boolean tackKlOn = find(autoTachKLOn).isDisplayed();
        if(tackKlOn)
        {
            System.out.println("Tự động tách khối lượng đã được bật");
        }
        else
        {
            System.out.println("Tự động tách khối lượng chưa được bật và sẽ được bật sau lệnh này");
            click(autoTachKL);
        }
    }
}
