package utils.ExtentReports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {
    private static final ExtentReports extentReports = new ExtentReports();

    public synchronized static ExtentReports getExtentReports() {
        ExtentSparkReporter reporter = new ExtentSparkReporter("./Extentreports/ExtentReport.html");
        reporter.config().setReportName("NewApp Dat LenhTest Report");
        extentReports.attachReporter(reporter);
        extentReports.setSystemInfo("Framework", "Appium Java Framework");
        extentReports.setSystemInfo("Author", "Fitthuctap18");
        return extentReports;
    }
}
