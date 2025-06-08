package Tests.TKThuong;
import org.testng.annotations.DataProvider;
import java.lang.reflect.Method;

public class Data_Mua_Thuong {
    @DataProvider(name = "HSX_Buy_Thuong")
    protected static Object[][] stock(Method m) {
        switch (m.getName()) {
            case "TC1_HSX_Buy_LO":
                return new Object[][]
                        {
                                {"SHB", "100", "9.9"}
                        };
            case "TC2_HSX_Buy_ATO":
                return new Object[][]
                        {
                                {"SHB", "100", "ATO"}
                        };
            case "TC3_HSX_Buy_MP":
                return new Object[][]
                        {
                                {"SHB", "100", "MP"}
                        };
            case "TC4_HSX_Buy_ATC":
                return new Object[][]
                        {
                                {"SHB", "100", "ATC"}
                        };
            case "TC5_HSX_Buy_LO_Ghi_GuiAll":
                return new Object[][]
                        {
                                {"SHB", "100", "9.9"}
                        };
            case "TC6_HSX_Buy_ATO_Ghi_GuiAll":
                return new Object[][]
                        {
                                {"SHB", "100", "ATO"}
                        };
            case "TC7_HSX_Buy_MP_Ghi_GuiAll":
                return new Object[][]
                        {
                                {"SHB", "100", "MP"}
                        };
            case "TC8_HSX_Buy_ATC_Ghi_GuiAll":
                return new Object[][]
                        {
                                {"SHB", "100", "ATC"}
                        };
            case "TC9_HSX_Buy_LO_Ghi_GuiTungLenh":
                return new Object[][]
                        {
                                {"SHB", "100", "9.9"}
                        };
            case "TC10_HSX_Buy_ATO_Ghi_GuiTungLenh":
                return new Object[][]
                        {
                                {"SHB", "100", "ATO"}
                        };
            case "TC11_HSX_Buy_MP_Ghi_GuiTungLenh":
                return new Object[][]
                        {
                                {"SHB", "100", "MP"}
                        };
            case "TC12_HSX_Buy_ATC_Ghi_GuiTungLenh":
                return new Object[][]
                        {
                                {"SHB", "100", "ATC"}
                        };
        }
        return null;
    }

    @DataProvider(name = "HNX_LISTED_Buy_thuong")
    protected static Object[][] stock2(Method m) {
        switch (m.getName()) {
            case "TC13_HNX_LISTED_Buy_LO":
                return new Object[][]
                        {
                                {"DVM", "100", "8.1"}
                        };
            case "TC14_HNX_LISTED_Buy_MP":
                return new Object[][]
                        {
                                {"DVM", "100", "MP"}
                        };
            case "TC15_HNX_LISTED_Buy_MTL":
                return new Object[][]
                        {
                                {"DVM", "100", "MTL"}
                        };
            case "TC16_HNX_LISTED_Buy_MAK":
                return new Object[][]
                        {
                                {"DVM", "100", "MAK"}
                        };
            case "TC17_HNX_LISTED_Buy_MOK":
                return new Object[][]
                        {
                                {"DVM", "100", "MOK"}
                        };
            case "TC18_HNX_LISTED_Buy_ATC":
                return new Object[][]
                        {
                                {"DVM", "100", "ATC"}
                        };
            case "TC19_HNX_LISTED_Buy_LO_GuiAll":
                return new Object[][]
                        {
                                {"DVM", "100", "8.1"}
                        };
            case "TC20_HNX_LISTED_Buy_MP_GuiAll":
                return new Object[][]
                        {
                                {"DVM", "100", "MP"}
                        };
            case "TC21_HNX_LISTED_Buy_MTL_GuiALl":
                return new Object[][]
                        {
                                {"DVM", "100", "MTL"}
                        };
            case "TC22_HNX_LISTED_Buy_MAK_GuiAll":
                return new Object[][]
                        {
                                {"DVM", "100", "MAK"}
                        };
            case "TC23_HNX_LISTED_Buy_MOK_GuiAll":
                return new Object[][]
                        {
                                {"DVM", "100", "MOK"}
                        };
            case "TC24_HNX_LISTED_Buy_ATC_GuiAll":
                return new Object[][]
                        {
                                {"DVM", "100", "ATC"}
                        };
            case "TC25_HNX_LISTED_Buy_LO_GuiTungLenh":
                return new Object[][]
                        {
                                {"DVM", "100", "8.1"}
                        };
            case "TC26_HNX_LISTED_Buy_MP_GuiTungLenh":
                return new Object[][]
                        {
                                {"DVM", "100", "MP"}
                        };
            case "TC27_HNX_LISTED_Buy_MTL_GuiTungLenh":
                return new Object[][]
                        {
                                {"DVM", "100", "MTL"}
                        };
            case "TC28_HNX_LISTED_Buy_MAK_GuiTungLenh":
                return new Object[][]
                        {
                                {"DVM", "100", "MAK"}
                        };
            case "TC29_HNX_LISTED_Buy_MOK_GuiTunglenh":
                return new Object[][]
                        {
                                {"DVM", "100", "MOK"}
                        };
            case "TC30_HNX_LISTED_Buy_ATC_GuiTungLenh":
                return new Object[][]
                        {
                                {"DVM", "100", "ATC"}
                        };
        }
        return null;
    }

    @DataProvider(name = "HNX_UPCOM_Buy_thuong")
    protected static Object[][] stock3(Method m) {
        switch(m.getName()) {
            case "TC31_HNX_UPCOM_Buy_LO":
                return new Object[][]
                        {
                                {"AAS", "100", "8.7"}
                        };
            case "TC32_HNX_UPCOM_Buy_LO_GuiAll":
                return new Object[][]
                        {
                                {"AAS", "100", "8.7"}
                        };
            case "TC33_HNX_UPCOM_Buy_LO_GuiTungLenh":
                return new Object[][]
                        {
                                {"AAS", "100", "8.7"}
                        };
        }
        return null;
    }


}
