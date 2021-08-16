package tests;

import io.appium.java_client.MobileBy;
import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static io.qameta.allure.Allure.step;

public class BrowserStackAndroidSampleSelenideTest extends TestBase {

    @Test
    @Owner("iignatov")
    @Severity(SeverityLevel.BLOCKER)
    @Tag("UI") @Tag("android")
    @Feature("Search item")
    @Story("Successful search")
    @DisplayName("Check result of successful search")
    void searchSampleTestWithSelenide() {

        step("Go to login page", () -> {
            $(MobileBy.AccessibilityId("Search Wikipedia")).click();
            $(MobileBy.id("org.wikipedia.alpha:id/search_src_text")).sendKeys("BrowserStack");
            $$("android.widget.TextView").shouldHave(sizeGreaterThan(0));
        });
    }
}
