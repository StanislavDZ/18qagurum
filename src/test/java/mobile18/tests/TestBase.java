package mobile18.tests;

import com.codeborne.selenide.Configuration;
import mobile18.helpers.Attach;
import io.qameta.allure.selenide.AllureSelenide;
import mobile18.drivers.DeviceDriver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.logevents.SelenideLogger.addListener;

public class TestBase {
    private static final String deviceHost = System.getProperty("deviceHost");

    @BeforeAll
    public static void setup() {
        addListener("AllureSelenide", new AllureSelenide());

        Configuration.browser = DeviceDriver.getDeviceDriver(deviceHost);
        Configuration.browserSize = null;
    }

    @BeforeEach
    public void startDriver() {
        open();
    }

    @AfterEach
    public void afterEach() {
        String sessionId = Attach.getSessionId();

        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();

        closeWebDriver();
//        Attach.video(sessionId);
    }
}
