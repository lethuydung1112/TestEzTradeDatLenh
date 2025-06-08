package Tests.TKMarMor;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LenhBanMarMorTest extends BaseTest {
    @BeforeClass
    public void Login()
    {
        lP.setUsername("058C000715");
        lP.setPassword("Fpts@123");
        lP.clickLogin();
        Assert.assertTrue(checkLoginSuccess());
    }

    @Test(dataProvider = "HSX_Sell_MarMor",dataProviderClass = Data_Ban_MarMor.class,priority = 1)
    public void TC1_HSX_Sell_LO(String mack, String khoiluong, String gia) throws InterruptedException {
        String tabDatlLenh = driver.getWindowHandle();
        dL.clickKyQuyButton();
        dL.clickTrangThaiBan();
        dL.checkAutoTachKL();
        dL.setMaCk(mack);
        dL.setKhoiLuong(khoiluong);
        dL.setGiaFields(gia);
        Thread.sleep(1000);
        dL.clickGuiLenhBan1();
        otp.openTabOtp();
        otp.loginOtp("testaccount", "FittEst@123");
        Thread.sleep(2000);
        otp.navagateOtp("058C000715");
        Thread.sleep(2000);
        String otpNumber = otp.getOtp();
        chuyenDoiTab(tabDatlLenh);
        dL.setOtpField(otpNumber);
        Thread.sleep(2000);
        dL.clickGuilenh2();
        boolean check = dL.kiemTraThongBao();
        dL.clickDongLaiButton();
        Assert.assertTrue(check);
        Thread.sleep(6000);
    }
        @Test(dataProvider = "HSX_Sell_MarMor",dataProviderClass = Data_Ban_MarMor.class,priority = 2)
    public void TC2_HSX_Sell_ATO(String mack, String khoiluong, String gia) throws InterruptedException {
        dL.setMaCk(mack);
        dL.setKhoiLuong(khoiluong);
        dL.setGiaFields(gia);
        Thread.sleep(1000);
        dL.clickGuiLenhBan1();
        Thread.sleep(2000);
        dL.clickGuilenh3();
        boolean check = dL.kiemTraThongBao();
        dL.clickDongLaiButton();
        Assert.assertTrue(check);
        Thread.sleep(4000);
    }
    @Test(dataProvider = "HSX_Sell_MarMor",dataProviderClass = Data_Ban_MarMor.class,priority = 2)
    public void TC3_HSX_Sell_MP(String mack, String khoiluong, String gia) throws InterruptedException {
        dL.setMaCk(mack);
        dL.setKhoiLuong(khoiluong);
        dL.setGiaFields(gia);
        Thread.sleep(1000);
        dL.clickGuiLenhBan1();
        Thread.sleep(2000);
        dL.clickGuilenh3();
        boolean check = dL.kiemTraThongBao();
        dL.clickDongLaiButton();
        Assert.assertTrue(check);
    }
    @Test(dataProvider = "HSX_Sell_MarMor",dataProviderClass = Data_Ban_MarMor.class,priority = 2)
    public void TC4_HSX_Sell_ATC(String mack, String khoiluong, String gia) throws InterruptedException {
        dL.setMaCk(mack);
        dL.setKhoiLuong(khoiluong);
        dL.setGiaFields(gia);
        Thread.sleep(1000);
        dL.clickGuiLenhBan1();
        Thread.sleep(2000);
        dL.clickGuilenh3();
        boolean check = dL.kiemTraThongBao();
        dL.clickDongLaiButton();
        Assert.assertTrue(check);
        Thread.sleep(4000);
    }
    @Test(dataProvider = "HSX_Sell_MarMor",dataProviderClass = Data_Ban_MarMor.class,priority = 5)
    public void TC5_HSX_Sell_LO_Ghi_GuiAll(String mack, String khoiluong, String gia) throws InterruptedException {
        dL.clickGhiLenhToggleSwitch();
        dL.checkGhilenhBat();
        dL.setMaCk(mack);
        dL.setKhoiLuong(khoiluong);
        dL.setGiaFields(gia);
        Thread.sleep(1000);
        dL.clickGhiLenhBan();
        Thread.sleep(3000);
    }
    @Test(dataProvider = "HSX_Sell_MarMor",dataProviderClass = Data_Ban_MarMor.class,priority = 6)
    public void TC6_HSX_Sell_ATO_Ghi_GuiAll(String mack, String khoiluong, String gia) throws InterruptedException {
        dL.checkGhilenhBat();
        dL.setMaCk(mack);
        dL.setKhoiLuong(khoiluong);
        dL.setGiaFields(gia);
        Thread.sleep(1000);
        dL.clickGhiLenhBan();
        Thread.sleep(3000);
    }
    @Test(dataProvider = "HSX_Sell_MarMor",dataProviderClass = Data_Ban_MarMor.class,priority = 7)
    public void TC7_HSX_Sell_MP_Ghi_GuiAll(String mack, String khoiluong, String gia) throws InterruptedException {
        dL.checkGhilenhBat();
        dL.setMaCk(mack);
        dL.setKhoiLuong(khoiluong);
        dL.setGiaFields(gia);
        Thread.sleep(1000);
        dL.clickGhiLenhBan();
        Thread.sleep(3000);
    }
    @Test(dataProvider = "HSX_Sell_MarMor",dataProviderClass = Data_Ban_MarMor.class,priority = 8)
    public void TC8_HSX_Sell_ATC_Ghi_GuiAll(String mack, String khoiluong, String gia) throws InterruptedException {
        dL.checkGhilenhBat();
        dL.setMaCk(mack);
        dL.setKhoiLuong(khoiluong);
        dL.setGiaFields(gia);
        Thread.sleep(1000);
        dL.clickGhiLenhBan();
        Thread.sleep(3000);
        dL.clickGuiAll();
        Thread.sleep(4000);
    }
    @Test(dataProvider = "HSX_Sell_MarMor",dataProviderClass = Data_Ban_MarMor.class,priority = 9)
    public void TC9_HSX_Sell_LO_Ghi_GuiTungLenh(String mack, String khoiluong, String gia) throws InterruptedException
    {
        dL.checkGhilenhBat();
        dL.setMaCk(mack);
        dL.setKhoiLuong(khoiluong);
        dL.setGiaFields(gia);
        Thread.sleep(1000);
        dL.clickGhiLenhBan();
        Thread.sleep(2000);
        dL.clickGuiTungLenhGhiFirst();
        Assert.assertTrue(dL.checkImgSuccess());
    }
    @Test(dataProvider = "HSX_Sell_MarMor",dataProviderClass = Data_Ban_MarMor.class,priority = 10)
    public void TC10_HSX_Sell_ATO_Ghi_GuiTungLenh(String mack, String khoiluong, String gia) throws InterruptedException
    {
        dL.checkGhilenhBat();
        dL.setMaCk(mack);
        dL.setKhoiLuong(khoiluong);
        dL.setGiaFields(gia);
        Thread.sleep(1000);
        dL.clickGhiLenhBan();
        Thread.sleep(2000);
        dL.clickGuiTungLenhGhiFirst();
        Assert.assertTrue(dL.checkImgSuccess());
    }
    @Test(dataProvider = "HSX_Sell_MarMor",dataProviderClass = Data_Ban_MarMor.class,priority = 11)
    public void TC11_HSX_Sell_MP_Ghi_GuiTungLenh(String mack, String khoiluong, String gia) throws InterruptedException
    {
        dL.checkGhilenhBat();
        dL.setMaCk(mack);
        dL.setKhoiLuong(khoiluong);
        dL.setGiaFields(gia);
        Thread.sleep(1000);
        dL.clickGhiLenhBan();
        Thread.sleep(2000);
        dL.clickGuiTungLenhGhiFirst();
        Assert.assertTrue(dL.checkImgSuccess());
    }
    @Test(dataProvider = "HSX_Sell_MarMor",dataProviderClass = Data_Ban_MarMor.class,priority = 12)
    public void TC12_HSX_Sell_ATC_Ghi_GuiTungLenh(String mack, String khoiluong, String gia) throws InterruptedException
    {
        dL.checkGhilenhBat();
        dL.setMaCk(mack);
        dL.setKhoiLuong(khoiluong);
        dL.setGiaFields(gia);
        Thread.sleep(1000);
        dL.clickGhiLenhBan();
        Thread.sleep(2000);
        dL.clickGuiTungLenhGhiFirst();
        Assert.assertTrue(dL.checkImgSuccess());
    }
    @Test(dataProvider = "HNX_LISTED_Sell_MarMor",dataProviderClass = Data_Ban_MarMor.class,priority = 13)
    public void TC13_HNX_LISTED_Sell_LO(String mack, String khoiluong, String gia) throws InterruptedException {
        dL.clickGhiLenhToggleSwitch();
        dL.setMaCk(mack);
        dL.setKhoiLuong(khoiluong);
        dL.setGiaFields(gia);
        Thread.sleep(1000);
        dL.clickGuiLenhBan1();
        Thread.sleep(2000);
        dL.clickGuilenh3();
        boolean check = dL.kiemTraThongBao();
        dL.clickDongLaiButton();
        Assert.assertTrue(check);
        Thread.sleep(4000);
    }
    @Test(dataProvider = "HNX_LISTED_Sell_MarMor",dataProviderClass = Data_Ban_MarMor.class,priority = 14)
    public void TC14_HNX_LISTED_Sell_MP(String mack, String khoiluong, String gia) throws InterruptedException {
        dL.setMaCk(mack);
        dL.setKhoiLuong(khoiluong);
        dL.setGiaFields(gia);
        Thread.sleep(1000);
        dL.clickGuiLenhBan1();
        Thread.sleep(2000);
        dL.clickOkSaiGia();
        Thread.sleep(4000);
    }
    @Test(dataProvider = "HNX_LISTED_Sell_MarMor",dataProviderClass = Data_Ban_MarMor.class,priority = 15)
    public void TC15_HNX_LISTED_Sell_MTL(String mack, String khoiluong, String gia) throws InterruptedException {
        dL.setMaCk(mack);
        dL.setKhoiLuong(khoiluong);
        dL.setGiaFields(gia);
        Thread.sleep(1000);
        dL.clickGuiLenhBan1();
        Thread.sleep(2000);
        dL.clickGuilenh3();
        boolean check = dL.kiemTraThongBao();
        dL.clickDongLaiButton();
        Assert.assertTrue(check);
        Thread.sleep(4000);
    }
    @Test(dataProvider = "HNX_LISTED_Sell_MarMor",dataProviderClass = Data_Ban_MarMor.class,priority = 16)
    public void TC16_HNX_LISTED_Sell_MAK(String mack, String khoiluong, String gia) throws InterruptedException {
        dL.setMaCk(mack);
        dL.setKhoiLuong(khoiluong);
        dL.setGiaFields(gia);
        Thread.sleep(1000);
        dL.clickGuiLenhBan1();
        Thread.sleep(2000);
        dL.clickGuilenh3();
        boolean check = dL.kiemTraThongBao();
        dL.clickDongLaiButton();
        Assert.assertTrue(check);
        Thread.sleep(4000);
    }
    @Test(dataProvider = "HNX_LISTED_Sell_MarMor",dataProviderClass = Data_Ban_MarMor.class,priority = 17)
    public void TC17_HNX_LISTED_Sell_MOK(String mack, String khoiluong, String gia) throws InterruptedException {
        dL.setMaCk(mack);
        dL.setKhoiLuong(khoiluong);
        dL.setGiaFields(gia);
        Thread.sleep(1000);
        dL.clickGuiLenhBan1();
        Thread.sleep(2000);
        dL.clickGuilenh3();
        boolean check = dL.kiemTraThongBao();
        dL.clickDongLaiButton();
        Assert.assertTrue(check);
        Thread.sleep(4000);
    }
    @Test(dataProvider = "HNX_LISTED_Sell_MarMor",dataProviderClass = Data_Ban_MarMor.class,priority = 18)
    public void TC18_HNX_LISTED_Sell_ATC(String mack, String khoiluong, String gia) throws InterruptedException {
        dL.setMaCk(mack);
        dL.setKhoiLuong(khoiluong);
        dL.setGiaFields(gia);
        Thread.sleep(1000);
        dL.clickGuiLenhBan1();
        Thread.sleep(2000);
        dL.clickGuilenh3();
        boolean check = dL.kiemTraThongBao();
        dL.clickDongLaiButton();
        Assert.assertTrue(check);
        Thread.sleep(4000);
    }
@Test(dataProvider = "HNX_LISTED_Sell_MarMor",dataProviderClass = Data_Ban_MarMor.class,priority = 19)
public void TC19_HNX_LISTED_Sell_LO_GuiAll(String mack, String khoiluong, String gia) throws InterruptedException {
    dL.clickGhiLenhToggleSwitch();
    dL.checkGhilenhBat();
    dL.setMaCk(mack);
    dL.setKhoiLuong(khoiluong);
    dL.setGiaFields(gia);
    Thread.sleep(1000);
    dL.clickGhiLenhBan();
    Thread.sleep(3000);
}
    @Test(dataProvider = "HNX_LISTED_Sell_MarMor",dataProviderClass = Data_Ban_MarMor.class,priority = 20)
    public void TC20_HNX_LISTED_Sell_MP_GuiAll(String mack, String khoiluong, String gia) throws InterruptedException {
        dL.checkGhilenhBat();
        dL.setMaCk(mack);
        dL.setKhoiLuong(khoiluong);
        dL.setGiaFields(gia);
        Thread.sleep(1000);
        dL.clickGhiLenhBan();
        dL.clickOkSaiGia();
        Thread.sleep(3000);
    }
    @Test(dataProvider = "HNX_LISTED_Sell_MarMor", dataProviderClass = Data_Ban_MarMor.class, priority = 21)
    public void TC21_HNX_LISTED_Sell_MTL_GuiALl(String mack, String khoiluong, String gia) throws InterruptedException {
        dL.checkGhilenhBat();
        dL.setMaCk(mack);
        dL.setKhoiLuong(khoiluong);
        dL.setGiaFields(gia);
        Thread.sleep(1000);
        dL.clickGhiLenhBan();
        Thread.sleep(3000);
    }

    @Test(dataProvider = "HNX_LISTED_Sell_MarMor", dataProviderClass = Data_Ban_MarMor.class, priority = 22)
    public void TC22_HNX_LISTED_Sell_MAK_GuiAll(String mack, String khoiluong, String gia) throws InterruptedException {
        dL.checkGhilenhBat();
        dL.setMaCk(mack);
        dL.setKhoiLuong(khoiluong);
        dL.setGiaFields(gia);
        Thread.sleep(1000);
        dL.clickGhiLenhBan();
        Thread.sleep(3000);
    }

    @Test(dataProvider = "HNX_LISTED_Sell_MarMor", dataProviderClass = Data_Ban_MarMor.class, priority = 23)
    public void TC23_HNX_LISTED_Sell_MOK_GuiAll(String mack, String khoiluong, String gia) throws InterruptedException {
        dL.checkGhilenhBat();
        dL.setMaCk(mack);
        dL.setKhoiLuong(khoiluong);
        dL.setGiaFields(gia);
        Thread.sleep(1000);
        dL.clickGhiLenhBan();
        Thread.sleep(3000);
    }

    @Test(dataProvider = "HNX_LISTED_Sell_MarMor", dataProviderClass = Data_Ban_MarMor.class, priority = 24)
    public void TC24_HNX_LISTED_Sell_ATC_GuiAll(String mack, String khoiluong, String gia) throws InterruptedException {
        dL.checkGhilenhBat();
        dL.setMaCk(mack);
        dL.setKhoiLuong(khoiluong);
        dL.setGiaFields(gia);
        Thread.sleep(1000);
        dL.clickGhiLenhBan();
        Thread.sleep(3000);
        dL.clickGuiAll();
        Thread.sleep(4000);
    }
    @Test(dataProvider = "HNX_LISTED_Sell_MarMor",dataProviderClass = Data_Ban_MarMor.class,priority = 25)
    public void TC25_HNX_LISTED_Sell_LO_GuiTungLenh(String mack, String khoiluong, String gia) throws InterruptedException
    {
        dL.checkGhilenhBat();
        dL.setMaCk(mack);
        dL.setKhoiLuong(khoiluong);
        dL.setGiaFields(gia);
        Thread.sleep(1000);
        dL.clickGhiLenhBan();
        Thread.sleep(2000);
        dL.clickGuiTungLenhGhiFirst();
        Assert.assertTrue(dL.checkImgSuccess());
    }
    @Test(dataProvider = "HNX_LISTED_Sell_MarMor",dataProviderClass = Data_Ban_MarMor.class,priority = 26)
    public void TC26_HNX_LISTED_Sell_MP_GuiTungLenh(String mack, String khoiluong, String gia) throws InterruptedException
    {
        dL.checkGhilenhBat();
        dL.setMaCk(mack);
        dL.setKhoiLuong(khoiluong);
        dL.setGiaFields(gia);
        Thread.sleep(1000);
        dL.clickGhiLenhBan();
        dL.clickOkSaiGia();
        Thread.sleep(2000);
    }
    @Test(dataProvider = "HNX_LISTED_Sell_MarMor",dataProviderClass = Data_Ban_MarMor.class,priority = 27)
    public void TC27_HNX_LISTED_Sell_MTL_GuiTungLenh(String mack, String khoiluong, String gia) throws InterruptedException
    {
        dL.checkGhilenhBat();
        dL.setMaCk(mack);
        dL.setKhoiLuong(khoiluong);
        dL.setGiaFields(gia);
        Thread.sleep(1000);
        dL.clickGhiLenhBan();
        Thread.sleep(2000);
        dL.clickGuiTungLenhGhiFirst();
        Assert.assertTrue(dL.checkImgSuccess());
    }
    @Test(dataProvider = "HNX_LISTED_Sell_MarMor",dataProviderClass = Data_Ban_MarMor.class,priority = 28)
    public void TC28_HNX_LISTED_Sell_MAK_GuiTungLenh(String mack, String khoiluong, String gia) throws InterruptedException
    {
        dL.checkGhilenhBat();
        dL.setMaCk(mack);
        dL.setKhoiLuong(khoiluong);
        dL.setGiaFields(gia);
        Thread.sleep(1000);
        dL.clickGhiLenhBan();
        Thread.sleep(2000);
        dL.clickGuiTungLenhGhiFirst();
        Assert.assertTrue(dL.checkImgSuccess());
    }
    @Test(dataProvider = "HNX_LISTED_Sell_MarMor",dataProviderClass = Data_Ban_MarMor.class,priority = 29)
    public void TC29_HNX_LISTED_Sell_MOK_GuiTunglenh(String mack, String khoiluong, String gia) throws InterruptedException
    {
        dL.checkGhilenhBat();
        dL.setMaCk(mack);
        dL.setKhoiLuong(khoiluong);
        dL.setGiaFields(gia);
        Thread.sleep(1000);
        dL.clickGhiLenhBan();
        Thread.sleep(2000);
        dL.clickGuiTungLenhGhiFirst();
        Assert.assertTrue(dL.checkImgSuccess());
    }
    @Test(dataProvider = "HNX_LISTED_Sell_MarMor",dataProviderClass = Data_Ban_MarMor.class,priority = 30)
    public void TC30_HNX_LISTED_Sell_ATC_GuiTungLenh(String mack, String khoiluong, String gia) throws InterruptedException
    {
        dL.checkGhilenhBat();
        dL.setMaCk(mack);
        dL.setKhoiLuong(khoiluong);
        dL.setGiaFields(gia);
        Thread.sleep(1000);
        dL.clickGhiLenhBan();
        Thread.sleep(2000);
        dL.clickGuiTungLenhGhiFirst();
        Assert.assertTrue(dL.checkImgSuccess());
    }




}
