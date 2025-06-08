package Tests.TKMarMor;

import org.testng.annotations.DataProvider;

import java.lang.reflect.Method;

public class Data_Ban_MarMor {
    @DataProvider(name = "HSX_Sell_MarMor")
    protected static Object[][] stock(Method m) {
        switch (m.getName()) {
            case "TC1_HSX_Sell_LO":
                return new Object[][]
                        {
                                {"DLG", "100", "2.08"}
                        };
            case "TC2_HSX_Sell_ATO":
                return new Object[][]
                        {
                                {"DLG", "100", "ATO"}
                        };
            case "TC3_HSX_Sell_MP":
                return new Object[][]
                        {
                                {"DLG", "100", "MP"}
                        };
            case "TC4_HSX_Sell_ATC":
                return new Object[][]
                        {
                                {"DLG", "100", "ATC"}
                        };
            case "TC5_HSX_Sell_LO_Ghi_GuiAll":
                return new Object[][]
                        {
                                {"DLG", "100", "2.08"}
                        };
            case "TC6_HSX_Sell_ATO_Ghi_GuiAll":
                return new Object[][]
                        {
                                {"DLG", "100", "ATO"}
                        };
            case "TC7_HSX_Sell_MP_Ghi_GuiAll":
                return new Object[][]
                        {
                                {"DLG", "100", "MP"}
                        };
            case "TC8_HSX_Sell_ATC_Ghi_GuiAll":
                return new Object[][]
                        {
                                {"DLG", "100", "ATC"}
                        };
            case "TC9_HSX_Sell_LO_Ghi_GuiTungLenh":
                return new Object[][]
                        {
                                {"DLG", "100", "2.08"}
                        };
            case "TC10_HSX_Sell_ATO_Ghi_GuiTungLenh":
                return new Object[][]
                        {
                                {"DLG", "100", "ATO"}
                        };
            case "TC11_HSX_Sell_MP_Ghi_GuiTungLenh":
                return new Object[][]
                        {
                                {"DLG", "100", "MP"}
                        };
            case "TC12_HSX_Sell_ATC_Ghi_GuiTungLenh":
                return new Object[][]
                        {
                                {"DLG", "100", "ATC"}
                        };
        }
        return null;
    }

    @DataProvider(name = "HNX_LISTED_Sell_MarMor")
    protected static Object[][] stock2(Method m) {
        switch (m.getName()) {
            case "TC13_HNX_LISTED_Sell_LO":
                return new Object[][]
                        {
                                {"PVG", "100", "7.5"}
                        };
            case "TC14_HNX_LISTED_Sell_MP":
                return new Object[][]
                        {
                                {"PVG", "100", "MP"}
                        };
            case "TC15_HNX_LISTED_Sell_MTL":
                return new Object[][]
                        {
                                {"PVG", "100", "MTL"}
                        };
            case "TC16_HNX_LISTED_Sell_MAK":
                return new Object[][]
                        {
                                {"PVG", "100", "MAK"}
                        };
            case "TC17_HNX_LISTED_Sell_MOK":
                return new Object[][]
                        {
                                {"PVG", "100", "MOK"}
                        };
            case "TC18_HNX_LISTED_Sell_ATC":
                return new Object[][]
                        {
                                {"PVG", "100", "ATC"}
                        };
            case "TC19_HNX_LISTED_Sell_LO_GuiAll":
                return new Object[][]
                        {
                                {"PVG", "100", "7.5"}
                        };
            case "TC20_HNX_LISTED_Sell_MP_GuiAll":
                return new Object[][]
                        {
                                {"PVG", "100", "MP"}
                        };
            case "TC21_HNX_LISTED_Sell_MTL_GuiALl":
                return new Object[][]
                        {
                                {"PVG", "100", "MTL"}
                        };
            case "TC22_HNX_LISTED_Sell_MAK_GuiAll":
                return new Object[][]
                        {
                                {"PVG", "100", "MAK"}
                        };
            case "TC23_HNX_LISTED_Sell_MOK_GuiAll":
                return new Object[][]
                        {
                                {"PVG", "100", "MOK"}
                        };
            case "TC24_HNX_LISTED_Sell_ATC_GuiAll":
                return new Object[][]
                        {
                                {"PVG", "100", "ATC"}
                        };
            case "TC25_HNX_LISTED_Sell_LO_GuiTungLenh":
                return new Object[][]
                        {
                                {"PVG", "100", "7.5"}
                        };
            case "TC26_HNX_LISTED_Sell_MP_GuiTungLenh":
                return new Object[][]
                        {
                                {"PVG", "100", "MP"}
                        };
            case "TC27_HNX_LISTED_Sell_MTL_GuiTungLenh":
                return new Object[][]
                        {
                                {"PVG", "100", "MTL"}
                        };
            case "TC28_HNX_LISTED_Sell_MAK_GuiTungLenh":
                return new Object[][]
                        {
                                {"PVG", "100", "MAK"}
                        };
            case "TC29_HNX_LISTED_Sell_MOK_GuiTunglenh":
                return new Object[][]
                        {
                                {"PVG", "100", "MOK"}
                        };
            case "TC30_HNX_LISTED_Sell_ATC_GuiTungLenh":
                return new Object[][]
                        {
                                {"PVG", "100", "ATC"}
                        };
        }
        return null;
    }



}
